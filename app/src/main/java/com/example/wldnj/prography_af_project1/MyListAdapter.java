package com.example.wldnj.prography_af_project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by wldnj on 2018-01-13.
 */

public class MyListAdapter extends BaseAdapter {
    Context maincon;
    LayoutInflater Inflater;
    ArrayList<MyItem> arSrc;
    int layout;

    public MyListAdapter(Context context, int alayout, ArrayList<MyItem> aarSrc){
        maincon=context;
        Inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        arSrc=aarSrc;
        layout=alayout;
    }
    public int getCount(){
        return arSrc.size();
    }
    public String getItem(int position){
        return arSrc.get(position).name;
    }
    public String getItem2(int position){return arSrc.get(position).alphabet;}
    public long getItemId(int position){
        return position;
    }



    public View getView(int position, View convertView, ViewGroup parent){
        final int pos=position;
        if(convertView==null)
        {
            convertView= Inflater.inflate(layout,parent,false);
        }
        TextView txt=(TextView)convertView.findViewById(R.id.text);
        TextView txt2=(TextView)convertView.findViewById(R.id.alpha);

        txt2.setText(arSrc.get(position).alphabet);
        txt.setText(arSrc.get(position).name);



        return convertView;
    }

}

