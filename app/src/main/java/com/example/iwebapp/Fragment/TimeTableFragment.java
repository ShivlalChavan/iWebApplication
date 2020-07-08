package com.example.iwebapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iwebapp.Adapter.AbsentListRecyclerAdapter;
import com.example.iwebapp.Adapter.TimeTableListRecyclerAdapter;
import com.example.iwebapp.Constants.Constant;
import com.example.iwebapp.Model.TimeTablePOJO;
import com.example.iwebapp.R;

import java.util.ArrayList;

public class TimeTableFragment extends Fragment  implements View.OnClickListener{


    private View rootView;

    private ArrayList<TimeTablePOJO> timeTableList = new ArrayList<>();
    private TimeTableListRecyclerAdapter recyclerAdapter;
    private RecyclerView timeTableRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_timetable, container, false);

        initViews();

        return rootView;
    }


    private void initViews() {

        timeTableRecyclerView = (RecyclerView) rootView.findViewById(R.id.timeTableRecyclerView);
        timeTableRecyclerView
                .setLayoutManager(new LinearLayoutManager(getActivity()));
        timeTableRecyclerView.setHasFixedSize(true);
        timeTableRecyclerView.setItemAnimator(new DefaultItemAnimator());

        setUpRecyclerView();

    }

    private void setUpRecyclerView() {

        timeTableList = Constant.getTimeTable();
        recyclerAdapter = new TimeTableListRecyclerAdapter(getActivity(),timeTableList);
        timeTableRecyclerView.setAdapter(recyclerAdapter);

    }

    @Override
    public void onClick(View v) {

    }
}
