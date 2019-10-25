package com.example.android.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class TeamDetailActivity extends AppCompatActivity {

    TextView teamA,teamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_detail);
        teamA = findViewById(R.id.teamA_tv);
        teamB = findViewById(R.id.teamB_tv);

        updateTeamDetail();

    }

    public void openScoreBoard(View view) {
        Intent intent = new Intent(this,ScoreBoardActivity.class);
        startActivity(intent);
    }

    void updateTeamDetail(){
        teamA.setText("Team Name: Chennai Super\n\n Captain: Vikas\nGoal Keeper:S Srinivas");
        teamB.setText("Team Name: Kolkata King\n\n Captain: Saurav\nGoal Keeper:Subendu");
    }
}
