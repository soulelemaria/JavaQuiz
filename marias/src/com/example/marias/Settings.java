package com.example.marias;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends Activity{
	
	Button buttonSound,HomeButton,timerButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
	}
	
}
