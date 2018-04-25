package com.example.a16022877.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
     private ArrayList<Holiday> holiday;
     private Context context;
     private TextView tvDay;
     private TextView tvDate;
     private ImageView img;

     public HolidayAdapter(Context context,int resource,ArrayList<Holiday> object){
         super(context,resource,object);
         //store holidat that is passed to the adapter
         holiday=object;
         //store context object as we would need to use it later
         this.context=context;

     }

     // getView() is the method ListView will call to get the View object every time ListView needs a row
    @Override
    public View getView(int position, View converView, ViewGroup parent){
        // The usual way to get the LayoutInflater object to "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        //Get TV and IMG object
        tvDay=(TextView)rowView.findViewById(R.id.textViewHol);
        tvDate=(TextView)rowView.findViewById(R.id.textViewDate);
        img=(ImageView)rowView.findViewById(R.id.imageViewHol);
        // The parameter "position" is the index of the row ListView is requesting. We get back the holiday at the same index.
        Holiday currentHol=holiday.get(position);
        //set tv to show holiday
        tvDay.setText(currentHol.getDay());
        tvDate.setText(currentHol.getDate());

        //set image accordingly
        if(currentHol.isImg()){
            img.setImageResource(R.drawable.newyear);
        }else{
            img.setImageResource(R.drawable.labourday);
        }
        return rowView;
    }
}
