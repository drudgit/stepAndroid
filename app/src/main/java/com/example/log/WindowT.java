package com.example.log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WindowT extends AppCompatActivity {

    List<Llist> phones = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_t);

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
}
