package com.project.bitcoders.evaluationofteachers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.view.View;
import android.content.Intent;

public class WelcomePage extends AppCompatActivity {

    RadioButton radioButton1;
    RadioButton radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        getWindow().setWindowAnimations(android.R.style.Animation_Dialog);

        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);

    }

    public void onRadioButtonClicked(View v){
        boolean isChecked = ((RadioButton)v).isChecked();

        if(!isChecked) {
            return;
        }

        switch(v.getId()){
            case R.id.radioButton1:
            {
                Intent intent = new Intent(WelcomePage.this, StudentDetails.class);
                startActivity(intent);
                break;
            }

            case R.id.radioButton2:
            {
                Intent intent = new Intent(WelcomePage.this, FacultyDetails.class);
                startActivity(intent);
                break;
            }
        }
    }


}
