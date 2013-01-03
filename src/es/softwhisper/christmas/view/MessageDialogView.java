package es.softwhisper.christmas.view;

import es.softwhisper.christmas.app.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;

public class MessageDialogView extends GenericView {
	
	public MessageDialogView(Context context, String title, String content) {
		super(context);
		initView(context, title, content);
	}

	private void initView(Context context, String title, String content){
		final LayoutInflater  inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.dialog,null);
        
        ((TextView)view.findViewById(R.id.dialog_generic_title_textview)).setText(title);
        ((TextView)view.findViewById(R.id.dialog_generic_title_textview)).setTypeface(tf);
        
        ((TextView)view.findViewById(R.id.dialog_generic_content_textview)).setText(content);
        ((TextView)view.findViewById(R.id.dialog_generic_content_textview)).setTypeface(tf);

        ((Button)view.findViewById(R.id.dialog_generic_button)).setTypeface(tf);     
	}


	
	
	

}
