package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int teamA=0,teamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void add3PointsToA(View view){
        teamA+=3;
        displayAScore(teamA);
    }
    private void add3PointsToB(View view){
        teamB+=3;
        displayAScore(teamB);
    }
    private void add2PointsToA(View view){
        teamA+=2;
        displayAScore(teamA);
    }
    private void add2PointsToB(View view){
        teamB+=2;
        displayAScore(teamB);
    }
    private void add1PointsToA(View view){
        teamA+=1;
        displayAScore(teamA);
    }
    private void add1PointsToB(View view){
        teamB+=1;
        displayAScore(teamB);
    }
    private void reset(View view){
        teamA=0;
        teamB=0;
    }


    private void displayAScore(int points){
        TextView score = (TextView) findViewById(R.id.TeamAScore);
        score.setText(String.valueOf(points));
    }
    private void displayBScore(int points){
        TextView score = (TextView) findViewById(R.id.TeamBScore);
        score.setText(String.valueOf(points));
    }
}