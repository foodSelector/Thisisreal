package com.example.wldnj.prography_af_project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import net.daum.mf.map.api.*;
import net.daum.mf.map.api.MapView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent= getIntent();
        String text=intent.getStringExtra("a1");
        String text2=intent.getStringExtra("a2");
        String text3=intent.getStringExtra("a3");
        String text4=intent.getStringExtra("a4");



        ArrayList<String> array=new ArrayList<String>();

            array.add(text);
            array.add(text2);
            array.add(text3);
            array.add(text4);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);

        ListView list=(ListView)findViewById(R.id.list_item);
        list.setAdapter(adapter);


       /*MapView mapView = new MapView(this);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
*/

    }

    public void mOnClick2(View v){
        Intent i=new Intent(this,Main3Activity.class);
        startActivity(i);


    }
    public void mOnClick(View v){
        Intent intent=getIntent();
        String mtext=intent.getStringExtra("a3");
        String mtext2=intent.getStringExtra("a2");
        String mtext3=intent.getStringExtra("a1");
        String mtext4=intent.getStringExtra("a4");

        ArrayList<String> array=new ArrayList<String>();
switch(v.getId()){

    case R.id.rankbtn:
        array.add(mtext);
        array.add(mtext2);
        array.add(mtext3);
        array.add(mtext4);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);

        ListView list=(ListView)findViewById(R.id.list_item);
        list.setAdapter(adapter);
        break;

    case R.id.lengthbtn:

        array.add(mtext2);
        array.add(mtext);
        array.add(mtext4);
        array.add(mtext3);

        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);

        ListView list2=(ListView)findViewById(R.id.list_item);
        list2.setAdapter(adapter2);
        break;

    case R.id.pricebtn:
        array.add(mtext4);
        array.add(mtext2);
        array.add(mtext3);
        array.add(mtext);

        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);

        ListView list3=(ListView)findViewById(R.id.list_item);
        list3.setAdapter(adapter3);
        break;
}


        }
    }


