package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    void addTwoPointsToA(View view)
    {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    void addThreePointsToA(View view)
    {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    void addFreePointsToA(View view)
    {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    void addTwoPointsToB(View view)
    {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    void addThreePointsToB(View view)
    {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    void addFreePointsToB(View view)
    {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    void reset(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
       displayForTeamA(scoreTeamA);
       displayForTeamB(scoreTeamB);
    }

    void displayForTeamA(int number)
    {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a_view);
        scoreView.setText(String.valueOf(number));
    }

    void displayForTeamB(int number)
    {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b_view);
        scoreView.setText(String.valueOf(number));
    }
}
