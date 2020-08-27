package com.example.digidine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button customerb;
    Button restaurantb;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customerb=findViewById(R.id.Customerb);
        restaurantb=findViewById(R.id.Restaurantb);
        customerb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cus= new Intent(MainActivity.this,Customer.class);
                startActivity(cus);
            }
        });
        restaurantb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Restaurant_Verification.class);
                startActivity(intent);
            }

    });



    }}
