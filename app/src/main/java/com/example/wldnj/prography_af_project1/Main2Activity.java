package com.example.wldnj.prography_af_project1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;


import net.daum.mf.map.api.*;
import net.daum.mf.map.api.MapView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<MyItem> arItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent= getIntent();
        String text=intent.getStringExtra("a1");
        String text2=intent.getStringExtra("a2");
        String text3=intent.getStringExtra("a3");
        String text4=intent.getStringExtra("a4");
        String text5=intent.getStringExtra("a5");
        String text6=intent.getStringExtra("a6");
        String text7=intent.getStringExtra("a7");

        arItem=new ArrayList<MyItem>();
        MyItem mi;
        mi=new MyItem("A",text);arItem.add(mi);
        mi=new MyItem("B",text2);arItem.add(mi);
        mi=new MyItem("C",text3);arItem.add(mi);
        mi=new MyItem("D",text4);arItem.add(mi);
        mi=new MyItem("E",text4);arItem.add(mi);
        mi=new MyItem("F",text4);arItem.add(mi);
        mi=new MyItem("G",text4);arItem.add(mi);


        MyListAdapter MyAdapter = new MyListAdapter(this, R.layout.list,arItem);
        final ListView MyList;
        MyList=(ListView) findViewById(R.id.list_item);
        MyList.setAdapter(MyAdapter);

        final AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Button btn=(Button)view.findViewById(R.id.btn);
                btn.setVisibility(View.VISIBLE);

            }
        };

        MyList.setOnItemClickListener(mItemClickListener);


        /*final ScrollView mScroll=(ScrollView)findViewById(R.id.scroll);
        MyList.setOnTouchListener(new View.OnTouchListener() {
            @Override

            public boolean onTouch(View v, MotionEvent event) {
                mScroll.smoothScrollTo(10,10);
                mScroll.requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });*/

        /*ArrayList<String> array=new ArrayList<String>();

            array.add(text);
            array.add(text2);
            array.add(text3);
            array.add(text4);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);

        ListView list=(ListView)findViewById(R.id.list_item);
        list.setAdapter(adapter);
        list.setOnItemClickListener(mItemClickListener);
*/

    }
    public void mmOnClick(View v){
        Button btn=(Button)findViewById(R.id.btn);
        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
    }

 /*   AdapterView.OnItemClickListener mOnClickListener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
          Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
          startActivity(intent);
        }
    };*/


    public void mOnClick(View v){
        Intent intent= getIntent();
        String text=intent.getStringExtra("a1");
        String text2=intent.getStringExtra("a2");
        String text3=intent.getStringExtra("a3");
        String text4=intent.getStringExtra("a4");


        arItem=new ArrayList<MyItem>();
        MyItem mi;
        mi=new MyItem("A",text);arItem.add(mi);
        mi=new MyItem("B",text2);arItem.add(mi);
        mi=new MyItem("C",text3);arItem.add(mi);
        mi=new MyItem("D",text4);arItem.add(mi);


        MyListAdapter MyAdapter = new MyListAdapter(this, R.layout.list,arItem);
        ListView MyList;
        MyList=(ListView) findViewById(R.id.list_item);
        MyList.setAdapter(MyAdapter);
   /*     Intent intent=getIntent();
        String mtext=intent.getStringExtra("a3");
        String mtext2=intent.getStringExtra("a2");
        String mtext3=intent.getStringExtra("a1");
        String mtext4=intent.getStringExtra("a4");
*/
       /* ArrayList<String> array=new ArrayList<String>();*/

switch(v.getId()){

    case R.id.rankbtn:
/*        array.add(mtext);
        array.add(mtext2);
        array.add(mtext3);
        array.add(mtext4);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);

        ListView list=(ListView)findViewById(R.id.list_item);
        list.setAdapter(adapter);*/
        arItem=new ArrayList<MyItem>();
        MyItem mii;
        mii=new MyItem("A",text2);arItem.add(mii);
        mii=new MyItem("B",text);arItem.add(mii);
        mii=new MyItem("C",text4);arItem.add(mii);
        mii=new MyItem("D",text3);arItem.add(mii);

        MyListAdapter MyAdapter1 = new MyListAdapter(this, R.layout.list,arItem);
        ListView MyList1;
        MyList1=(ListView) findViewById(R.id.list_item);
        MyList1.setAdapter(MyAdapter1);
        break;

    case R.id.lengthbtn:

       /* array.add(mtext2);
        array.add(mtext);
        array.add(mtext4);
        array.add(mtext3);

        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);

        ListView list2=(ListView)findViewById(R.id.list_item);
        list2.setAdapter(adapter2);*/

        arItem=new ArrayList<MyItem>();
        MyItem mi2;
        mi2=new MyItem("A",text3);arItem.add(mi2);
        mi2=new MyItem("B",text);arItem.add(mi2);
        mi2=new MyItem("C",text2);arItem.add(mi2);
        mi2=new MyItem("D",text4);arItem.add(mi2);

        MyListAdapter MyAdapter2 = new MyListAdapter(this, R.layout.list,arItem);
        ListView MyList2;
        MyList2=(ListView) findViewById(R.id.list_item);
        MyList2.setAdapter(MyAdapter2);
        break;

    case R.id.pricebtn:
       /* array.add(mtext4);
        array.add(mtext2);
        array.add(mtext3);
        array.add(mtext);

        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);

        ListView list3=(ListView)findViewById(R.id.list_item);
        list3.setAdapter(adapter3);*/
        arItem=new ArrayList<MyItem>();
        MyItem mi3;
        mi3=new MyItem("A",text3);arItem.add(mi3);
        mi3=new MyItem("B",text4);arItem.add(mi3);
        mi3=new MyItem("C",text);arItem.add(mi3);
        mi3=new MyItem("D",text2);arItem.add(mi3);

        MyListAdapter MyAdapter3 = new MyListAdapter(this, R.layout.list,arItem);
        ListView MyList3;
        MyList3=(ListView) findViewById(R.id.list_item);
        MyList3.setAdapter(MyAdapter3);
        break;


}


        }


    }


