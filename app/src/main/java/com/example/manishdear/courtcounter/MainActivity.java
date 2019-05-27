package com.example.manishdear.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA =0;
    int scoreB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    //for team A

    public void threepointsforA(View v) {
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void twopointsforA(View v) {
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void freepointforA(View v) {
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    //fro team B

    public void threepointsforB(View v) {
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void twopointsforB(View v) {
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void freepointforB(View v) {
        scoreB+=1;
        displayForTeamB(scoreB);
    }

    //For Reset

    public void reset(View v) {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
