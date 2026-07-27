package com.example.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.edit1);
        EditText ph_no = findViewById(R.id.edit2);
        EditText email = findViewById(R.id.edit3);
        EditText password = findViewById(R.id.edit4);
        EditText confirmpassword = findViewById(R.id.edit5);
        Button Submit = findViewById(R.id.btn1);

        sharedPreferences=getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor=sharedPreferences.edit();
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString().trim();
                String no = ph_no.getText().toString().trim();
                String emails = email.getText().toString().trim();
                String passwords = password.getText().toString().trim();
                String confirmpasswords = confirmpassword.getText().toString().trim();


                if (name. isEmpty()){
                    username.setError("Username is Empty");
                    username.requestFocus();
                    return;
                }
                if (no.isEmpty()){

                    ph_no.setError("Mobile no. is Empty");
                    ph_no.requestFocus();
                    return;
                }
                if (emails.isEmpty()){
                    email.setError("email no. is Empty");
                    email.requestFocus();
                    return;
                }
                if (passwords.length () <6 ){
                    password.setError("length must be min. 6 character");
                    password.requestFocus();
                    return;
                }
                if (password.equals(confirmpasswords)){
                    confirmpassword.setError("password is not matching");
                    confirmpassword.requestFocus();
                    return;
                }
                Toast.makeText(MainActivity.this, "REGISTRATION SUCESSFULL", Toast.LENGTH_SHORT).show();


                editor.putString("keyusername",name);
                editor.putString("keyphnno.",no);
                editor.putString("keyemail",emails);
                editor.putString("keypassword",confirmpasswords);
                editor.apply();
            }




        });





    }
}