package com.example.log;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


        private EditText loget;
        private EditText pass;
        private Button btn;
        List<Llist> phones = new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            pass =  findViewById(R.id.getpass);
            btn =  findViewById(R.id.login);
            loget =  findViewById(R.id.logins);


            set();
           RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

           Dapter adapter = new Dapter(this,phones);
           recyclerView.setAdapter(adapter);

        }


    private void set(){

        phones.add(new Llist ("Huawei P10", "Huawei"));
        phones.add(new Llist ("Elite z3", "HP"));
        phones.add(new Llist ("Galaxy S8", "Samsung"));
        phones.add(new Llist ("LG G 5", "LG"));
    }


        public void log(View v) {
            if (loget.getText().toString().equals("user") &&
                    pass.getText().toString().equals("secretpassword")) {

                Intent intent = new Intent(MainActivity.this, WindowT.class);
                startActivity(intent);
            }
        }













    }


