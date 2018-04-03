package com.example.android.tickettoridescorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int redPlayerScore = 1;
    int greenPlayerScore = 1;

    // display Red's Score
    private void displayRedScore(int redScore) {
        TextView redScoreText = (TextView) findViewById(R.id.red_score_text_view);
        redScoreText.setText("" + redScore);
    }

    // display Green's Score
    private void displayGreenScore(int greenScore) {
        TextView greenScoreText = (TextView) findViewById(R.id.green_score_text_view);
        greenScoreText.setText("" + greenScore);
    }

    // add one to Red's Score for one track
    public void oneTrackRed(View view) {
        redPlayerScore++;
        displayRedScore(redPlayerScore);
    }

    // add two to Red's Score for two tracks
    public void twoTracksRed(View view) {
        redPlayerScore += 2;
        displayRedScore(redPlayerScore);
    }

    // add four to Red's Score for three tracks
    public void threeTracksRed(View view) {
        redPlayerScore += 4;
        displayRedScore(redPlayerScore);
    }

    // add 7 to Red's Score for 4 tracks
    public void fourTracksRed(View view) {
        redPlayerScore += 7;
        displayRedScore(redPlayerScore);
    }

    // add 10 to Red's Score for 5 tracks
    public void fiveTracksRed(View view) {
        redPlayerScore += 10;
        displayRedScore(redPlayerScore);
    }

    // add 15 to Red's Score for 6 tracks
    public void sixTracksRed(View view) {
        redPlayerScore += 15;
        displayRedScore(redPlayerScore);
    }

    // add one to Green's Score for one track
    public void oneTrackGreen(View view) {
        greenPlayerScore++;
        displayGreenScore(greenPlayerScore);
    }

    // add two to Green's Score for two tracks
    public void twoTracksGreen(View view) {
        greenPlayerScore += 2;
        displayGreenScore(greenPlayerScore);
    }

    // add four to Green's Score for three tracks
    public void threeTracksGreen(View view) {
        greenPlayerScore += 4;
        displayGreenScore(greenPlayerScore);
    }

    // add 7 to Green's Score for 4 tracks
    public void fourTracksGreen(View view) {
        greenPlayerScore += 7;
        displayGreenScore(greenPlayerScore);
    }

    // add 10 to Green's Score for 5 tracks
    public void fiveTracksGreen(View view) {
        greenPlayerScore += 10;
        displayGreenScore(greenPlayerScore);
    }

    // add 15 to Green's Score for 6 tracks
    public void sixTracksGreen(View view) {
        greenPlayerScore += 15;
        displayGreenScore(greenPlayerScore);
    }

    //resets both score
    public void resetScores(View view) {
        redPlayerScore = 1;
        greenPlayerScore = 1;
        displayGreenScore(greenPlayerScore);
        displayRedScore(redPlayerScore);
    }
}
