package com.example.hazem.list_veiw_train;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hazem on 4/14/2018.
 */

public class Train_Adapter extends ArrayAdapter<String> {
    Context context1;
    public Train_Adapter(@NonNull Context context, int resource, ArrayList<String> l) {
        super(context,0, l);
        context1=context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
          String s=getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }
        TextView textView=(TextView)convertView.findViewById(R.id.TV_tra);
        Toast.makeText(context1, s, Toast.LENGTH_SHORT).show();
        textView.setText(s);
   return  convertView;
}}
