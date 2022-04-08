package com.example.nurserymanagementsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Log_in extends Activity {
    Button sign_up,log_in;
    EditText name;
    EditText password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        sign_up = findViewById(R.id.signup_button);
        log_in = findViewById(R.id.login_submit);
        name = (EditText)findViewById(R.id.login_username);
        password = (EditText)findViewById(R.id.login_password);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Log_in.this,Sign_Up.class);
                startActivity(intent);
            }
        });
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("")){
                    if(password.getText().toString().equals("")){
                        Toast.makeText(getApplicationContext(),"Log In Successfully !!!",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Log_in.this, Dashboard.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(getApplicationContext(), "Incorrect Password", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(), "Username Doesn't Exist", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
