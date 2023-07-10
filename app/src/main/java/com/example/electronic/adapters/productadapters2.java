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

public class productadapters2  extends RecyclerView.Adapter<productAdapters.viewHolder>{
    ArrayList<productitem> plist;
    Context context;

    public productadapters2 (ArrayList<productitem> plist, Context context){
        this.plist = plist;
        this.context = context;
    }

    @NonNull
    @Override
    public productAdapters.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.keyboard2,parent,false);
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

            pimage=itemView.findViewById(R.id.productkey);
            details=itemView.findViewById(R.id.keydetails);
            price=itemView.findViewById(R.id.keyprice);
            rank=itemView.findViewById(R.id.keyrank);
        }
    }

}
