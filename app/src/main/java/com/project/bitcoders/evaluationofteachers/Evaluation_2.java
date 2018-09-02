package com.project.bitcoders.evaluationofteachers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

public class Evaluation_2 extends AppCompatActivity {

        RatingBar rb1, rb2, rb3, rb4, rb5, rb6, rb7;
        int r1, r2, r3, r4, r5, r6, r7;
        TextView display;
        ImageButton nextButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_evaluation_2);
            getWindow().setWindowAnimations(android.R.style.Animation_Dialog);

            initialize_ratings();
        }

    public void initialize_ratings() {
        rb1 = (RatingBar) findViewById(R.id.rb1);
        rb2 = (RatingBar) findViewById(R.id.rb2);
        rb3 = (RatingBar) findViewById(R.id.rb3);
        rb4 = (RatingBar) findViewById(R.id.rb4);
        rb5 = (RatingBar) findViewById(R.id.rb5);
        rb6 = (RatingBar) findViewById(R.id.rb6);
        rb7 = (RatingBar)findViewById(R.id.rb7);
        nextButton = (ImageButton) findViewById(R.id.nextButton);

        rb1.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r1 = (int) ratingBar.getRating();
                    }
                }
        );
        rb2.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r2 = (int) ratingBar.getRating();
                    }
                }
        );
        rb3.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r3 = (int) ratingBar.getRating();
                    }
                }
        );
        rb4.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r4 = (int) ratingBar.getRating();
                    }
                }
        );
        rb5.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r5 = (int) ratingBar.getRating();
                    }
                }
        );
        rb6.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r6 = (int) ratingBar.getRating();
                    }
                }
        );
        rb7.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r7 = (int) ratingBar.getRating();
                    }
                }
        );
        display = (TextView) findViewById(R.id.display);

        nextButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        nextActivity();
                    }
                }
        );
    }

    void nextActivity(){
        Intent intent = new Intent(Evaluation_2.this, Evaluation_3.class);
        Evaluation_2.this.startActivity(intent);
    }

}
