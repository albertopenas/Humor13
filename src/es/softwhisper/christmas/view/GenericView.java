package es.softwhisper.christmas.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;

public abstract class GenericView {
	protected Context context = null;
	protected View view = null;   
	protected Typeface tf = null;
	protected Typeface tfBold = null;

	public GenericView(Context context) {
		this.context = context;
		//tf = Typeface.createFromAsset(context.getAssets(),"fonts/HelveticaNeueLTStd-Lt.otf");
		tf = Typeface.DEFAULT;
		tfBold = Typeface.DEFAULT_BOLD;
	}
	
    /**
     * Returns the view to append to a FrameLayout
     * @return
     */
    public View getView(){
    	return view;
    }
}
