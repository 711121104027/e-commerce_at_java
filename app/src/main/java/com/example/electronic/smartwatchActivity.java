package com.example.electronic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.electronic.adapters.productAdapters;
import com.example.electronic.models.productitem;

import java.util.ArrayList;

public class smartwatchActivity  extends AppCompatActivity {
    ArrayList<productitem>productlist;
    productAdapters adapters;
    RecyclerView playout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartwatch);
        playout =findViewById(R.id.productcard5);

        productlist=new ArrayList<>();
        productlist.add(new productitem(R.drawable.smart1,1,"Fire-Boltt Rise�BT Calling, 1.85, Voice Assistance & 123 Sports Single BT Connection Smartwatch  (Black Strap, Free Size)","120 ranking","1,999"));
        productlist.add(new productitem(R.drawable.smart2,2,"Noise Evolve 3 1.43 AMOLED Always-On Display with Bluetooth Calling, Metallic Design Smartwatch  (Black Strap, Regular)","110 ranking","2,799"));
        productlist.add(new productitem(R.drawable.smart3,3,"boAt Storm call 1.69 inch HD display with Bluetooth Calling & 550 Nits Brightness Smartwatch  (Pink Strap, Free Size)","55 ranking","1,299" ));
        productlist.add(new productitem(R.drawable.smart4,4,"Fastrack Revoltt FS1 Max|Biggest 1.95'' UltraVU Curve Display|BT Calling|100+ Multisports Smartwatch  (Black Strap, Free Size)","300 ranking","1,799"));
        productlist.add(new productitem(R.drawable.smart5,5,"Fire-Boltt Supernova 1.78 AMOLED 368*448px High Resolution,BT Calling and 123 Sports Modes Smartwatch  (Gold Strap, Free Size)","448 ranking","3,799"));
        productlist.add(new productitem(R.drawable.smart6,6,"APPLE Watch SE GPS + Cellular (2nd Gen) Heart Rate Monitor, Sleep and Health Tracker  (Starlight Sport Strap, 40mm)","1200 ranking","31,900"));


        adapters=new productAdapters(productlist,this);
        playout.setAdapter(adapters);
        playout.setLayoutManager(new LinearLayoutManager(this));


    }
}