package com.example.adaptersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);

        String[]  paises = {"Peru", "Bolivia", "Argentina", "Chile"} ;

        ArrayAdapter<String> miadapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_list_item_1,paises);

        listview.setAdapter(miadapter);
    }
}