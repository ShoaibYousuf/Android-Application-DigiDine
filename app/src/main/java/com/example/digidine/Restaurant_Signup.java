package com.example.digidine;

        import android.app.ProgressDialog;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.database.DatabaseReference;

public class  Restaurant_Signup extends AppCompatActivity {

    //  EditText CITY;
    EditText RESTAURANT_NAME;
    // EditText ADDRESS;
    // EditText FIRST_NAME;
    // EditText LAST_NAME;
    // EditText CONTACT;
    EditText EMAIL;
    EditText PASSWORD;
    Button SIGNUP;
    Button SignupPageLogin;
    ProgressDialog progressDialog;
    private FirebaseAuth fire;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_signup);

        fire = FirebaseAuth.getInstance();
        if(fire.getCurrentUser() !=null){
            finish();
            startActivity(new Intent(getApplicationContext(), KFC_Home_Page.class));
        }
        progressDialog = new ProgressDialog(this);
        //CITY = (EditText) findViewById(R.id.city);
        RESTAURANT_NAME = (EditText) findViewById(R.id.restaurant_name);
        //ADDRESS = (EditText) findViewById(R.id.address);
        //FIRST_NAME = (EditText) findViewById(R.id.first_name);
        //LAST_NAME = (EditText) findViewById(R.id.last_name);
        //CONTACT = (EditText) findViewById(R.id.contact);
        EMAIL = (EditText) findViewById(R.id.email);
        PASSWORD = (EditText) findViewById(R.id.password_signup);
        SIGNUP = (Button) findViewById(R.id.signup);
        SignupPageLogin=(Button) findViewById(R.id.btnLoginforSignupPage) ;
        fire =FirebaseAuth.getInstance();

        //reference= FirebaseDatabase.getInstance().getReference();

        SignupPageLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_page = new Intent(Restaurant_Signup.this, Restaurant_Login.class);
                startActivity(login_page);
            }
        });

        SIGNUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rest_name = RESTAURANT_NAME.getText().toString().trim();
                String email =EMAIL.getText().toString().trim();
                String password = PASSWORD.getText().toString().trim();



                if(rest_name.isEmpty()){
                    RESTAURANT_NAME.setError("Restaurant Name Cannot be Empty");
                    return ;
                }

                if(email.isEmpty()){
                    EMAIL.setError("Email Cannot be empty");
                    return ;
                }

                if(password.isEmpty()){
                    PASSWORD.setError("Password Cannot be empty");
                    return ;
                }

                if(password.length()<6){
                    Toast.makeText(Restaurant_Signup.this,"Password too Short",Toast.LENGTH_SHORT).show();
                }

                progressDialog.setMessage("Registering Restaurant...");
                progressDialog.show();

                fire.createUserWithEmailAndPassword(email,password).addOnCompleteListener(Restaurant_Signup.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText( Restaurant_Signup .this,"Registered Successfully",Toast.LENGTH_LONG).show();
                            finish();
                            startActivity(new Intent(getApplicationContext(), KFC_Home_Page.class));
                        }
                        else{
                            Toast.makeText( Restaurant_Signup .this, "Registration Failed", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }

    /*public void StorageData(){

        //String city = CITY .getEditableText().toString();
        String rest_name = RESTAURANT_NAME.getEditableText().toString();
        //String address = ADDRESS.getEditableText().toString();
        //String First_Name = FIRST_NAME.getEditableText().toString();
        //String Last_Name = LAST_NAME.getEditableText().toString();
        //String Contact = CONTACT.getEditableText().toString();
        String email = EMAIL.getEditableText().toString();
        String password_signup = PASSWORD.getEditableText().toString();

        REST_INFO datasave = new REST_INFO(rest_name,email, password_signup);
        FirebaseUser user= fire.getCurrentUser();
        reference.child(user.getUid()).setValue(datasave);
        Toast.makeText(this,"Information saved..",Toast.LENGTH_LONG).show();
    }

     */

   /* private void Restaurant_Register(){
        //String city =CITY.getText().toString().trim();
        String rest_name = RESTAURANT_NAME.getText().toString().trim();
        //String address =ADDRESS.getText().toString().trim();
        //String first_name =FIRST_NAME.getText().toString().trim();
        //String last_name =LAST_NAME.getText().toString().trim();
        //String contact =CONTACT.getText().toString().trim();
        String email =EMAIL.getText().toString().trim();
        String password = PASSWORD.getText().toString().trim();

        /*if(city.isEmpty()){
            CITY.setError("CITYCannot be empty");
            return ;
        }

         */

       /* if(rest_name.isEmpty()){
            RESTAURANT_NAME.setError("Restaurant Name Cannot be Empty");
            return ;
        }

        */

       /* if(address.isEmpty()){
            ADDRESS.setError("ADDRESS Cannot be empty");
            return;
        }

        */

        /*if(first_name.isEmpty()){
            FIRST_NAME.setError("FIRST NAME Cannot be empty");
            return;
        }

         */

       /* if(last_name.isEmpty()){
            LAST_NAME.setError("LAST NAME Cannot be empty");
            return ;
        }

        */

       /* if(contact.isEmpty()){
            CONTACT.setError("CONTACT Cannot be empty");
            return ;
        }
        */

      /*  if(email.isEmpty()){
            EMAIL.setError("Email Cannot be empty");
            return ;
        }
        */

      /*  if(password.isEmpty()){
            PASSWORD.setError("Password Cannot be empty");
            return ;
        }
        */


       /* dialogs.setMessage("Registering Restaurant...");
        dialogs.show();

        fire.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText( Restaurant_Signup .this,"Registered Successfully",Toast.LENGTH_LONG).show();
                    finish();
                    startActivity(new Intent(getApplicationContext(),Restaurant_Home_Page.class));
                }
                else{
                    Toast.makeText( Restaurant_Signup .this, "Registration Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    */


            ;
        });
    }}