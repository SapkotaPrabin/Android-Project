package com.example.nurserymanagementsystem;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Calendar;

public class Vegetable_Fragment extends Fragment {
    Button add;
    EditText sow_date;
    int day,month,year;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vegetable_fragment,container,false);
        add = view.findViewById(R.id.add_veg);
        Calendar calendar = Calendar.getInstance();
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view2) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Add Vegetable");
                builder.setCancelable(true);
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.add_vegetable,null);
                builder.setView(view);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        return view;
    }

}
