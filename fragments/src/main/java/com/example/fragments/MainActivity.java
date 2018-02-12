package com.example.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFrag(new ContainerFragment());
    }
    public void loadFrag(android.support.v4.app.Fragment fragment){
        FragmentManager mgr= getSupportFragmentManager();
        FragmentTransaction txn=mgr.beginTransaction();
        txn.replace(R.id.frmCont,fragment);
        txn.commit();


    }
}
