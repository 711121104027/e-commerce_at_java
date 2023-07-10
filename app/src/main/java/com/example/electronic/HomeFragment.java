package com.example.electronic;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private CardView card1;
    private CardView card2;
    private CardView card3;
    private CardView card4;
    private CardView card5;
    private CardView card6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        card1 = view.findViewById(R.id.mobilebtn);
        card2 = view.findViewById(R.id.airpodsbtn);
        card3 = view.findViewById(R.id.smartwatchbtn);
        card4 = view.findViewById(R.id.powerbankbtn);
        card5 = view.findViewById(R.id.laptopbtn);
        card6 = view.findViewById(R.id.keyboardbtn);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mobilebtn:
                Intent intent1 = new Intent(getActivity(), mobile2.class);
                startActivity(intent1);
                break;
            case R.id.airpodsbtn:
                Intent intent2 = new Intent(getActivity(), airpodsActivity.class);
                startActivity(intent2);
                break;
            case R.id.smartwatchbtn:
                Intent intent3 = new Intent(getActivity(), smartwatchActivity.class);
                startActivity(intent3);
                break;
            case R.id.powerbankbtn:
                Intent intent4 = new Intent(getActivity(), powerbankActivity.class);
                startActivity(intent4);
                break;
            case R.id.laptopbtn:
                Intent intent5 = new Intent(getActivity(), laptopActivity.class);
                startActivity(intent5);
                break;
            case R.id.keyboardbtn:
                Intent intent6 = new Intent(getActivity(), keyboardActivity.class);
                startActivity(intent6);
                break;
            default:
                break;
        }
    }

}