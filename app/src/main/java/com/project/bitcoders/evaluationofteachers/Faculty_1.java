package com.project.bitcoders.evaluationofteachers;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Faculty_1 extends AppCompatActivity {

    String facId, facName, facSem;
    TextView fId, fName, display;
    Spinner secSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_1);
        getWindow().setWindowAnimations(android.R.style.Animation_Dialog);

        fId = (TextView) findViewById(R.id.fId);
        fName = (TextView) findViewById(R.id.fName);
        secSpinner = (Spinner) findViewById(R.id.secSpinner);
        display = (TextView) findViewById(R.id.display);
        display();
    }

    public void display() {
        fId.setText("Faculty ID: " + facId);
        fName.setText("Faculty Name: " + facName);

//        facSem = secSpinner.getSelectedItem().toString();
        String str = fId.getText().toString();
        List<String> stringList = new ArrayList<String>();
     //   stringList.add(str);
        ArrayAdapter<String>ar = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,stringList);
        secSpinner.setAdapter(ar);
        ar.add("SELECT SECTION");

        fId.setText("ID: ");
        fName.setText("Name: ");

        try {


            Connection con = connection("sa", "password", "10.0.2.2", "MyDatabase");
            if (con == null) {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            } else {
                String query = "SELECT * FROM MyValues";

                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(query);

                while(rs.next()){
                    display.append(rs.getString(2) + "\n");
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        /*secSpinner.setOnItemSelectedListener((
                new Spinner.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(Faculty_1.this, "HELLO", Toast.LENGTH_SHORT).show();
                    }
                }
        );*/

     //   Intent intent = new Intent(Faculty_1.this, Faculty_2.class);
     //   startActivity(intent);


    }

    public Connection connection(String user, String pass, String ip, String db) {
        Connection connection = null;
        try{

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //  String connectionURL = "jdbc:jtds:sqlserver://10.0.2.2;databaseName=MyDatabase;user=sa;password=password;";   //Static
            String connectionURL = "jdbc:jtds:sqlserver://"+ip+";databaseName="+db+";user="+user+";password="+pass+";";       //Variables
            //  connectionURL = "jdbc:jtds:sqlserver://10.0.2.2:1433;databaseName=MyDatabase;integratedSecurity=true;";       //Microsoft Authentication
            connection = DriverManager.getConnection(connectionURL);
        }
        catch(Exception ex){
            //Toast.makeText(this, ex.toString(), Toast.LENGTH_SHORT).show();
            //textView.append(ex.toString());
            ex.printStackTrace();
            Log.e("Error", ex.toString());
        }

        return connection;
    }
}
