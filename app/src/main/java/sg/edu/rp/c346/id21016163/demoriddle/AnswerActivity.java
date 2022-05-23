package sg.edu.rp.c346.id21016163.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;
    TextView tvAnswer2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        Log.d("AnswerActivity1", "onCreate() called.");
        if(getIntent().hasExtra("Question")){
            tvAnswer = findViewById(R.id.textView);
            Intent intentReceived = getIntent();
            String questionsSelected = intentReceived.getStringExtra("Question");
            tvAnswer.setText(questionsSelected + " answer is: Queue");

        }else if(getIntent().hasExtra("Question2")){
            tvAnswer2 = findViewById(R.id.textView);
            Intent intentReceived2 = getIntent();
            String questionsSelected2 = intentReceived2.getStringExtra("Question2");
            tvAnswer2.setText(questionsSelected2 + " answer is: Gone");
    }}

    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }
}