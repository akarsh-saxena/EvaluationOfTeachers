package com.project.bitcoders.evaluationofteachers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentDetails extends AppCompatActivity {

    Spinner branchSpinner, semSpinner;
    private TextView studentDetails;
    Button submitButton;
    EditText studentNumber, studentPassword;
    String branchName, sem, password, studentNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        getWindow().setWindowAnimations(android.R.style.Animation_Dialog);

        branchSpinner = (Spinner)findViewById(R.id.branchSpinner);
        semSpinner = (Spinner)findViewById(R.id.semSpinner);
        studentDetails = (TextView)findViewById(R.id.studentDetails);
        submitButton = (Button)findViewById(R.id.submitButton);
        studentNumber = (EditText)findViewById(R.id.studentId);
        studentPassword = (EditText)findViewById(R.id.studentPassword);
    }

    public void onSubmitClick(View v){

        studentNo = studentNumber.getText().toString();
        if(studentNo.isEmpty())
        {
            studentNumber.setError("STUDENT ID CANNOT BE EMPTY");
            return;
        }

        branchName = String.valueOf(branchSpinner.getSelectedItem());
        if(branchName.equals("Select Branch")){
            Toast.makeText(this, "Select Valid Branch", Toast.LENGTH_SHORT).show();
            return;
        }

        sem = String.valueOf(semSpinner.getSelectedItem());
        if(sem.equals("Select Semester")){
            Toast.makeText(this, "Select Valid Semester", Toast.LENGTH_SHORT).show();
            return;
        }

        password = studentPassword.getText().toString();

        if(password.isEmpty())
        {
            studentPassword.setError("PASSWORD CANNOT BE EMPTY");
            return;
        }

        studentDetails.setText(studentNo + "\n" + branchName + "\n" +sem + "\n" + password);

        Intent intent = new Intent(StudentDetails.this, Evaluation_1.class);
        startActivity(intent);
    }
}
