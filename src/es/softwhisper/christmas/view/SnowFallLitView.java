package es.softwhisper.christmas.view;

import android.content.Context;

public class SnowFallLitView extends SnowFallView{

	public SnowFallLitView(Context context, int drawable) {
		super(context, drawable);
		snow_flake_count = 40
				;
		speed = 25;
	}

}
