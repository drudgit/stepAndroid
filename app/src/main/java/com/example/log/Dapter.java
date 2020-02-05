package com.example.log;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Dapter extends RecyclerView.Adapter<Dapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Llist> movie;

    Dapter(Context context, List<Llist> phones) {
        this.movie = phones;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public Dapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Llist mov = movie.get(position);
        holder.nameView.setText(mov.getName());
        holder.directorView.setText(mov.getDirector());
    }

    @Override
    public int getItemCount() {
        return movie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, directorView;
        ViewHolder(View view){
            super(view);

            nameView =  view.findViewById(R.id.name);
            directorView =  view.findViewById(R.id.director);
        }
    }
}
