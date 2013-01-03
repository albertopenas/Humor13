package es.softwhisper.christmas.app;

import es.softwhisper.christmas.app.R;
import es.softwhisper.christmas.adapter.MediaAdapter;
import es.softwhisper.christmas.configuration.Constants;
import es.softwhisper.christmas.view.MessageDialogView;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MediaListViewActivity  extends ListActivity implements OnItemClickListener{
	
	//Activity
	private ListView listview = null;
	private MediaAdapter adapter = null;
	private RelativeLayout dialog = null;
	private Context context = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview);
	
		bindView();
		initListview();
	}
	
	private void bindView() {
		context = this;
		dialog = (RelativeLayout) findViewById(R.id.dialog_layout);
	}

	private void initListview() {
		listview = getListView();
		adapter = new MediaAdapter(this);
		listview.setAdapter(adapter);
		listview.setClickable(true);
		listview.setOnItemClickListener(this);
	}

	private boolean isConnAvaliable(){
		 ConnectivityManager connectivityManager  = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		 NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
		 return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
	}
	
	/**
     * Shows a custom dialog with a message
     * @param title
     * @param content
     */
	protected void showAlertDialog(String title, String content) {
		if (content == null)
			 content = new String("...");

		final MessageDialogView mdv = new MessageDialogView(context, title, content);

		dialog.addView(mdv.getView());	
		dialog.setVisibility(View.VISIBLE);
		dialog.startAnimation(AnimationUtils.makeInAnimation(context, true));
		Button b = ((Button)mdv.getView().findViewById(R.id.dialog_generic_button));

		b.setOnClickListener(new Button.OnClickListener() {
			
			public void onClick(View v) {
				Animation out = AnimationUtils.makeOutAnimation(context, true);	
				out.setAnimationListener(new AnimationListener() {	
					public void onAnimationStart(Animation animation) {
					}
					public void onAnimationRepeat(Animation animation) {
					}
					public void onAnimationEnd(Animation animation) {
						dialog.setVisibility(View.GONE);
						dialog.removeView(mdv.getView());							
					}
				});
				dialog.startAnimation(out);				
			}
		});
	}
	
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		if (isConnAvaliable()){
			Intent intent = new Intent(this, MediaActivity.class);
			intent.putExtra(Constants.POSITION, position);
			startActivity(intent);
		}else{
			showAlertDialog("ÁAtenci—n!", "La conexi—n de red no est‡ disponible.");
		}
		
	}
	
	public void processButtons(View view){
		
	}
}
