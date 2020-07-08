package com.example.iwebapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iwebapp.Model.TimeTablePOJO;
import com.example.iwebapp.Model.TimeTablePOJO;
import com.example.iwebapp.R;

import java.util.ArrayList;

public class TimeTableListRecyclerAdapter extends RecyclerView.Adapter<TimeTableListRecyclerAdapter.ViewHolder> {

    private Context globalContext;
    private ArrayList<TimeTablePOJO> dataList;
    private int  RIGHT_POSITION=1,LEFT_POSITION=2;


    public TimeTableListRecyclerAdapter(Context context, ArrayList<TimeTablePOJO> list){
        this.globalContext=context;
        this.dataList=list;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View poNoView = null;

        if(viewType == RIGHT_POSITION){


            poNoView =LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.row_layout_for_black_side_list,viewGroup,false);
        }
        else if (viewType == LEFT_POSITION)
        {
            poNoView = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.row_layout_for_gray_side_list, viewGroup, false);
        }


       return new TimeTableListRecyclerAdapter.ViewHolder(poNoView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

  if(!dataList.isEmpty()){

      TimeTablePOJO pojo = dataList.get(i);

      if(!pojo.getTiming().isEmpty()){

          viewHolder.txtTime.setText(pojo.getTiming());
      }

      if(!pojo.getLecture().isEmpty()){

          viewHolder.txtLecture.setText(pojo.getLecture());
      }

  }




    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position) {

        if(position == 0){
            return  RIGHT_POSITION;
        }

        if(position % 2 == 0){

            return RIGHT_POSITION;

        }else  if( position % 2 != 0){

            return LEFT_POSITION;
        }

        return position;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txtTime , txtLecture;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTime=(TextView)itemView.findViewById(R.id.txtTime);

            txtLecture=(TextView)itemView.findViewById(R.id.txtLecture);


        }

        @Override
        public void onClick(View v) {


        }
    }


}
