package com.example.digidine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class KFC_Home_Page extends AppCompatActivity {

    private Button MENU;
    private Button CONTACTUS;
    private Button LOGOUT;
    private Button LOCATION;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc__home__page);

        LOCATION=findViewById(R.id.KfcButtonLocation);
        LOGOUT=findViewById(R.id.KfcButtonLogout);
        CONTACTUS=findViewById(R.id.KfcButtonContact);
        MENU=findViewById(R.id.KfcButtonMenu);

        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KFC_Home_Page.this, kfc_menu.class);
                startActivity(intent);
            }
        });

        CONTACTUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (KFC_Home_Page.this, kfc_contactus.class);
                startActivity(intent);
            }
        });


        LOCATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KFC_Home_Page.this, KFC_FindUs_Activity.class);
                        startActivity(intent);
            }
        });

        LOGOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(KFC_Home_Page.this, "Logging Out.... Please Wait",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(KFC_Home_Page.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}