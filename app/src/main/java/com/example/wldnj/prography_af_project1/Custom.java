package com.example.wldnj.prography_af_project1;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.graphics.drawable.Drawable;

public class Custom extends Activity {
    private Drawable iconDrawable ;
    private String textStr ;

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setText(String text) {
        textStr = text ;
    }

    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getText() {
        return this.textStr ;
    }
}

