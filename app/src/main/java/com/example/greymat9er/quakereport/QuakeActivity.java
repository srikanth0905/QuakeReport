package com.example.greymat9er.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class QuakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = QuakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);


        //create a fake list of earthquake locations
        ArrayList<String> earthquakes = new ArrayList<>();
        earthquakes.add("San Francisco");
        earthquakes.add("London");
        earthquakes.add("Tokyo");
        earthquakes.add("Mexico");
        earthquakes.add("Rio");
        earthquakes.add("Paris");
        earthquakes.add("Moscow");

        //Find reference to the ListView in the layout file
        ListView earthquakeListView = findViewById(R.id.list);

        //Create a new ArrayAdapter of earthquakes
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                earthquakes);

        //Set the adapter on the listView,
        //so the list can be populated in the interface
        earthquakeListView.setAdapter(adapter);
    }
}
