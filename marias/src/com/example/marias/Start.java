package com.example.marias;



import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.example.marias.DbHelper;
import com.example.marias.Question;
//import com.example.marias.Start;
import com.example.marias.R;
import com.example.marias.ResultActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;

public class Start extends Activity {

    
	MediaPlayer journey;
/*	private List<String> questionsList;
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
	private TextView answerTextView;           */
	
	List<Question> quesList;
	int score=0;
	int qid=0;
	Question currentQ;
	TextView txtQuestion;
	RadioButton rda, rdb, rdc;
	Button butNext;
	//
	int availableQuestions; // Questions 0 till (askable - 1) can be asked
	Random random = new Random();
	//
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		

		journey = MediaPlayer.create(Start.this, R.raw.journey);
		journey.start();
		
		DbHelper db=new DbHelper(this);
		quesList=db.getAllQuestions();
	//	currentQ=quesList.get(qid);
		currentQ = pickQuestion();
		//
		txtQuestion=(TextView)findViewById(R.id.textView1);
		rda=(RadioButton)findViewById(R.id.radio0);
		rdb=(RadioButton)findViewById(R.id.radio1);
		rdc=(RadioButton)findViewById(R.id.radio2);
		butNext=(Button)findViewById(R.id.button1);
		
		setQuestionView();
		butNext.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				RadioGroup grp=(RadioGroup)findViewById(R.id.radioGroup1);
				RadioButton answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());
				Log.d("yourans", currentQ.getANSWER()+" "+answer.getText());
				if(currentQ.getANSWER().equals(answer.getText()))
				{
					score++;
					Log.d("score", "Your score"+score);
				}
				if(qid<5 ){					
					currentQ=quesList.get(qid);
					setQuestionView();
				}else{
					Intent intent = new Intent(Start.this, ResultActivity.class);
					Bundle b = new Bundle();
					b.putInt("score", score); //Your score
					intent.putExtras(b); //Put your score to your next Intent
					startActivity(intent);
					finish();
				}
			}
		});
		
		
	}  //τέλος onCreate
//
	private Question pickQuestion() {
		Collections.shuffle(quesList);
		int counter=1;
		availableQuestions = quesList.size();
	while(counter <= availableQuestions )
		  {
		   currentQ = quesList.get(qid);
		   counter++;
			}
		
		return currentQ;
	}
//
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_quiz, menu);
		return true;
	}


	private void setQuestionView() {
		
		txtQuestion.setText(currentQ.getQUESTION());
		rda.setText(currentQ.getOPTA());
		rdb.setText(currentQ.getOPTB());
		rdc.setText(currentQ.getOPTC());
		qid++;
		
	}

	

	
} //end of Start Activity
