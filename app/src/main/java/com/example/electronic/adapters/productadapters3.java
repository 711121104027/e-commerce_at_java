package com.example.electronic.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.electronic.R;
import com.example.electronic.models.productitem;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class productadapters3  extends RecyclerView.Adapter<productAdapters.viewHolder>{
    ArrayList<productitem> plist;
    Context context;

    public productadapters3 (ArrayList<productitem> plist, Context context){
        this.plist = plist;
        this.context = context;
    }

    @NonNull
    @Override
    public productAdapters.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mobile3,parent,false);
        return new productAdapters.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productAdapters.viewHolder holder, int position) {
        final productitem items =plist.get(position);
        holder.pimage.setImageResource(items.getImage());
        holder.details.setText(items.getTitle());
        holder.price.setText(items.getPrice());
        holder.rank.setText(items.getRank());

    }

    @Override
    public int getItemCount() {
        return plist.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        ImageView pimage;
        TextView details,price,rank;
        public viewHolder(@NotNull View itemView){
            super(itemView);

            pimage=itemView.findViewById(R.id.productphone);
            details=itemView.findViewById(R.id.phonedetails);
            price=itemView.findViewById(R.id.phonerank);
            rank=itemView.findViewById(R.id.phoneprice);
        }
    }

}
