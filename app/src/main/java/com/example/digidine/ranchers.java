package com.example.digidine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ranchers extends AppCompatActivity {
    private Button MENU;
    private Button CONTACTUS;
    private Button LOCATION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranchers);

        MENU = findViewById(R.id.RanchersButtonMenu);
        CONTACTUS = findViewById(R.id.RanchersButtonContact);
        LOCATION = findViewById(R.id.RanchersButtonLocation);

        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ranchers.this, ranchers_menu.class);
                startActivity(intent);
            }
        });

        CONTACTUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ranchers.this , ranchers_contactus.class);
                startActivity(intent);
            }
        });

        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ranchers.this, ranchers_findus.class);
                startActivity(intent);
            }
        });
    }
}
