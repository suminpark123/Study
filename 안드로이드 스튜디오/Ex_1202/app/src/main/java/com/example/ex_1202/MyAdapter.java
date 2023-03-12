package com.example.ex_1202;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private ArrayList<Member> dataArray;
    private LayoutInflater inflater;


    public MyAdapter(Context context, int layout, ArrayList<Member> dataArray) {
        this.context = context;
        this.layout = layout;
        this.dataArray = dataArray;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dataArray.size();
    }

    @Override
    public Object getItem(int i) {
        return dataArray.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(layout,null);

        TextView tv_name = view.findViewById(R.id.tv_name);
        TextView tv_number = view.findViewById(R.id.tv_number);
        TextView tv_count =view.findViewById(R.id.tv_count);
        TextView tv_rank =view.findViewById(R.id.tv_rank);

        tv_name.setText(dataArray.get(i).getName());
        tv_number.setText(dataArray.get(i).getNumber());
        tv_count.setText(dataArray.get(i).getCount());
        tv_rank.setText(dataArray.get(i).getRank());



        return view;
    }
}
