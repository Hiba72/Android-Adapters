package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.myListView);
        ArrayList<String> friendList=new ArrayList<String>();
        friendList.add("Irij");
        friendList.add("Hiba");
        friendList.add("Sadia");

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendList);
        listView.setAdapter(arrayAdapter);
    }
}