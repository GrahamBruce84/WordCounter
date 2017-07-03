package com.example.grahambruce.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText questionEditText;
    TextView answerText;
    Button countButton;
    WordCounter wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText)findViewById(R.id.sentence);
        answerText = (TextView) findViewById(R.id.answerText);
        countButton = (Button) findViewById(R.id.button);
        wordCounter = new WordCounter();
    }

    public void onButtonClicked(View button){
        String question = questionEditText.getText().toString();
        answerText.setText(wordCounter.getWordCount(question));
    }
}
