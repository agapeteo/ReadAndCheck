package com.paniov.code;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ReadAndCheckActivity extends Activity implements Constants{
	private Button done;
	private Button pref;
	private TextView dateText;
	private RadioButton rbOt;
	private RadioButton rbNt;
	private EditText bibleText;
	private TextView textCompletedValue;
	private TextView textMissedValue;
	private TextView textWorldValue;
	private Random generator;
	private int rValue;

	IPlan pl;
	int myCompletedDays;
	int myMissedDays;
	int worldCliscks;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        myCompletedDays = 0;
        myMissedDays = 0;
        worldCliscks = 0;
    
        dateText = (TextView)findViewById(R.id.dateText);
        rbOt = (RadioButton)findViewById(R.id.radioOt);
        rbNt = (RadioButton)findViewById(R.id.radioNt);
        bibleText = (EditText)findViewById(R.id.bibleText);
        
        rbOt.setOnClickListener(rb_Click);

        rbNt.setOnClickListener(rb_Click);
        
        done = (Button)findViewById(R.id.buttonDone);
        done.setOnClickListener(done_Click);

        pref = (Button)findViewById(R.id.buttonPref);
        rbOt.setText("OT " + "Genesis 1, 2, 3");
        rbNt.setText("NT " + "Mattew 1");
        
        textCompletedValue = (TextView)findViewById(R.id.textCompletedValue);
        textMissedValue = (TextView)findViewById(R.id.textMissedValue);
        textWorldValue = (TextView)findViewById(R.id.textWorldValue);
        
        pl = new Plan();      
        pl.setPlan1("Here is the OT bible text", "Here is the NT bible text");
        bibleText.setText(pl.getOtBibleText(3));     
        
        generator = new Random();        
    }
    
    OnClickListener rb_Click = new OnClickListener() {	
		@Override
		public void onClick(View v) {
			RadioButton rb = (RadioButton)v;
			if (rb.getId() == rbOt.getId()) {
	            bibleText.setText(pl.getOtBibleText(3));
			} else {
	            bibleText.setText(pl.getNtBibleText(3));
			}
		}
	}; 
	
    OnClickListener done_Click = new OnClickListener() {	
		@Override
		public void onClick(View v) {
			rValue = generator.nextInt(365);
			myCompletedDays += 1;
			textCompletedValue.setText(Integer.toString(myCompletedDays));
			myMissedDays = TOTAL_DAYS - rValue;
			textMissedValue.setText(Integer.toString(myMissedDays));
			textWorldValue.setText(Integer.toString(rValue));
		}
	}; 
}