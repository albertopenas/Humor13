package es.softwhisper.christmas.adapter;

import java.io.BufferedInputStream;
import java.io.IOException;

import es.softwhisper.christmas.app.R;
import es.softwhisper.christmas.shared.MemoryProvider;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PostalAdapter extends BaseAdapter {
	
	private Context context = null;
	private MemoryProvider mProvider = null;
	private static RotateAnimation rotateAnimation = null;

	public PostalAdapter(Context context) {
		this.context = context;
		this.mProvider = (MemoryProvider) context.getApplicationContext();
		if (rotateAnimation == null){
			rotateAnimation = new RotateAnimation(0f, 360f,Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,0.5f);
			rotateAnimation.setInterpolator(new LinearInterpolator());
			rotateAnimation.setDuration(1500);
			rotateAnimation.setFillEnabled(true);
			rotateAnimation.setRepeatCount(Animation.INFINITE);
			rotateAnimation.setFillAfter(true);
		}
		rotateAnimation.reset();
	}

	public int getCount() {
		return mProvider.getPostalSize();
	}

	public Object getItem(int arg0) {
		return null;
	}

	public long getItemId(int arg0) {
		return 0;
	}

	public View getView(int position, View arg1, ViewGroup arg2) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.row_listview_postal, null);
		TextView title = (TextView) v.findViewById(R.id.textview_title);
		TextView cat = (TextView) v.findViewById(R.id.textview_category);
		ImageView image = (ImageView) v.findViewById(R.id.postal_thumbnail);

		if (mProvider != null && mProvider.getPostal(position) != null) {
			title.setText(mProvider.getPostal(position).getTitle());
			cat.setText(mProvider.getPostal(position).getCategory());
			image.setAnimation(rotateAnimation);
			
			AssetManager aManager = null;
			BufferedInputStream buf = null;
			Bitmap bitmap = null;
			try {
				aManager = context.getAssets();
				buf = new BufferedInputStream(aManager.open("thumbnail_"+mProvider.getPostal(position).getImage()));
				bitmap = BitmapFactory.decodeStream(buf);
				buf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			image.setAnimation(null);
			if (bitmap != null){
				image.setImageBitmap(bitmap);
			}else{
				image.setImageDrawable(context.getResources().getDrawable(R.drawable.img_fail_loading));
			}
			
		}
		return v;
	}

}
