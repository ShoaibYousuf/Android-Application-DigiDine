package com.example.digidine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KFC extends AppCompatActivity {

    private Button MENU;
    private Button CONTACTUS;

    private Button LOCATION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kfc);

        LOCATION=findViewById(R.id.KfcButtonLocation);

        CONTACTUS=findViewById(R.id.KfcButtonContact);
        MENU=findViewById(R.id.KfcButtonMenu);

        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KFC.this, kfc_menu.class);
                startActivity(intent);
            }
        });

        CONTACTUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (KFC.this, kfc_contactus.class);
                startActivity(intent);
            }
        });


        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KFC.this, KFC_FindUs_Activity.class);
                startActivity(intent);
            }
        });


    }
}
