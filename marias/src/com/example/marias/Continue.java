package com.example.marias;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Continue extends Activity{


	MediaPlayer journey;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		journey = MediaPlayer.create(Continue.this, R.raw.journey);
		journey.start();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		journey.release();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		journey.release();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		journey.start();
	}


}
