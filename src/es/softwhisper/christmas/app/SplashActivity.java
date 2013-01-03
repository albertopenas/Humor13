package es.softwhisper.christmas.app;


import es.softwhisper.christmas.app.R;
import es.softwhisper.christmas.view.SnowFallView;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.MotionEvent;

import android.widget.RelativeLayout;

public class SplashActivity extends Activity {
	
    private static final int SPLASH_DURATION_MS = 10000;
    
    private RelativeLayout layout = null;
    private Handler mHandler = new Handler();
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
         
        bindView();     
        mHandler.postDelayed(mEndSplash, SPLASH_DURATION_MS); 
    }

	@Override
    protected void onResume() {
    	super.onResume();
    }
    
	private void bindView() {
		layout = (RelativeLayout) findViewById(R.id.activity_splash_relative_layout);
		SnowFallView snowFallView = new SnowFallView(this);
		layout.addView(snowFallView);
	}
    
	private Runnable mEndSplash = new Runnable() {
        public void run() {
            if (!isFinishing()) {
                mHandler.removeCallbacks(this);       
                startActivity(new Intent(SplashActivity.this, MainTabActivity.class));
                finish();
                
            }
        };
    };

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mEndSplash.run();
        return super.onTouchEvent(event);
    }
}
