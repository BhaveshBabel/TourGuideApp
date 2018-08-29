package com.example.admin.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        String hotelName1 = getResources().getString(R.string.hotelName1);
        String hotelName2 = getResources().getString(R.string.hotelName2);
        String hotelAdd1 = getResources().getString(R.string.hotelAdd1);
        String hotelAdd2 = getResources().getString(R.string.hotelAdd2);

        ArrayList<Location> words = new ArrayList<Location>();

        words.add(new Location(hotelName1, hotelAdd1));
        words.add(new Location(hotelName2, hotelAdd2));

        LocationAdapter adapter = new LocationAdapter(this, words, R.color.hotels);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}