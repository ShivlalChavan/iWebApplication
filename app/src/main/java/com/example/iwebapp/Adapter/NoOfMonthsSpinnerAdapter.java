package com.example.iwebapp.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.iwebapp.Model.MonthsPOJO;
import com.example.iwebapp.R;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Admin on 15/04/2017.
 */


public class NoOfMonthsSpinnerAdapter extends ArrayAdapter<MonthsPOJO>
        implements
        Serializable
{

    private Context context;
    ArrayList<MonthsPOJO> dataList = new ArrayList<MonthsPOJO>();
    LayoutInflater flater;


    public NoOfMonthsSpinnerAdapter(Context context, int resource,
                                    ArrayList<MonthsPOJO> dataList)
    {
        super(context, resource, dataList);
        this.context = context;
        this.dataList = dataList;
        flater = ((AppCompatActivity) context).getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        MonthsPOJO ageListPOJO = getItem(position);

        View rowview = flater.inflate(R.layout
                .spinner_row, null, false);

      // Utility.overrideFonts(context, rowview); //Set Custom fonts
        TextView txtTitle = (TextView) rowview.findViewById(R.id.cust_view);
        txtTitle.setTextColor(context.getResources().getColor(R.color.textColorBlue));
        txtTitle.setText(ageListPOJO.getMonthName());


        return rowview;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent)
    {
        View row = convertView;
        try
        {
            if (row == null)
            {
                //inflate your customlayout for the textview
                LayoutInflater inflater = ((AppCompatActivity) context).getLayoutInflater();
                row = inflater.inflate(R.layout.spinner_row, parent, false);
              //  Utility.overrideFonts(context, row); //Set Custom fonts
            }
            MonthsPOJO ageListPOJO = dataList.get(position);
            if (ageListPOJO != null)
            {
                TextView text1 = (TextView) row.findViewById(R.id.cust_view);
                text1.setTextColor(context.getResources().getColor(R.color.textColorBlue));

                text1.setText(ageListPOJO.getMonthName());
            }
        }
        catch (Exception e)
        {
            Log.e("Error in Duration", "" + e);
        }

        return row;
    }

}