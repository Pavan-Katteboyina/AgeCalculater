package com.example.samolecalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    TextView textView2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView)findViewById(R.id.textView);
        editText= (EditText) findViewById(R.id.edittext);
        textView2= (TextView)findViewById(R.id.textView2);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    int Dob= Integer.parseInt(editText.getText().toString());

                    Calendar calendar= Calendar.getInstance();
                    int year=calendar.get(Calendar.YEAR);
                    int age= year-Dob;
                    textView2.setText("Your age is :"+age+  "Your age in Months:"+age*12+ "Your age in Days:"+age*365);

                }


        });
    }



}