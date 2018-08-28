package com.example.admin.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView restro = (TextView) findViewById(R.id.restro);
        restro.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restroIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restroIntent);
            }
        }
        ));
        TextView hotels = (TextView) findViewById(R.id.hotels);
        hotels.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelIntent = new Intent(MainActivity.this, Hotels.class);
                startActivity(hotelIntent);
            }
        }
        ));
        TextView attractions = (TextView) findViewById(R.id.attractions);
        attractions.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attrIntent = new Intent(MainActivity.this, Attractions.class);
                startActivity(attrIntent);
            }
        }
        ));
        TextView malls = (TextView) findViewById(R.id.malls);
        malls.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mallsIntent = new Intent(MainActivity.this, Malls.class);
                startActivity(mallsIntent);
            }
        }
        ));
    }
}
