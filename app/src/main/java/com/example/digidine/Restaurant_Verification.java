package com.example.digidine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restaurant_Verification extends AppCompatActivity {


    Button SIGNUPBUTTON;
    Button LOGINBUTTON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant__verification);


        SIGNUPBUTTON = (Button) findViewById(R.id.signupbutton);
        LOGINBUTTON = (Button) findViewById(R.id.loginb);

        SIGNUPBUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurant_signup= new Intent(Restaurant_Verification.this, Restaurant_Signup.class);
                startActivity(restaurant_signup);
            }
        });

        LOGINBUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurant_login= new Intent(Restaurant_Verification.this,Restaurant_Login.class);
                startActivity(restaurant_login);
            }
        });





    }
}