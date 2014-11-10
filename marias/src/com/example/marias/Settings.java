package com.example.marias;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Settings extends Activity{
	
	ToggleButton buttonSound,timerButton;
	MediaPlayer journey;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		journey = MediaPlayer.create(Settings.this, R.raw.journey);
		
		
		buttonSound=(ToggleButton)findViewById(R.id.buttonSound);
		buttonSound.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			       if (journey.isPlaying()) {
			       // The toggle is enabled
			          
			          
			       } else {
			       // The toggle is disabled
			         
			          
			       }
			    }
			});
		
	}
}