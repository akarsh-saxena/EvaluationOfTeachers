package com.project.bitcoders.evaluationofteachers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.ImageButton;
import android.content.Intent;

public class Evaluation_1 extends AppCompatActivity {

    RatingBar rb1, rb2, rb3, rb4, rb5, rb6;
    int r1, r2, r3, r4, r5, r6;
    TextView display;
    ImageButton nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_1);
        getWindow().setWindowAnimations(android.R.style.Animation_Dialog);

        initialize_ratings();
        detectRating();
    }

        public void initialize_ratings() {
            rb1 = (RatingBar) findViewById(R.id.rb1);
            rb2 = (RatingBar) findViewById(R.id.rb2);
            rb3 = (RatingBar) findViewById(R.id.rb3);
            rb4 = (RatingBar) findViewById(R.id.rb4);
            rb5 = (RatingBar) findViewById(R.id.rb5);
            rb6 = (RatingBar) findViewById(R.id.rb6);
            nextButton = (ImageButton) findViewById(R.id.nextButton);

            rb1.setOnRatingBarChangeListener(
                    new OnRatingBarChangeListener() {
                        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                            r1 = (int) ratingBar.getRating();
                            detectRating();
                        }
                    }
            );
            rb2.setOnRatingBarChangeListener(
                    new OnRatingBarChangeListener() {
                        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                            r2 = (int) ratingBar.getRating();
                            detectRating();
                        }
                    }
            );
            rb3.setOnRatingBarChangeListener(
                    new OnRatingBarChangeListener() {
                        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                            r3 = (int) ratingBar.getRating();
                            detectRating();
                        }
                    }
            );
            rb4.setOnRatingBarChangeListener(
                    new OnRatingBarChangeListener() {
                        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                            r4 = (int) ratingBar.getRating();
                            detectRating();
                        }
                    }
            );
            rb5.setOnRatingBarChangeListener(
                    new OnRatingBarChangeListener() {
                        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                            r5 = (int) ratingBar.getRating();
                            detectRating();
                        }
                    }
            );
            rb6.setOnRatingBarChangeListener(
                    new OnRatingBarChangeListener() {
                        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                            r6 = (int) ratingBar.getRating();
                            detectRating();
                        }
                    }
            );
            display = (TextView) findViewById(R.id.display);

            nextButton.setOnClickListener(
                    new ImageButton.OnClickListener() {
                        public void onClick(View v) {
                            nextActivity();
                        }
                    }
            );
        }

            void nextActivity(){
                Intent intent = new Intent(Evaluation_1.this, Evaluation_2.class);
                Evaluation_1.this.startActivity(intent);
            }

        public void detectRating(){
            display.setText("Stars: \n" + r1 + "\n" + r2 + "\n"+ r3 + "\n"+ r4 + "\n"+ r5 + "\n"+ r6 + "\n");
    }

}
