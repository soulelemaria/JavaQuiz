package com.example.marias;


import com.example.marias.R.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MySimpleArrayAdapter extends ArrayAdapter<String> {
	final Context context;
	final String[] classes;

	public MySimpleArrayAdapter(Context context, String[] values) {
		super(context, R.layout.rowlayout, values);
		this.context = context;
		this.classes = values;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
	    ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		textView.setText(classes[position]);

		String s = classes[position];
		if (s.startsWith("Start")) {
			imageView.setImageResource(R.drawable.test_icon);

		} else if (s.startsWith("Continue")) {
			imageView.setImageResource(R.drawable.burning_folder);
		} else if (s.startsWith("Marathon")) {
			imageView.setImageResource(R.drawable.uni_hat);
		} else if (s.startsWith("Statistics")) {
			imageView.setImageResource(R.drawable.users);
		} else if (s.startsWith("Settings")) {
			imageView.setImageResource(R.drawable.black_settings_folder);
		} else if (s.startsWith("Exit")) {
			imageView.setImageResource(R.drawable.black_folder);
		}
		return rowView;

	}
}
