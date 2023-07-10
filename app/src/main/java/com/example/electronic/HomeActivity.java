package com.example.electronic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        Button loginbtn = (Button) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("durai") && password.getText().toString().equals("durai")) {
                    openActivity2();
                }else
                    //incorrect
                    Toast.makeText(HomeActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void openActivity2(){
        Intent intent =new Intent(this, Activity2.class);
        startActivity(intent);

    }
}