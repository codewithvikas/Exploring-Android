
package com.codewithvikas.exploring.android;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreViewModelTest {
    @Test
    public void it_should_set_and_get_score_teamA() {
        // Given
        ScoreViewModel view = new ScoreViewModel();
        view.setScoreTeamA(61);

        // When
        int expectedScore =view.getScoreTeamA();

        // Then
        assertEquals(expectedScore, 61);
    }

    @Test
    public void it_should_set_and_get_score_teamB() {
        // Given
        ScoreViewModel view = new ScoreViewModel();
        view.setScoreTeamB(55);

        // When
        int expectedScore =view.getScoreTeamB();

        // Then
        assertEquals(expectedScore, 55);
    }
}