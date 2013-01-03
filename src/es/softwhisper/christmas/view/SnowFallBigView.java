package es.softwhisper.christmas.view;

import android.content.Context;

public class SnowFallBigView extends SnowFallView{

	public SnowFallBigView(Context context, int drawable) {
		super(context, drawable);
		snow_flake_count = 10;
		speed = 15;
	}

}
