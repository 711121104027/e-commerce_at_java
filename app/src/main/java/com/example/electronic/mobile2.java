package com.example.electronic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.electronic.adapters.productAdapters;
import com.example.electronic.models.productitem;

import java.util.ArrayList;

public class mobile2  extends AppCompatActivity {
    ArrayList<productitem>productlist;
    productAdapters adapters;
    RecyclerView playout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile2);
        playout =findViewById(R.id.productcard3);

        productlist=new ArrayList<>();
        productlist.add(new productitem(R.drawable.iphone,1,"APPLE iPhone 11 Pro Max (Midnight Green, 64 GB)","1000 ranking","95,699"));
        productlist.add(new productitem(R.drawable.phone2,2,"APPLE iPhone 14 Pro Max (Silver, 1 TB)","11117 ranking","1,77,999"));
        productlist.add(new productitem(R.drawable.phone3,3,"OnePlus Nord CE 2 Lite 5G (Black Dusk, 128 GB)  (6 GB RAM)","555 ranking","18,005" ));
        productlist.add(new productitem(R.drawable.phone4,4,"REDMI Note 12 5G (Frosted Green, 128 GB)  (6 GB RAM)","2000 ranking","18,999"));
        productlist.add(new productitem(R.drawable.phone5,5,"realme C33 2023 (Aqua Blue, 128 GB)  (4 GB RAM)","12000 ranking","10,499"));
        productlist.add(new productitem(R.drawable.phone6,6,"ASUS ROG 5s (Phantom Black, 256 GB)  (12 GB RAM)","111499","57,999"));


        adapters=new productAdapters(productlist,this);
        playout.setAdapter(adapters);
        playout.setLayoutManager(new LinearLayoutManager(this));


    }
}