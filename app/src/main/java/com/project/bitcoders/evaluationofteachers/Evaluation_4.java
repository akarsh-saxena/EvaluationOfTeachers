package com.project.bitcoders.evaluationofteachers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.RatingBar;
import android.widget.ImageButton;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.view.View;

public class Evaluation_4 extends AppCompatActivity {

    TextView display;
    RatingBar rb1, rb2, rb3;
    ImageButton nextButton;
    int r1, r2, r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation_4);
        getWindow().setWindowAnimations(android.R.style.Animation_Dialog);

        display = (TextView)findViewById(R.id.display);
        rb1 = (RatingBar)findViewById(R.id.rb1);
        rb2 = (RatingBar)findViewById(R.id.rb2);
        rb3 = (RatingBar)findViewById(R.id.rb3);

        nextButton = (ImageButton)findViewById(R.id.nextButton);

        rb1.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r1 = (int)rating;
                    }
                }
        );

        rb2.setOnRatingBarChangeListener(
                new OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r2 = (int)rating;
                    }
                }
        );

        rb3.setOnRatingBarChangeListener(
                new OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        r3 = (int)rating;
                    }
                }
        );

        nextButton.setOnClickListener(
                new ImageButton.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(Evaluation_4.this, Feedback.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
