package com.api.quackreport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.api.quackreport.R.layout.per_list;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<EarthQuake> earthquakes = QueryList.extractEarthQuackes();
//        earthquakes.add(new EarthQuake("London", "1/12/2020", 7.0));
//        earthquakes.add(new EarthQuake("Tokyo", "1/12/2020", 7.0));
//        earthquakes.add(new EarthQuake("Mexico City", "1/12/2020", 7.0));
//        earthquakes.add(new EarthQuake("Rio de Janeiro", "1/12/2020", 7.0));
//        earthquakes.add(new EarthQuake("London", "1/12/2020", 7.0));
//        earthquakes.add(new EarthQuake("Rio de Janeiro", "1/12/2020", 7.0));
//        earthquakes.add(new EarthQuake("Jammu", "1/12/2020", 7.0));
//        earthquakes.add(new EarthQuake("Bariely", "1/12/2020", 7.0));
//        earthquakes.add(new EarthQuake("Mexico City", "1/12/2020", 7.0));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthQuakeAdapter earthQuakeAdapter = new EarthQuakeAdapter(this ,earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(earthQuakeAdapter);
    }
}