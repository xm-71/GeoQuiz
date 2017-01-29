package edu.iupui.jamcanno.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CheatActivity extends Activity {

    public static final String EXTRA_ANSWER_IS_TRUE = "edu.iupui.jamcannno.geoquiz.answer_is_true";
    public static final String EXTRA_ANSWER_SHOWN = "edu.iupui.jamcannno.geoquiz.answer_is_true";


    private boolean mAnswerIsTrue;

    private TextView mAnswerTextView;
    private Button mShowAnswer;

    private void setShownAnswerResult(boolean isAnswerShown){
        Intent data = new Intent();
        data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);

        setResult(RESULT_OK, data);


    }


        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_cheat);

            mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

            mAnswerTextView = (TextView)findViewById(R.id.showAnswerButton);

            //answer will bot be shown until the user

            //presses the button

            setShownAnswerResult(false);

            mShowAnswer = (Button)findViewById(R.id.showAnswerButton);

            mShowAnswer.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    if (mAnswerIsTrue) {
                        mAnswerTextView.setText(R.string.true_button);
                    } else {
                        mAnswerTextView.setText(R.string.false_button);
                    }

                    setShownAnswerResult(true);
                }


            });

        }

    }


