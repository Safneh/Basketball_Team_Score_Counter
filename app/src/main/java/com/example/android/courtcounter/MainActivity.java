package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int scoreTeamA = 0;
    public int scoreTeamB = 0;
    public final int FREE_THROW = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayA(int scoreTeamA){
        TextView scoretextview = findViewById(R.id.scoreTeamA_text_view);
        scoretextview.setText(""+(scoreTeamA));
    }

    public void displayB(int scoreTeamB){
        TextView scoretextview = findViewById(R.id.scoreTeamB_text_view);
        scoretextview.setText(""+(scoreTeamB));
    }
    public void addthreepointsA(View view){
        scoreTeamA = scoreTeamA+3;
        displayA(scoreTeamA);
    }

    public void addTwopointsA(View view){
        scoreTeamA = scoreTeamA+2;
        displayA(scoreTeamA);
    }

    public void freethrowA(View view){
        scoreTeamA +=FREE_THROW;
        displayA(scoreTeamA);
    }

    public void addthreepointsB(View view){
        scoreTeamB = scoreTeamB+3;
        displayB(scoreTeamB);
    }

    public void addTwopointsB(View view){
        scoreTeamB = scoreTeamB+2;
        displayB(scoreTeamB);
    }

    public void freethrowB(View view){
        scoreTeamB +=FREE_THROW;
        displayB(scoreTeamB);
    }

    public void ResetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayA(scoreTeamA);
        displayB(scoreTeamB);
    }
}