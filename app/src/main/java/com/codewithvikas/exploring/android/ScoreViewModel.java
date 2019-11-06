package com.codewithvikas.exploring.android;


import android.arch.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    //Track Score Team A
    private int scoreTeamA = 0;

    //Track Score Team B
    private int scoreTeamB = 0;

    public int getScoreTeamA() {
        return scoreTeamA;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }
}
