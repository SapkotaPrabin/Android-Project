package com.example.nurserymanagementsystem;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;

import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Dashboard extends AppCompatActivity  implements PopupMenu.OnMenuItemClickListener {
    ViewPager2 viewPager2;
    TabLayout tabLayout;
    ImageView profile_image;
    Button add_flower;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        getSupportActionBar().hide();
        viewPager2 = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2.setAdapter(new FragmentAdapter(this));
        profile_image = findViewById(R.id.profile_icon);


        profile_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Image Clicked",Toast.LENGTH_SHORT).show();
//                PopupMenu popupMenu = new PopupMenu(Dashboard.this,profile_image);
//                popupMenu.getMenuInflater().inflate(R.menu.profile_popup,popupMenu.getMenu());
//                popupMenu.show();
            }
        });
//        add_flower = findViewById(R.id.add_flower);
//        add_flower.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Button CLICKED",Toast.LENGTH_SHORT).show();
//
//               // show_Addflower();
//            }
//        });

//


        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2,
                new TabLayoutMediator.TabConfigurationStrategy() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:{
                        tab.setText("Flower");
                        tab.setIcon(getResources().getDrawable(R.drawable.ic_sunflower_plant));
                        break;
                    }
                    case 1:{
                        tab.setText("Fruit");
                        tab.setIcon(getResources().getDrawable(R.drawable.ic_coconut_tree_color));
                        break;
                    }
                    case 2:{
                        tab.setText("Forest");
                        tab.setIcon(getResources().getDrawable(R.drawable.ic_pine_trees));
                        break;
                    }

                }
            }
        });tabLayoutMediator.attach();
    }
//    public void ShowMenu(View v){
//        System.exit(0);
//        Toast.makeText(getApplicationContext(),"Profile ",Toast.LENGTH_SHORT).show();
//        PopupMenu popup = new PopupMenu(this,v);
//        popup.setOnMenuItemClickListener(this);
//        popup.inflate(R.menu.profile_popup);
//        popup.show();
//    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.profile:
            case R.id.setting:
            case R.id.logout:
                return true;
            default:
                return false;
        }
    }
//    public void show_Addflower(){
//        AlertDialog.Builder builder = new AlertDialog.Builder(Dashboard.this);
//        builder.setTitle("Add Flower");
//        builder.setCancelable(true);
//        LayoutInflater inflater = getLayoutInflater();
//        View view = inflater.inflate(R.layout.add_flower,null);
//        builder.setView(view);

//            edtFirst = view.findViewById(R.id.edtFirst);
//            edtSecond = view.findViewById(R.id.edtSecond);
//            btnCalculate = view.findViewById(R.id.btnCalculate);
//            showresult = view.findViewById(R.id.txtResult);
//
//            btnCalculate.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    int first,second,result;
//                    first = Integer.parseInt(edtFirst.getText().toString());
//                    second = Integer.parseInt(edtSecond.getText().toString());
//                    result = first + second;
//                    showresult.setText("Result : "+result);
//                }
//            });
//        AlertDialog alert = builder.create();
//        alert.show();
//    }

}
