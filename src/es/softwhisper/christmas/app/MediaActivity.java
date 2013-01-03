package es.softwhisper.christmas.app;


import es.softwhisper.christmas.app.R;
import es.softwhisper.christmas.configuration.Constants;
import es.softwhisper.christmas.shared.MemoryProvider;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;


public class MediaActivity extends BaseActivity{
	private VideoView myVideoView = null;
	private String url = null;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_player);
	
		bindView();
		getIntentParams();
		configVideo();
		startVideo();
	}
	
	private void startVideo() {
		myVideoView.requestFocus();				
	}

	private void configVideo() {
		myVideoView.setVideoURI(Uri.parse(url));
		myVideoView.setMediaController(new MediaController(this));
	}

	private void getIntentParams() {
		int position = getIntent().getIntExtra(Constants.POSITION, -1);
		if (position != -1 && ((MemoryProvider)getApplication()).getMedia(position) != null)
			url = ((MemoryProvider)getApplication()).getMedia(position).getUrl();
		
	}

	private void bindView() {
		myVideoView = (VideoView)findViewById(R.id.myvideoview);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		if (!myVideoView.isPlaying()){
			myVideoView.start();
		}
	}
	
	public void processButtons(View view){
		switch (view.getId()) {
			case R.id.video_share_button:
				shareIntentString(url);
				break;
		}
	}
}
