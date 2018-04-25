package com.example.a16022877.sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lvHoliday;
    TextView tvHol;
    TextView tvDate;
    ArrayAdapter aa;
    ArrayList<Holiday> holidayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        lvHoliday=(ListView)this.findViewById(R.id.listviewHol);
        tvHol=(TextView)findViewById(R.id.textViewHol);
        tvDate=(TextView)findViewById(R.id.textViewHol);

        Intent i=getIntent();
        holidayList=new ArrayList<Holiday>();
        holidayList.add(new Holiday("New Year's Day","1 Jan 2017",true));
        holidayList.add(new Holiday("Labour Day","1 May 2017",false));

        aa=new HolidayAdapter(this,R.layout.row,holidayList);
        lvHoliday.setAdapter(aa);

    }
}
