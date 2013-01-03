package es.softwhisper.christmas.app;


import es.softwhisper.christmas.app.R;
import es.softwhisper.christmas.view.SnowFallBigView;
import es.softwhisper.christmas.view.SnowFallLitView;
import es.softwhisper.christmas.view.SnowFallMidView;
import es.softwhisper.christmas.view.SnowFallView;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainTabActivity extends TabActivity {

	
	private  TabHost tabs = null;
	private RelativeLayout layout = null;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabview);
        
        initTab();
        bindView();
    }
    
	private void bindView() {
		layout = (RelativeLayout)findViewById(R.id.layout_snowfall); 	
		SnowFallView snowFallBig = new SnowFallBigView(this, R.drawable.copos_grandes);
    	SnowFallView snowFallMid = new SnowFallMidView(this, R.drawable.copos_medios);
    	SnowFallView snowFallLit = new SnowFallLitView(this, R.drawable.copos_pequennos);
    	layout.addView(snowFallBig);
    	layout.addView(snowFallMid);
    	layout.addView(snowFallLit);
	}
    
	private void initTab() {
    	
        tabs = getTabHost();
        Intent intent = null;
    	
        TabSpec tspec1 = tabs.newTabSpec(getResources().getString(R.string.label_imagesvideos));
        intent = new Intent(this, MediaListViewActivity.class);
        tspec1.setContent(intent);
        tspec1.setIndicator(getResources().getString(R.string.label_imagesvideos), getResources().getDrawable(R.drawable.ic_tab_media));
        tabs.addTab(tspec1);
        
        
        TabSpec tspec2 = tabs.newTabSpec(getResources().getString(R.string.label_jokes));
        tspec2.setIndicator(getResources().getString(R.string.label_jokes), getResources().getDrawable(R.drawable.ic_tab_joke));
        intent = new Intent(this, JokeListViewActivity.class);
        tspec2.setContent(intent);
        tabs.addTab(tspec2);
        
        TabSpec tspec3 = tabs.newTabSpec(getResources().getString(R.string.label_postals));
        tspec3.setIndicator(getResources().getString(R.string.label_postals), getResources().getDrawable(R.drawable.ic_tab_postal));
        intent = new Intent(this, PostalListViewActivity.class);
        tspec3.setContent(intent);
        tabs.addTab(tspec3);
        
        /*
        TabSpec tspec4 = tabs.newTabSpec(getResources().getString(R.string.label_softwhisper));
        tspec4.setIndicator(getResources().getString(R.string.label_softwhisper), getResources().getDrawable(R.drawable.ic_tab_softwhisper));
        intent = new Intent(this, SoftWhisperActivity.class);
        tspec4.setContent(intent);
        tabs.addTab(tspec4);
        */
        tabs.setCurrentTab(0);
        
	}
}