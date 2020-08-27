package com.example.digidine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class mcdonalds_home_page extends AppCompatActivity {

    private Button MENU;
    private Button CONTACTUS;
    private Button LOGOUT;
    private Button LOCATION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcdonalds_home_page);

        MENU = findViewById(R.id.mcdonaldsButtonMenu);
        CONTACTUS = findViewById(R.id.mcdonaldsButtonContact);
        LOGOUT=findViewById(R.id.mcdonaldsButtonLogout);
        LOCATION=findViewById(R.id.mcdonaldsButtonLocation);


        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcdonalds_home_page.this, mcdonalds_menu.class);
                startActivity(intent);
            }
        });

        CONTACTUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcdonalds_home_page.this, mcdonalds_contactus.class);
                startActivity(intent);
            }
        });

        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcdonalds_home_page.this, mcdonalds_findus.class);
                startActivity(intent);
            }
        });

        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(mcdonalds_home_page.this, "Logging Out.... Please Wait",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(mcdonalds_home_page.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}