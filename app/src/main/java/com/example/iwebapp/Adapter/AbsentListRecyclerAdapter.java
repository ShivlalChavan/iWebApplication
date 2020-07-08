package com.example.iwebapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.iwebapp.Model.AbsentPOJO;
import com.example.iwebapp.R;

import java.util.ArrayList;

public class AbsentListRecyclerAdapter extends RecyclerView.Adapter<AbsentListRecyclerAdapter.ViewHolder> {

    private Context globalContext;
    private ArrayList<AbsentPOJO> dataList;


    public AbsentListRecyclerAdapter(Context context, ArrayList<AbsentPOJO> list){
        this.globalContext=context;
        this.dataList=list;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View poNoView = inflater.inflate(R.layout.row_layout_for_absent_list, viewGroup,
                false);



        AbsentListRecyclerAdapter.ViewHolder viewHolder=new AbsentListRecyclerAdapter.ViewHolder(poNoView);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

  if(!dataList.isEmpty()){

      AbsentPOJO pojo = dataList.get(i);

      if(!pojo.getAbsentDate().isEmpty()){

          viewHolder.txtAbsent.setText(pojo.getAbsentDate());
      }

  }




    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txtAbsent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtAbsent=(TextView)itemView.findViewById(R.id.txtAbsent);


        }

        @Override
        public void onClick(View v) {


        }
    }


}
