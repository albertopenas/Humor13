package es.softwhisper.christmas.adapter;

import es.softwhisper.christmas.app.R;
import es.softwhisper.christmas.shared.MemoryProvider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class JokeAdapter extends BaseAdapter{
	
	private Context context = null;
	private MemoryProvider mProvider = null;
	
	public JokeAdapter(Context context) {
		this.context = context;
		this.mProvider = ((MemoryProvider)context.getApplicationContext());
	}

	public int getCount() {
		return ((MemoryProvider)context.getApplicationContext()).getJokesSize();
	}

	public Object getItem(int arg0) {
		return null;
	}

	public long getItemId(int arg0) {
		return 0;
	}

	public View getView(int position, View arg1, ViewGroup arg2) {	
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.row_listview_joke, null);
		TextView title = (TextView) v.findViewById(R.id.textview_title);
		TextView type = (TextView) v.findViewById(R.id.textview_type);
		
		if (mProvider != null && mProvider.getJoke(position) != null){
			title.setText(mProvider.getJoke(position).getTitle());
			type.setText(mProvider.getJoke(position).getType());
		}
		return v;
	}
}
