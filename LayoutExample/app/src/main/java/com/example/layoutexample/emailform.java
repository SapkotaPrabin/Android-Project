package com.example.layoutexample;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class emailform extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        final Button send=(Button) findViewById(R.id.example);
        send.setText("Submit");
    }
}
