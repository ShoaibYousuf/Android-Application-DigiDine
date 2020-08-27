package com.example.digidine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class optp_home_page extends AppCompatActivity {

    private Button MENU;
    private Button CONTACTUS;
    private Button LOCATION;
    private Button LOGOUT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optp_home_page);

        MENU = findViewById(R.id.optpButtonMenu);
        CONTACTUS = findViewById(R.id.optpButtonContact);
        LOCATION=findViewById(R.id.optpButtonLocation);
        LOGOUT = findViewById(R.id.optpButtonLogout);


        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(optp_home_page.this, optp_menu.class);
                startActivity(intent);
            }
        });

        CONTACTUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(optp_home_page.this, optp_contactus.class);
                startActivity(intent);
            }
        });


        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(optp_home_page.this, optp_findus.class);
                startActivity(intent);
            }
        });


        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(optp_home_page.this, "Logging Out.... Please Wait",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(optp_home_page.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}