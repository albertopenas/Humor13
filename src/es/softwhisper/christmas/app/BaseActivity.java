package es.softwhisper.christmas.app;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import es.softwhisper.christmas.configuration.Constants;
import es.softwhisper.christmas.shared.MemoryProvider;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;

public abstract class BaseActivity extends Activity{
	protected MemoryProvider mProvider = null;
	protected Context context = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		uiSetupAnimations();
	}
	
	private void uiSetupAnimations() {
		
	}

	protected void shareIntentImage( int position){
		ctrCreateFileOnSd(position);
		Intent intent = new Intent(android.content.Intent.ACTION_SEND);
		intent.setType("image/jpg");	
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
	    intent.putExtra(Intent.EXTRA_TITLE, Constants.TO_MARKET);
	    
	    intent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file:///sdcard/temporary_file.jpg"));
		startActivity(Intent.createChooser(intent, null));
	}
	
	protected void shareIntentString(String text){
		Intent intent=new Intent(android.content.Intent.ACTION_SEND);
		intent.setType("text/plain");
		
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);

		intent.putExtra(Intent.EXTRA_TEXT, text + "\n\n" + Constants.TO_MARKET);

		startActivity(Intent.createChooser(intent, null));
	}
	
	private void ctrCreateFileOnSd(int position){
		AssetManager aManager = context.getAssets();

		BufferedInputStream buf = null;
		Bitmap bitmap = null;
		
		try {
			buf = new BufferedInputStream(aManager.open(mProvider.getPostal(position).getImage()));
			bitmap = BitmapFactory.decodeStream(buf);
		    buf.close();
		} catch (IOException e) {
			e.printStackTrace();
			//postalImageView.setImageDrawable(getResources().getDrawable(R.drawable.img_bg))
		}
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
		File f = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "temporary_file.jpg");
		try {
			f.createNewFile();
			FileOutputStream fo = new FileOutputStream(f);
			fo.write(bytes.toByteArray());
			fo.close();
		} catch (IOException e) {                       
			e.printStackTrace();
		}
		
	}
}
