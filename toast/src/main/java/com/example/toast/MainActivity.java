package com.example.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void Show(View view){
           // Toast.makeText(this,"Toast",Toast.LENGTH_SHORT);
            //Custom Toast
            Toast toast=Toast.makeText(this,"Custom",Toast.LENGTH_LONG);
            toast.setView(new Button(this));
            toast.show();


    }
}
