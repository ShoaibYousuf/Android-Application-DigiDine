package com.example.digidine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class mcdonalds extends AppCompatActivity {

    private Button MENU;
    private Button CONTACTUS;
    private Button LOCATION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcdonalds);

        MENU = findViewById(R.id.mcdonaldsButtonMenu);
        CONTACTUS = findViewById(R.id.mcdonaldsButtonContact);
        LOCATION=findViewById(R.id.mcdonaldsButtonLocation);

        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcdonalds.this, mcdonalds_menu.class);
                startActivity(intent);
            }
        });

        CONTACTUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcdonalds.this, mcdonalds_contactus.class);
                startActivity(intent);
            }
        });

        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcdonalds.this, mcdonalds_findus.class);
                startActivity(intent);
            }
        });
    }
}
