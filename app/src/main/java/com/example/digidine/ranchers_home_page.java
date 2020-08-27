package com.example.digidine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ranchers_home_page extends AppCompatActivity {

    private Button MENU;
    private Button CONTACTUS;
    private Button LOCATION;
    private Button LOGOUT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranchers_home_page);

        MENU = findViewById(R.id.RanchersButtonMenu);
        CONTACTUS = findViewById(R.id.RanchersButtonContact);
        LOCATION = findViewById(R.id.RanchersButtonLocation);
        LOGOUT = findViewById(R.id.RanchersButtonLogout);

        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ranchers_home_page.this, ranchers_menu.class);
                startActivity(intent);
            }
        });

        CONTACTUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ranchers_home_page.this , ranchers_contactus.class);
                startActivity(intent);
            }
        });

        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ranchers_home_page.this, ranchers_findus.class);
                startActivity(intent);
            }
        });

        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(ranchers_home_page.this, "Logging Out.... Please Wait",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ranchers_home_page.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}