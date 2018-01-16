package com.example.simplevalueresource;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String txtNm = getResources().getString(R.string.txtInfo);
        int color= getResources().getColor(R.color.colorPrimaryDark);
        color= ContextCompat.getColor(this, R.color.colorPrimaryDark);
        String mob[]=getResources().getStringArray(R.array.mob);
    }
}
