package com.example.jayesh.bustrack;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import Modules.Route;

public class Info extends Activity {

    TextView departure,arrival,depStop,arrStop,busName,stoppage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_info);

        departure=(TextView)findViewById(R.id.tv6);
        arrival=(TextView)findViewById(R.id.tv7);
        depStop=(TextView)findViewById(R.id.tv8);
        arrStop=(TextView)findViewById(R.id.tv9);
        busName=(TextView)findViewById(R.id.tv10);
        stoppage=(TextView)findViewById(R.id.tv12);


        Intent intent = getIntent();

        String v1 = intent.getStringExtra("1");
        String v2 = intent.getStringExtra("2");
        String v3 = intent.getStringExtra("3");
        String v4 = intent.getStringExtra("4");
        String v5 = intent.getStringExtra("5");
        String v6 = intent.getStringExtra("6");

        //The key argument here must match that used in the other activity
        departure.setText(v1);
        arrival.setText(v2);
        depStop.setText(v3);
        arrStop.setText(v4);
        busName.setText(v5);
        stoppage.setText(v6);


    }








}
