package com.example.marias;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Start extends Activity {

    
	MediaPlayer journey;
	private List<String> questionsList;
	private List<String> answersList;
	private Map<String,Boolean> regionsMap;
	private String correctAnswer;
	private int totalGuesses;
	private int correctAnswers;
	private int quessRows;
	private Random random;
	private Handler handler;
	
	private TextView questionTextView;
	private TableLayout buttonTableLayout;
	private TextView answerTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		journey = MediaPlayer.create(Start.this, R.raw.journey);
		journey.start();
		
		questionsList= new ArrayList<String>();
		answersList = new ArrayList<String>();
		regionsMap = new HashMap<String,Boolean>();
		quessRows = 1;
		random = new Random();
		handler = new Handler();
		
		String[]  questionsList = getResources().getStringArray(R.array.questionsList);
		
		
		questionTextView = (TextView) findViewById(R.id.questionTextView);
		buttonTableLayout = (TableLayout)findViewById(R.id.buttonTableLayout);
		answerTextView = (TextView)findViewById(R.id.answer);
		
		questionTextView.setText(questionsList[0]);
		

		
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
