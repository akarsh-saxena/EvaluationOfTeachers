package com.project.bitcoders.evaluationofteachers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class FacultyDetails extends AppCompatActivity {

    String facultyNo, password;
    EditText facultyId, facultyPassword;
    Button submitButton;
    TextView facultyDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_details);
        getWindow().setWindowAnimations(android.R.style.Animation_Dialog);

        facultyId = (EditText)findViewById(R.id.facultyId);
        facultyPassword = (EditText)findViewById(R.id.facultyPassword);
        submitButton = (Button)findViewById(R.id.submitButton);
        facultyDetails = (TextView)findViewById(R.id.facultyDetails);
        facultyId.requestFocus();
    }

    public void onSubmitClick(View v){
        facultyNo = facultyId.getText().toString();
        password = facultyPassword.getText().toString();

        if(facultyNo.isEmpty())
        {
            facultyId.setError("FACULTY ID CANNOT BE EMPTY");
            return;
        }

        if(password.isEmpty())
        {
            facultyPassword.setError("PASSWORD CANNOT BE EMPTY");
            return;
        }

        facultyDetails.setText(facultyNo + "\n" + password);

        Intent intent = new Intent(FacultyDetails.this, Faculty_1.class);
        startActivity(intent);
    }
}
