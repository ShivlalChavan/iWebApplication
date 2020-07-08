package com.example.iwebapp.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iwebapp.Adapter.AbsentListRecyclerAdapter;
import com.example.iwebapp.Adapter.NoOfMonthsSpinnerAdapter;
import com.example.iwebapp.Adapter.NoOfYearSpinnerAdapter;
import com.example.iwebapp.Constants.Constant;
import com.example.iwebapp.Model.AbsentPOJO;
import com.example.iwebapp.Model.MonthsPOJO;
import com.example.iwebapp.Model.YearPOJO;
import com.example.iwebapp.R;
import com.example.iwebapp.ThirdParty.Spinner.SearchableSpinner;

import java.util.ArrayList;

public class AttendanceFragment extends Fragment implements View.OnClickListener {

    private View rootView;
    private ArrayList<YearPOJO> yearsList = new ArrayList<>();
    private ArrayList<MonthsPOJO> monthsList = new ArrayList<>();

    private SearchableSpinner spnMonths,spnYears;
    private NoOfMonthsSpinnerAdapter noOfMonthsSpinnerAdapter;
    private MonthsPOJO monthsPOJO;
    private YearPOJO yearPOJO;
    private NoOfYearSpinnerAdapter noOfYearSpinnerAdapter;

    private ArrayList<AbsentPOJO> absentList = new ArrayList<>();
    private AbsentListRecyclerAdapter recyclerAdapter;
    private RecyclerView absentRecyclerView;

    private LinearLayout llSearch;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_attendance, container, false);

        initViews();


        return rootView;
    }


    private void initViews() {


        spnMonths=(SearchableSpinner)rootView.findViewById(R.id.spnMonths);
        spnYears=(SearchableSpinner)rootView.findViewById(R.id.spnYears);
        llSearch = (LinearLayout)rootView.findViewById(R.id.llSearch);
        absentRecyclerView = (RecyclerView) rootView.findViewById(R.id.absentRecyclerView);
        absentRecyclerView
                .setLayoutManager(new LinearLayoutManager(getActivity()));
        absentRecyclerView.setHasFixedSize(true);
        absentRecyclerView.setItemAnimator(new DefaultItemAnimator());


        monthsList = Constant.getMonths();
        yearsList = Constant.getYears();

        setUpNoOfMonthsSpinner(monthsList);
        setUpYearSpinner(yearsList);

        llSearch.setOnClickListener(this);

        spnMonths.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                try {

                    if (position > 0) {

                        monthsPOJO  = monthsList.get(position);


                        Log.e("Selected", "Month" + monthsPOJO
                                .getMonthName());

                        String desc = monthsPOJO.getMonthName();


                    } else {
                        //setUpHideResonSpinner(true);

                    }


                } catch (Exception e) {
                    Log.e("Error Projected Name", "" + e);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spnYears.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                try {

                    if (position > 0) {

                        yearPOJO  = yearsList.get(position);


                        Log.e("Selected", "year" + yearPOJO
                                .getYearName());

                        String desc = yearPOJO.getYearName();


                    } else {
                        //setUpHideResonSpinner(true);

                    }


                } catch (Exception e) {
                    Log.e("Error Projected Name", "" + e);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void setUpNoOfMonthsSpinner(ArrayList<MonthsPOJO> noOfDaysList) {

        MonthsPOJO pojo = new MonthsPOJO();
        pojo.setMonthId("0");
        pojo.setMonthName("Select Month");

        if(!noOfDaysList.contains(pojo)){
            noOfDaysList.add(0,pojo);
        }

        noOfMonthsSpinnerAdapter = new NoOfMonthsSpinnerAdapter(getActivity(), R.layout.spinner_row, noOfDaysList);
        spnMonths.setTitle(getResources()
                .getString(R.string.no_of_months_label));
        spnMonths.setAdapter(noOfMonthsSpinnerAdapter);

    }

    private void setUpYearSpinner(ArrayList<YearPOJO> list){

        YearPOJO pojo = new YearPOJO();
        pojo.setYearId("0");
        pojo.setYearName("Select Year");

        if(!list.contains(pojo)){
            list.add(0,pojo);
        }

        noOfYearSpinnerAdapter = new NoOfYearSpinnerAdapter(getActivity(),R.layout.spinner_row, list);
        spnYears.setTitle("select year");
        spnYears.setAdapter(noOfYearSpinnerAdapter);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.llSearch:

                setUpAbsentList();

                break;
        }
    }

    private void setUpAbsentList() {

        absentList = Constant.getAbsentList();

        recyclerAdapter  = new AbsentListRecyclerAdapter(getActivity(),absentList);
        absentRecyclerView.setAdapter(recyclerAdapter);

    }
}
