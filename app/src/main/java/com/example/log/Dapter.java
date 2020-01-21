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
    private List<Llist> phones;

    Dapter(Context context, List<Llist> phones) {
        this.phones = phones;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public Dapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Llist phone = phones.get(position);
        holder.nameView.setText(phone.getName());
        holder.companyView.setText(phone.getCompany());
    }

    @Override
    public int getItemCount() {
        return phones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, companyView;
        ViewHolder(View view){
            super(view);

            nameView = (TextView) view.findViewById(R.id.name);
            companyView = (TextView) view.findViewById(R.id.company);
        }
    }
}
