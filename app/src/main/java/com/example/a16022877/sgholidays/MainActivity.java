package com.example.a16022877.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvType;
    ArrayAdapter<String> aaYear;
    ArrayList<String> alType;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvType=(ListView)findViewById(R.id.listViewType);

        alType = new ArrayList<String>();
        alType.add("Secular");


        aaYear = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, (List<String>) lvType);
        lvType.setAdapter(aaYear);

        lvType.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lvType, View view, int position, long id) {
                String Year = (String) lvType.getAdapter().getItem(position);
                Intent intent = new Intent(lvType.getContext(), SecondActivity.class);
                intent.putExtra("year", Year);

                startActivity(intent);
            }
        });

    }
}
