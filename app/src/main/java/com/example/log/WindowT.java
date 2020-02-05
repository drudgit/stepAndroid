package com.example.log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WindowT extends AppCompatActivity {

    List<Llist> movie = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_t);

        set();
        RecyclerView recyclerView =  findViewById(R.id.list);

        Dapter adapter = new Dapter(this,movie);
        recyclerView.setAdapter(adapter);
    }


    private void set(){

        movie.add(new Llist ("Parasite", "Bong Joon-Ho"));
        movie.add(new Llist ("Joker", "Todd Phillips"));
        movie.add(new Llist ("Fight Club", "David Fincher"));
        movie.add(new Llist ("Heat", "Michael Mann"));
    }
}
