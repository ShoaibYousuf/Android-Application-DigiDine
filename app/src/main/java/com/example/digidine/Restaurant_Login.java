package com.example.digidine;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;


public class Restaurant_Login extends AppCompatActivity implements View.OnClickListener{

    EditText EMAIL_LOGIN;
    EditText PASSWORD;
    Button LOGIN;
    Button LoginPageSignup;
    ProgressDialog dialogs;
    FirebaseAuth fire;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant__login);

        fire = FirebaseAuth.getInstance();
        if(fire.getCurrentUser() !=null){
            finish();
            startActivity(new Intent(getApplicationContext(), KFC_Home_Page.class));
        }
        dialogs = new ProgressDialog(this);
        EMAIL_LOGIN = (EditText) findViewById(R.id.email_res_login);
        PASSWORD = (EditText) findViewById(R.id.password_res_login);
        LOGIN = (Button) findViewById(R.id.login_res_login);
        LoginPageSignup = (Button) findViewById((R.id.btnSignupforLoginPage)) ;

        LOGIN.setOnClickListener(this);
        LoginPageSignup.setOnClickListener(this);

    }

    private void Restaurant_Login(){

        final String kfc = "kfc@gmail.com";
        final String mcdonalds = "mcdonalds@gmail.com";
        final String optp = "optp@gmail.com";
        final String ranchers = "ranchers@gmail.com";

        final String email = EMAIL_LOGIN.getText().toString().trim();
        String password = PASSWORD.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please enter Email", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter Password", Toast.LENGTH_LONG).show();
            return;
        }


        dialogs.setMessage("Logging in...");
        dialogs.show();

        fire.signInWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                dialogs.dismiss();

                if(task.isSuccessful()){
                    finish();
                    if(Objects.equals(email,kfc))
                    startActivity(new Intent(getApplicationContext(), KFC_Home_Page.class));
                    if(Objects.equals(email,mcdonalds))
                        startActivity(new Intent(getApplicationContext(), mcdonalds_home_page.class));
                    if(Objects.equals(email,optp))
                        startActivity(new Intent(getApplicationContext(), optp_home_page.class));
                    if(Objects.equals(email,ranchers))
                        startActivity(new Intent(getApplicationContext(), ranchers_home_page.class));

                }
                else{
                    Intent intent = new Intent(Restaurant_Login.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(Restaurant_Login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view == LOGIN){
            Restaurant_Login();
        }
        if(view == LoginPageSignup){
            startActivity(new Intent(this,Restaurant_Signup.class));
        }
    }
}