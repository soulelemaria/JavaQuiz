package com.example.marias;




import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

	
	int counter;
	Button add,sub;
	TextView display;
	MediaPlayer journey;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		journey = MediaPlayer.create(MainActivity.this, R.raw.journey);
		journey.start();
		
		counter=0;
		add=(Button)findViewById(R.id.bAdd);
		sub=(Button)findViewById(R.id.bSub);
		display=(TextView)findViewById(R.id.tvDisplay);
		
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++ ;
				display.setText("Your total is..."+counter);
			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter-- ;
				display.setText("Your total is..."+counter);
			}
		});

	}
	
	
	
	
        
    }
    

