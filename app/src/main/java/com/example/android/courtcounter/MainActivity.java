package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    String resultA="";
    String resultB="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void showResultA(String text){
        TextView result= (TextView) findViewById(R.id.resultA);
        result.setText(text);
    }
    public void showResultB(String text){
        TextView result= (TextView) findViewById(R.id.resultB);
        result.setText(text);
    }

    public void show3PointsA(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void show2PointsA(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void showFreeThrowA(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    public void show3PointsB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void show2PointsB(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void showFreeThrowB(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        showResultA(resultA);
        showResultB(resultB);
    }

    public void finalResult(View view){
        if(scoreA>scoreB)
        {
            resultA="WON!!";
            showResultA(resultA);
            resultA="";
        }
        else if(scoreB>scoreA)
        {
            resultB="WON!!";
            showResultB(resultB);
            resultB="";
        }
        else
        {
            resultA="DRAW";
            resultB="DRAW";
            showResultA(resultA);
            showResultB(resultB);
            resultA="";
            resultB="";
        }
    }

}