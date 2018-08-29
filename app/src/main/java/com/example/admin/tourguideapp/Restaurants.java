package com.example.admin.tourguideapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {
    private Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        String restroName1 = getResources().getString(R.string.restroName1);
        String restroName2 = getResources().getString(R.string.restroName2);
        String restroAdd1 = getResources().getString(R.string.restroAdd1);
        String restroAdd2 = getResources().getString(R.string.restroAdd2);

        ArrayList<Location> words = new ArrayList<Location>();

        words.add(new Location(restroName1, restroAdd1, R.drawable.rdb));
        words.add(new Location(restroName2, restroAdd2, R.drawable.sm));

        LocationAdapter adapter = new LocationAdapter(this, words, R.color.restro1);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}