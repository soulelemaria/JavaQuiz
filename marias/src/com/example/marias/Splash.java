package com.example.marias;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	
	MediaPlayer openningTune;
	
	protected void onCreate(Bundle mariaLovesPuppies) {
		// TODO Auto-generated method stub
		super.onCreate(mariaLovesPuppies);
		setContentView(R.layout.splash);
		
		openningTune = MediaPlayer.create(Splash.this, R.raw.tantan);
		openningTune.start();

		Thread timer = new Thread() {

			@Override
			public void run() {
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				} finally {
                           Intent openMainActivity = new Intent("android.intent.action.MENU");
                           startActivity(openMainActivity);
				}
			}

		};

		timer.start();

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		openningTune.release();
		finish();  //splash activity destroys itself once put behind the main activity
	}
	

}
