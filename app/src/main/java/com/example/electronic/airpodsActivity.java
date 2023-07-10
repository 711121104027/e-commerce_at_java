package com.example.electronic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.electronic.adapters.productAdapters;
import com.example.electronic.models.productitem;

import java.util.ArrayList;

public class airpodsActivity extends AppCompatActivity {
    ArrayList<productitem>productlist;
    productAdapters adapters;
    RecyclerView playout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airpods);
        playout =findViewById(R.id.productcard1);

        productlist=new ArrayList<>();
        productlist.add(new productitem(R.drawable.airpods1,1,"boAt Immortal 131 with Beast Mode, 40 Hours Playback and ENx Tech Bluetooth Headset  (Black, True Wireless)","15 ranking","1,699"));
        productlist.add(new productitem(R.drawable.airpods2,2,"Boult Audio Airbass Z35 with ZEN ENC Mic, 32H Playtime, 45ms Ultra-Low Latency Mode, 5.3 Bluetooth Headset  (Sunset Grey, True Wireless)","10 ranking","1,299"));
        productlist.add(new productitem(R.drawable.airpods3,3,"Noise Buds Verve with 45 Hrs Playtime, Environmental Noise Cancellation, Quad Mic Bluetooth Headset  (Forest Green, True Wireless)","12 ranking","1,499" ));
        productlist.add(new productitem(R.drawable.airpods4,4,"boAt Airdopes 131 Captain America Edition with 15 Hours Playtime Bluetooth Headset  (Captains Blue, True Wireless)","20 ranking","1,499"));
        productlist.add(new productitem(R.drawable.airpods5,5,"boAt Airdopes 411ANC with upto 17.5 Hours Playback and ASAP Charge Bluetooth Headset  (Blue Thunder, True Wireless)","16 ranking","1,599"));

        adapters=new productAdapters(productlist,this);
        playout.setAdapter(adapters);
        playout.setLayoutManager(new LinearLayoutManager(this));


    }
}