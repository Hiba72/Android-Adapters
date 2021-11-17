package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        EditText editText=findViewById(R.id.editTextPersonName);
        ListView listView=findViewById(R.id.myListView);
        ArrayList<String> friendList=new ArrayList<String>();
        friendList.add("Irij");
        friendList.add("Hiba");
        friendList.add("Sadia");

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendList);
        listView.setAdapter(arrayAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                friendList.add(editText.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                friendList.remove(position);
                arrayAdapter.notifyDataSetChanged();
            }
        });

    }
}