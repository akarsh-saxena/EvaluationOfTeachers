package com.project.bitcoders.evaluationofteachers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    Button exitButton, evaluateAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getWindow().setWindowAnimations(android.R.style.Animation_Dialog);

        exitButton = (Button)findViewById(R.id.exitButton);
        evaluateAgain = (Button)findViewById(R.id.evaluateAgain);

        exitButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Toast.makeText(v.getContext(), "EXITING....", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }
        );

        evaluateAgain.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent = new Intent(Feedback.this, StudentDetails.class);
                        startActivity(intent);
                    }
                }
        );
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this, "EXITING...", Toast.LENGTH_SHORT);
        Intent intent = new Intent(Feedback.this, WelcomePage.class);
    }

}
