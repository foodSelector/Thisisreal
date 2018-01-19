package com.example.wldnj.prography_af_project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mOnClick(View v){
        Intent intent=new Intent(this, Main2Activity.class);

    switch(v.getId()){

        case R.id.btn1:
            intent.putExtra("a1","싸움의 고수");
            intent.putExtra("a2","혼밥의 고수");
            intent.putExtra("a3","오늘도나혼자밥");
            intent.putExtra("a4","혼밥혼밥");
            intent.putExtra("a5","혼밥혼밥");
            intent.putExtra("a6","혼밥혼밥");
            intent.putExtra("a7","혼밥혼밥");

            break;
        case R.id.btn2:
            intent.putExtra("a1","밀당의 고수");
            intent.putExtra("a2","연애의 고수");
            intent.putExtra("a3","내이상형은 고수");
            intent.putExtra("a4","쌀국수에 고수");
            break;
        case R.id.btn3:
            intent.putExtra("a1","오늘도너랑");
            intent.putExtra("a2","어제도너였는데");
            intent.putExtra("a3","내일도너일듯");
            intent.putExtra("a4","쌀국수에 고수");


            break;
        case R.id.btn4:
            intent.putExtra("a1","패밀리레스토랑");
            intent.putExtra("a2","아빠카드찬스");
            intent.putExtra("a3","엄마카드찬스");
            intent.putExtra("a4","가족끼리끼리");

            break;
    }
        startActivity(intent);
    }
}
