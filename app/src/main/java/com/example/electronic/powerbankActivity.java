package com.example.electronic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.electronic.adapters.productAdapters;
import com.example.electronic.models.productitem;

import java.util.ArrayList;

public class powerbankActivity  extends AppCompatActivity {
    ArrayList<productitem>productlist;
    productAdapters adapters;
    RecyclerView playout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powerbank);
        playout =findViewById(R.id.productcard4);

        productlist=new ArrayList<>();
        productlist.add(new productitem(R.drawable.power1,1,"REDMI 20000 mAh Power Bank (18 W, Fast Charging)  (Black, Lithium Polymer)","10 ranking","1,949"));
        productlist.add(new productitem(R.drawable.power2,2,"Mi 3i 10000 mAh Power Bank (Fast Charging, 18W)  (Black, Lithium Polymer)","111 ranking","1,299"));
        productlist.add(new productitem(R.drawable.power3,3,"Spigen 10000 mAh Wireless Power Bank (20 W, Fast Charging)  (Black, Lithium Polymer)","555 ranking","2,499" ));
        productlist.add(new productitem(R.drawable.power4,4,"Intex 10000 mAh Power Bank (12 W, Fast Charging)  (Navy Blue, Lithium Polymer)","30 ranking","899"));
        productlist.add(new productitem(R.drawable.power5,5,"REDMI 20000 mAh Power Bank (18 W, Fast Charging)  (White, Lithium Polymer)","38 ranking","1,949"));


        adapters=new productAdapters(productlist,this);
        playout.setAdapter(adapters);
        playout.setLayoutManager(new LinearLayoutManager(this));


    }
}