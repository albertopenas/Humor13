package es.softwhisper.christmas.app;

import es.softwhisper.christmas.app.R;
import es.softwhisper.christmas.configuration.Constants;
import es.softwhisper.christmas.model.JokeModel;
import es.softwhisper.christmas.shared.MemoryProvider;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JokeActivity extends BaseActivity {
	private TextView titleTextView = null;
	private TextView typeTextView = null;
	private TextView contentTextView = null;
	
	private int position;
	
	private JokeModel jokeModel = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_joke);
		bindView();
		getIntentParameters();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		initUI();
	}

	
	private void getIntentParameters() {
		position = this.getIntent().getIntExtra(Constants.POSITION,-1);
		if (position != - 1){
			jokeModel = mProvider.getJoke(position);
		}
	}


	private void initUI() {
		if (jokeModel != null){
			titleTextView.setText(jokeModel.getTitle());
			typeTextView.setText(jokeModel.getType());
			contentTextView.setText(jokeModel.getPhrase());
		}
	}


	private void bindView() {
		context = this;
		mProvider = ((MemoryProvider)context.getApplicationContext());
		titleTextView = (TextView) findViewById(R.id.joke_title_textView);
		typeTextView = (TextView) findViewById(R.id.joke_type_textView);
		contentTextView = (TextView) findViewById(R.id.joke_content_textView);
	}


	public void processButtons(View view){
		switch (view.getId()) {
		
			case R.id.joke_share_button:
				if (jokeModel != null){
					shareIntentString(jokeModel.getPhrase());
				}
				break;
		}
	}
}
