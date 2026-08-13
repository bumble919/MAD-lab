package com.example.sharedpreferences;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name = findViewById(R.id.edit11);
        TextView no = findViewById(R.id.edit22);
        TextView emails = findViewById(R.id.edit33);
        TextView passwords = findViewById(R.id.edit44);


        String username = getIntent().getStringExtra("Username");
        String ph_no = getIntent().getStringExtra("Mobile");
        String email = getIntent().getStringExtra("Email");
        String password = getIntent().getStringExtra("Password");

        name.setText("Username :"+username);
        no.setText("Mobile :"+ph_no);
        emails.setText("Email :"+email);
        passwords.setText("Password :"+password);





    }
}