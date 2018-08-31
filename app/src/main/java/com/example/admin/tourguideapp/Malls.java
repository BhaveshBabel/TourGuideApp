package com.example.admin.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Malls extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);
        String mallName1 = getResources().getString(R.string.mallName1);
        String mallName2 = getResources().getString(R.string.mallName2);
        String mallAdd1 = getResources().getString(R.string.mallAdd1);
        String mallAdd2 = getResources().getString(R.string.mallAdd2);

        ArrayList<Location> words = new ArrayList<Location>();

        words.add(new Location(mallName1, mallAdd1, R.drawable.celebration));
        words.add(new Location(mallName2, mallAdd2, R.drawable.lakecity));

        LocationAdapter adapter = new LocationAdapter(this, words, R.color.malls);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
