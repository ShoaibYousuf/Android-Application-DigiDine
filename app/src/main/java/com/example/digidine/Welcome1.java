package com.example.digidine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome1 extends AppCompatActivity {
    TextView v;
    Button buttonm;
    String n;


    protected void onCreate(Bundle savedInstacestate) {

        super.onCreate(savedInstacestate);
        setContentView(R.layout.activity_welcome1);
        v=findViewById(R.id.next_page_1);
        buttonm=findViewById(R.id.button2);
        Intent it  =getIntent();


        String f=it.getStringExtra("name");

        v.setText("  Welcome to "+f+"       ");
        switch(f){

            case "KFC":
                buttonm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent kfc = new Intent(Welcome1.this, KFC.class);
                        startActivity(kfc);

                    }

                                               });
                break;
            case "McDONALDS":
                buttonm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent mcdonalds = new Intent(Welcome1.this, mcdonalds.class);
                        startActivity(mcdonalds);
                    }
                });
                break;

            case "OPTP":
                buttonm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent optp= new Intent(Welcome1.this, OPTP.class);
                        startActivity(optp);
                    }
                });
                break;

            case "Ranchers":
                buttonm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ranchers = new Intent(Welcome1.this, ranchers.class);
                        startActivity(ranchers);
                    }
                });
                break;



        };
    }}