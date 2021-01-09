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

import java.util.ArrayList;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {

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

        TextView city = listItemView.findViewById(R.id.city);
        TextView magnitude = listItemView.findViewById(R.id.magnitude);
        TextView date = listItemView.findViewById(R.id.date);
        String c = currentQuake.getCity();
        String d = currentQuake.getDate();
        double m = currentQuake.getMagnitude();

        city.setText(c);
        date.setText(d);
        magnitude.setText(""+m);

        return listItemView;
    }

    public EarthQuakeAdapter(@NonNull Activity context, ArrayList<EarthQuake> earthqquakes) {
        super(context, 0, earthqquakes);
    }
}
