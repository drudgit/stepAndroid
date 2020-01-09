package com.example.log;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

import com.example.log.R;

public class MainActivity extends AppCompatActivity {

    private EditText loget;
    private EditText pass;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pass = (EditText) findViewById(R.id.getpass);
        btn = (Button) findViewById(R.id.login);
        loget = (EditText) findViewById(R.id.logins);

    }



           // public void btnr(View v) {
              //  if (loget.getText().toString().equals("admin") &&
                 //       pass.getText().toString().equals("admin")) {

                   // Intent intent = new Intent(MainActivity.this,Requestfor.class);
                  //  startActivity(intent);
              //  }
           // }
        }


