package com.example.marias;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Settings extends Activity{
	
	Button buttonSound,HomeButton,timerButton;
	MediaPlayer journey;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		buttonSound=(ToggleButton)findViewById(R.id.buttonSound);
	
	ToggleButton b = (ToggleButton) findViewById(R.id.buttonSound);
	
	    }
	public void onToggleClicked(View view) {
	    // Is the toggle on?
	    boolean on = ((ToggleButton) view).isChecked();
	    
	    if (on) {
	        journey.start();
	    } else {
	        journey.release();
	    }
	}
	    }   

