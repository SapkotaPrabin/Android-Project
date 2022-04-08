package com.example.nurserymanagementsystem;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Dashboard extends Activity {
    Button flower_board,fruit_board,forest_board;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_dashboard);
        flower_board = findViewById(R.id.flower);
        fruit_board = findViewById(R.id.fruit);
        //forest_board = findViewById(R.id.forest);

        flower_board.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Fragment fragment = new Flower_Fragment();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.myfragment,fragment);
                transaction.commit();
            }
        });
        fruit_board.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Fragment fragment2 = new Fruit_Fragment();
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.myfragment,fragment2);
                transaction.commit();
            }
        });
    }
}
