package com.example.electronic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.electronic.adapters.productAdapters;
import com.example.electronic.models.productitem;

import java.util.ArrayList;

public class keyboardActivity  extends AppCompatActivity {
    ArrayList<productitem>productlist;
    productAdapters adapters;
    RecyclerView playout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);
        playout =findViewById(R.id.productcard2);

        productlist=new ArrayList<>();
        productlist.add(new productitem(R.drawable.key1,1,"ZEBRONICS Zeb-Transformer Premium Gaming Keyboard and Mouse Combo Set","12 ranking","1,199"));
        productlist.add(new productitem(R.drawable.key2,2,"HP Multimedia Slim & Mouse Combo Wireless Laptop Keyboard  (Black)","17 ranking","1,399"));
        productlist.add(new productitem(R.drawable.key3,3,"RPM Euro Games Gaming Keyboard and Mouse Combo | Keyboard - With 7 Color Backlit | Suspension Caps | Backlit | 104 Keys | Mouse - Upto 3200 DPI, 4 Levels|6 Buttons | 7 Color RGB Wired USB Gaming Keyboard (Black) Wired USB Gaming Keyboard  (Black)","22 ranking","799" ));
        productlist.add(new productitem(R.drawable.key4,4,"Portronics POR-1658 / Key5 / Silent Mouse & Combo Wireless Laptop Keyboard  (Z Black)","20 ranking","899"));
        productlist.add(new productitem(R.drawable.key5,5,"ZEBRONICS Zeb K35 and Zeb Rise Keyboard & Mouse Combo Wired USB Desktop Keyboard  (Black)","16 ranking","499"));

        adapters=new productAdapters(productlist,this);
        playout.setAdapter(adapters);
        playout.setLayoutManager(new LinearLayoutManager(this));


    }
}