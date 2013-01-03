package es.softwhisper.christmas.app;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import es.softwhisper.christmas.app.R;
import es.softwhisper.christmas.configuration.Constants;
import es.softwhisper.christmas.shared.MemoryProvider;
import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PostalActivity extends BaseActivity{	
	private AssetManager aManager = null;
	private ImageView postalImageView = null;
	private int position;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_postal);
		
		getIntentParameters();
		bindView();
		initComponents();
	}
	
	private void bindView() {
		postalImageView = (ImageView) findViewById(R.id.postal_imageview);
	}

	private void initComponents() {
		context = this;
		mProvider = (MemoryProvider) this.getApplicationContext();
		aManager = this.getAssets();		
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		setImage();
	}
	
	private void setImage() {
		BufferedInputStream buf = null;
		Bitmap bitmap = null;
		try {
			buf = new BufferedInputStream(aManager.open(mProvider.getPostal(position).getImage()));
			bitmap = BitmapFactory.decodeStream(buf);
		    buf.close();
		    postalImageView.setImageBitmap(bitmap);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	public void processButtons(View view){
		switch (view.getId()) {
			case R.id.postal_share_button:
				shareIntentImage(position);
				break;
		}
	}
	
	
	private void getIntentParameters() {
		position = getIntent().getIntExtra(Constants.POSITION, -1);
	}
}
