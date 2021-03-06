package com.example.android.tickettoridescorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int redPlayerScore = 1;
    static int greenPlayerScore = 1;
    static int bluePlayerScore = 1;
    static int yellowPlayerScore = 1;
    static int blackPlayerScore = 1;

    private int red;
    private TextView redTextView;
    private TextView greenTextView;
    private TextView blueTextView;
    private TextView yellowTextView;
    private TextView blackTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redTextView = findViewById(R.id.red_score_text_view);
        greenTextView = findViewById(R.id.green_score_text_view);
        blueTextView = findViewById(R.id.blue_score_text_view);
        yellowTextView = findViewById(R.id.yellow_score_text_view);
        blackTextView = findViewById(R.id.black_score_text_view);
    }


    // display Red's Score
    private void displayRedScore(int redScore) {
        redTextView.setText("" + redScore);
    }

    // display Green's Score
    private void displayGreenScore(int greenScore) {
        greenTextView.setText("" + greenScore);
    }

    // display Blue's Score
    private void displayBlueScore(int blueScore) {
        blueTextView.setText("" + blueScore);
    }

    // display Yellow's Score
    private void displayYellowScore(int yellowScore) {
        yellowTextView.setText("" + yellowScore);
    }

    // display Black's Score
    private void displayBlackScore(int blackScore) {
        blackTextView.setText("" + blackScore);
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

    // add one to Blue's Score for one track
    public void oneTrackBlue(View view) {
        bluePlayerScore++;
        displayBlueScore(bluePlayerScore);
    }

    // add two to Blue's Score for two tracks
    public void twoTracksBlue(View view) {
        bluePlayerScore += 2;
        displayBlueScore(bluePlayerScore);
    }

    // add four to Blue's Score for three tracks
    public void threeTracksBlue(View view) {
        bluePlayerScore += 4;
        displayBlueScore(bluePlayerScore);
    }

    // add 7 to Blue's Score for 4 tracks
    public void fourTracksBlue(View view) {
        bluePlayerScore += 7;
        displayBlueScore(bluePlayerScore);
    }

    // add 10 to Blue's Score for 5 tracks
    public void fiveTracksBlue(View view) {
        bluePlayerScore += 10;
        displayBlueScore(bluePlayerScore);
    }

    // add 15 to Blue's Score for 6 tracks
    public void sixTracksBlue(View view) {
        bluePlayerScore += 15;
        displayBlueScore(bluePlayerScore);
    }


    // add one to Yellow's Score for one track
    public void oneTrackYellow(View view) {
        yellowPlayerScore++;
        displayYellowScore(yellowPlayerScore);
    }

    // add two to Yellow's Score for two tracks
    public void twoTracksYellow(View view) {
        yellowPlayerScore += 2;
        displayYellowScore(yellowPlayerScore);
    }

    // add four to Yellow's Score for three tracks
    public void threeTracksYellow(View view) {
        yellowPlayerScore += 4;
        displayYellowScore(yellowPlayerScore);
    }

    // add 7 to Yellow's Score for 4 tracks
    public void fourTracksYellow(View view) {
        yellowPlayerScore += 7;
        displayYellowScore(yellowPlayerScore);
    }

    // add 10 to Yellow's Score for 5 tracks
    public void fiveTracksYellow(View view) {
        yellowPlayerScore += 10;
        displayYellowScore(yellowPlayerScore);
    }

    // add 15 to Yellow's Score for 6 tracks
    public void sixTracksYellow(View view) {
        yellowPlayerScore += 15;
        displayYellowScore(yellowPlayerScore);
    }

    // add one to Black's Score for one track
    public void oneTrackBlack(View view) {
        blackPlayerScore++;
        displayBlackScore(blackPlayerScore);
    }

    // add two to Black's Score for two tracks
    public void twoTracksBlack(View view) {
        blackPlayerScore += 2;
        displayBlackScore(blackPlayerScore);
    }

    // add four to Black's Score for three tracks
    public void threeTracksBlack(View view) {
        blackPlayerScore += 4;
        displayBlackScore(blackPlayerScore);
    }

    // add 7 to Black's Score for 4 tracks
    public void fourTracksBlack(View view) {
        blackPlayerScore += 7;
        displayBlackScore(blackPlayerScore);
    }

    // add 10 to Black's Score for 5 tracks
    public void fiveTracksBlack(View view) {
        blackPlayerScore += 10;
        displayBlackScore(blackPlayerScore);
    }

    // add 15 to Black's Score for 6 tracks
    public void sixTracksBlack(View view) {
        blackPlayerScore += 15;
        displayBlackScore(blackPlayerScore);
    }

    private String whoWon() {

        if (redPlayerScore > greenPlayerScore) {
            if (redPlayerScore > bluePlayerScore) {
                if (redPlayerScore > yellowPlayerScore) {
                    if (redPlayerScore > blackPlayerScore){
                        return getString(R.string.RedWinner);
                    } else {
                        return getString(R.string.BlackWinner);
                    }
                } else if (yellowPlayerScore > blackPlayerScore){
                    return getString(R.string.YellowWins);
                }
            } else if (bluePlayerScore > yellowPlayerScore){
                if (bluePlayerScore > blackPlayerScore) {
                    return getString(R.string.BlueWinner);
                } else if (yellowPlayerScore > blackPlayerScore) {
                    return getString(R.string.YellowWins);
                } else {
                    return getString(R.string.BlackWinner);
                }
            }
        } else if (greenPlayerScore > bluePlayerScore){
            if (greenPlayerScore > yellowPlayerScore) {
                if (greenPlayerScore > blackPlayerScore) {
                    return getString(R.string.GreenWinner);
                }
            } else if (yellowPlayerScore > blackPlayerScore) {
                return getString(R.string.YellowWins);
            } else {
                return getString(R.string.BlackWinner);
            }
        } if (bluePlayerScore > yellowPlayerScore) {
            if (bluePlayerScore > blackPlayerScore) {
                return getString(R.string.BlueWinner);
            } else {
                return getString(R.string.BlackWinner);
            }
        } else if (yellowPlayerScore > blackPlayerScore) {
            return getString(R.string.YellowWins);
        } else {
            return getString(R.string.BlackWinner);
        }

    }

    //resets both score
    public void resetScores(View view) {
        Toast.makeText(getApplicationContext(),whoWon(),Toast.LENGTH_SHORT).show();
        redPlayerScore = 1;
        greenPlayerScore = 1;
        bluePlayerScore = 1;
        yellowPlayerScore = 1;
        blackPlayerScore = 1;
        displayBlueScore(bluePlayerScore);
        displayGreenScore(greenPlayerScore);
        displayRedScore(redPlayerScore);
        displayYellowScore(yellowPlayerScore);
        displayBlackScore(blackPlayerScore);
    }
}
