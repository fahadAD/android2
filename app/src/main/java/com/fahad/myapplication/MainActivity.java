package com.fahad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText search;
Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search=findViewById(R.id.search);
        button1=findViewById(R.id.button1);



        String s_number=search.getText().toString();
       int number= Integer.parseInt(s_number);

        if (number%2 == 0 ){

            Toast.makeText(this, number+"Even", Toast.LENGTH_SHORT).show();
        }else {

            Toast.makeText(this, number+"Odd", Toast.LENGTH_SHORT).show();
        }




    }
}