package com.api.quackreport;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {
    private static final String LOCATION_SEPARATOR = " of ";

    //Function to COnvert Date and Time in UNIX format to Normal Format
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.per_list,
                    parent,
                    false
            );
        }
        //Getting Position
        EarthQuake currentQuake = getItem(position);

        TextView prim_loc = listItemView.findViewById(R.id.primary_loc);
        TextView sec_loc = listItemView.findViewById(R.id.secondary_loc);
        TextView magnitude = listItemView.findViewById(R.id.magnitude);
        TextView date = listItemView.findViewById(R.id.date);
        TextView time = listItemView.findViewById(R.id.time);
        Date dateObject = new Date(currentQuake.getTimeinmilisec());

        String originalLocation = currentQuake.getCity();
        String d = formatDate(dateObject);
        double m = currentQuake.getMagnitude();
        String formattedTime = formatTime(dateObject);
        String primaryLocation;
        String locationOffset;

        //Function to Break Original string using LOCATION SEPARATOR
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }

        //Setting Text to Text View
        prim_loc.setText(primaryLocation);
        sec_loc.setText(locationOffset);
        date.setText(d);
        magnitude.setText(""+m);
        time.setText(formattedTime);

        return listItemView;
    }

    public EarthQuakeAdapter(@NonNull Activity context, ArrayList<EarthQuake> earthqquakes) {
        super(context, 0, earthqquakes);
    }
}
