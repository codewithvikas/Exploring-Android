
package com.example.android.courtcounter;

import android.arch.lifecycle.ViewModelProviders;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SourceViewModelTest {
    @Test
    public void it_should_set_and_get_score_teamA() {
        // Given
        SourceViewModel view = new SourceViewModel();
        view.setScoreTeamA(61);

        // When
        int expectedScore =view.getScoreTeamA();

        // Then
        assertEquals(expectedScore, 61);
    }

    @Test
    public void it_should_set_and_get_score_teamB() {
        // Given
        SourceViewModel view = new SourceViewModel();
        view.setScoreTeamB(55);

        // When
        int expectedScore =view.getScoreTeamB();

        // Then
        assertEquals(expectedScore, 55);
    }
}