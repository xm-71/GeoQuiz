package edu.iupui.jamcanno.geoquiz;

/**
 * Created by alexc on 1/16/2017.
 */


public class TrueFalse {

    private int mQuestion;

    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion){

    mQuestion=question;
    mTrueQuestion=trueQuestion;
}
    public int getQuestion(){
        return mQuestion;
    }

    public void setQuestion(int question){
        mQuestion = question;
    }
    public boolean isTrueQuestion(){
        return mTrueQuestion;
    }
    public void setTrueQuestion(boolean trueQuestion){
        mTrueQuestion = trueQuestion;
    }
}
