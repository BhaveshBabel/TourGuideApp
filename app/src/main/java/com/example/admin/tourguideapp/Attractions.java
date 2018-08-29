package com.example.admin.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Attractions extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
        String attrName1 = getResources().getString(R.string.attrName1);
        String attrName2 = getResources().getString(R.string.attrName2);
        String attrAdd1 = getResources().getString(R.string.attrAdd1);
        String attrAdd2 = getResources().getString(R.string.attrAdd2);

        ArrayList<Location> words = new ArrayList<Location>();

        words.add(new Location(attrName1, attrAdd1));
        words.add(new Location(attrName2, attrAdd2));
        LocationAdapter adapter = new LocationAdapter(this, words, R.color.attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
