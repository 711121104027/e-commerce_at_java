package com.example.electronic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.electronic.adapters.productAdapters;
import com.example.electronic.models.productitem;

import java.util.ArrayList;

public class laptopActivity extends AppCompatActivity {
ArrayList<productitem>productlist;
productAdapters adapters;
RecyclerView playout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        playout =findViewById(R.id.productcard);

        productlist=new ArrayList<>();
        productlist.add(new productitem(R.drawable.laptop1,1,"HP Victus Gaming Latest AMD Ryzen 7-5800H 16.1 inch(40.9 cm) FHD Gaming Laptop (16GB RAM/ 512GB SSD/4Gb RTX 3050 Graphics/Flicker Free/144Hz Display/B and O/Backlit Kb/Win 11/MSO/Xbox Pass) 16-e0351ax","15 ranking","80,490"));
        productlist.add(new productitem(R.drawable.laptop2,2,"12th Generation Intel® Core™ i5 processor,Windows 11 Home,35.6 cm (14) diagonal FHD touch display, with fingerprint reader,Intel® Iris® Xᵉ Graphics,512 GB PCIe® NVMe™ M.2 SSD,16 GB DDR4-3200 MHz RAM (2 x 8 GB),Weighs: 1.41 kg","13 ranking","67,079"));
        productlist.add(new productitem(R.drawable.laptop3,3,"Lenovo Thinkbook 15 Intel 12th Gen Core i5 15.6 (39.62Cm) FHD 250 Nits Antiglare Thin And Light Laptop (16GB/512GB SSD/Windows 11 Home/MS Office H&S ThinkBook 15 Reliability tested on 12 MIL-STD-810H Methods and 22 Procedures | 12th Gen Intel Core I51235U G4 processor | 10 Cores | 12 Threads","10 ranking","58,990" ));
        productlist.add(new productitem(R.drawable.laptop4,4,"Lenovo IdeaPad Slim 3 Intel Core i5 12th Gen 15.6,(39.62cm) FHD Thin & Light Laptop (8GB/512GB SSD/Windows 11/Office 2021/Backlit/2Yr Warranty/3months Game Pass/Arctic Grey/1.63Kg), 82RK0062IN","12 ranking","54,990"));
        productlist.add(new productitem(R.drawable.laptop5,5,"SUS TUF Gaming A15, 15.6-inch (39.62 cms) FHD 144Hz, AMD Ryzen 5 4600H, 4GB NVIDIA GeForce GTX 1650, Gaming Laptop (8GB/512GB SSD/Windows 11/Black/2.3 Kg), FA506IHRZ-HN111W","20 ranking","49,990"));
        productlist.add(new productitem(R.drawable.laptop6,6,"ASUS ROG Strix Scar 16 (2023), Intel Core i9 13th Gen, 16/ (40.64 cm) QHD+ 240Hz/3ms, 12GB RTX 4080, Gaming Laptop (32GB/1TB SSD/Win 11/Office 2021/90WHr Battery/Black/2.5 Kg), G634JZ-N4062WS","20 ranking","2,79,990"));

        adapters=new productAdapters(productlist,this);
        playout.setAdapter(adapters);
        playout.setLayoutManager(new LinearLayoutManager(this));


    }
}