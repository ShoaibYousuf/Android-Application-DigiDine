package com.example.digidine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OPTP extends AppCompatActivity {

    private Button MENU;
    private Button CONTACTUS;
    private Button LOCATION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optp);

        MENU = findViewById(R.id.optpButtonMenu);
        CONTACTUS = findViewById(R.id.optpButtonContact);
        LOCATION=findViewById(R.id.optpButtonLocation);
        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OPTP.this, optp_menu.class);
                startActivity(intent);
            }
        });

        CONTACTUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OPTP.this, optp_contactus.class);
                startActivity(intent);
            }
        });


        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OPTP.this, optp_findus.class);
                startActivity(intent);
            }
        });
    }
}
