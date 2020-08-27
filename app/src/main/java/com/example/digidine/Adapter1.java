package com.example.digidine;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class Adaptor1 extends RecyclerView.Adapter<Adaptor1.MyViewHolder> {
    private Context context ;
    private String[] data;
    Adaptor1(String[] data){
        this.data=data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.restaurants_list_layout,parent,false);
        context = parent.getContext();
        final MyViewHolder holder = new MyViewHolder(view);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final String con= data[position];
        holder.textcontact.setText(con);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(context,Welcome1.class);

                it.putExtra("name",con);
                context.startActivity(it);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imagecontact;
        public TextView textcontact;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imagecontact=itemView.findViewById(R.id.recycler_1);
            textcontact=itemView.findViewById(R.id.recyclertxt);

        }
    }
}