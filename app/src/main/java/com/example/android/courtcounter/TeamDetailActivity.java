package com.example.android.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamDetailActivity extends AppCompatActivity {

    TextView teamA,teamB;
    ArrayList<UserInput> userInputs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_detail);
        teamA = findViewById(R.id.teamA_tv);
        teamB = findViewById(R.id.teamB_tv);

        userInputs = new ArrayList<>();
        updateTeamDetail();
        updateUserInput();


    }

    private void updateUserInput() {
        userInputs.add(new UserInput("mohan",2));
        userInputs.add(new UserInput("ram",4));
        userInputs.add(new UserInput("ramesh",6));
        userInputs.add(new UserInput("ali",9));
        userInputs.add(new UserInput("sardar",78));
        userInputs.add(new UserInput("pankaj",9));
        userInputs.add(new UserInput("roshan",20));
    }

    public void openScoreBoard(View view) {
        Intent intent = new Intent(this,DynamicTableActivity.class);

        intent.putParcelableArrayListExtra("userInputs",userInputs);
        startActivity(intent);
    }

    void updateTeamDetail(){
        teamA.setText("Team Name: Chennai Super\n\n Captain: Vikas\nGoal Keeper:S Srinivas");
        teamB.setText("Team Name: Kolkata King\n\n Captain: Saurav\nGoal Keeper:Subendu");
    }
}
