package com.codewithvikas.exploring.android;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreBoardActivity extends AppCompatActivity {
    int scoreTeamA = 0,scoreTeamB = 0;

    ScoreViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

        viewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);

        displayScoreTeamA( viewModel.getScoreTeamA());
        displayScoreTeamB( viewModel.getScoreTeamB());

    }

    void displayScoreTeamA(int score){
        TextView scoreViewTeamA  = (TextView) findViewById(R.id.score_team_a);
        scoreViewTeamA.setText(""+score);

    }

    void displayScoreTeamB(int score){
        TextView scoreViewTeamB  = (TextView) findViewById(R.id.score_team_b);
        scoreViewTeamB.setText(""+score);

    }
    public void threePointsTeamA(View view){
            scoreTeamA = scoreTeamA + 3;
            viewModel.setScoreTeamA(scoreTeamA);
        displayScoreTeamA(viewModel.getScoreTeamA());
    }
    public void twoPointsTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        viewModel.setScoreTeamA(scoreTeamA);
        displayScoreTeamA(viewModel.getScoreTeamA());
    }
    public void onePointsTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        viewModel.setScoreTeamA(scoreTeamA);
        displayScoreTeamA(viewModel.getScoreTeamA());
    }
    public void threePointsTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        viewModel.setScoreTeamB(scoreTeamB);
        displayScoreTeamB(viewModel.getScoreTeamB());
    }
    public void twoPointsTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        viewModel.setScoreTeamB(scoreTeamB);
        displayScoreTeamB(viewModel.getScoreTeamB());
    }
    public void onePointsTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        viewModel.setScoreTeamB(scoreTeamB);
        displayScoreTeamB(viewModel.getScoreTeamB());
    }
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        viewModel.setScoreTeamA(0);
        viewModel.setScoreTeamB(0);
        displayScoreTeamA(viewModel.getScoreTeamA());
        displayScoreTeamB(viewModel.getScoreTeamB());
    }

    public void sendScore(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Score Board");
        intent.putExtra(Intent.EXTRA_TEXT,"TeamA: "+scoreTeamA+" TeamB: "+scoreTeamB);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
