package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamScoreA=0;
    int teamScoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeTeamA(View view)
    {   teamScoreA=teamScoreA+3;
        displayForTeamA(teamScoreA);
    }

    public void addTwoTeamA(View view)
    {  teamScoreA=teamScoreA+2;
        displayForTeamA(teamScoreA);
    }

    public void addOneTeamA(View view)
    {   teamScoreA++;
        displayForTeamA(teamScoreA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeTeamB(View view)
    {   teamScoreB=teamScoreB+3;
        displayForTeamB(teamScoreB);
    }

    public void addTwoTeamB(View view)
    {  teamScoreB=teamScoreB+2;
        displayForTeamB(teamScoreB);
    }

    public void addOneTeamB(View view)
    {   teamScoreB++;
        displayForTeamB(teamScoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        displayForTeamA(0);
        displayForTeamB(0);
    }
}