package com.example.nurserymanagementsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Sign_Up extends Activity {
    Button log_in,sign_up;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        log_in = findViewById(R.id.login_button);
        sign_up = findViewById(R.id.signup_submit);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sign_Up.this,Log_in.class);
                startActivity(intent);
            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Account Created Successfully !!!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Sign_Up.this,Log_in.class);
                startActivity(intent);
            }
        });

    }
}
