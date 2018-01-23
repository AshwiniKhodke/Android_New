package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by intel on 22/01/2018.
 */

public class MyAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<MyItem> dataSet;
    private LayoutInflater inflater;
    private android.view.ViewGroup parent;

    public MyAdapter(Context context, ArrayList<MyItem> dataSet){
        this.context=context;
        this.dataSet=dataSet;
        inflater =LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int i) {

        return dataSet.get(i) ;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
         View view = inflater.inflate(R.layout.grid_item, parent, false);
        ((ImageView)view.findViewById(R.id.imgVw)).setImageResource(dataSet.get(i).img);
        ((TextView) view.findViewById(R.id.txtSt)).setText(dataSet.get(i).txt);

        
        
        return view;
    }
}
