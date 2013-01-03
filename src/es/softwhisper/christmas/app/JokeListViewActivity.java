package es.softwhisper.christmas.app;

import es.softwhisper.christmas.app.R;
import es.softwhisper.christmas.adapter.JokeAdapter;
import es.softwhisper.christmas.configuration.Constants;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class JokeListViewActivity  extends ListActivity implements OnItemClickListener{
	
	//Activity
	private ListView listview = null;
	private JokeAdapter adapter = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview);
	
		initListview();
	}
	
	private void initListview() {
		listview = getListView();
		adapter = new JokeAdapter(this);
		listview.setAdapter(adapter);
		listview.setClickable(true);
		listview.setOnItemClickListener(this);
	}

	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {	
		Intent intent = new Intent(this, JokeActivity.class);
		intent.putExtra(Constants.POSITION, position);
		startActivity(intent);
	}
}
