package com.example.marias;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Menu extends ListActivity {

	String classes[] = { "Start", "Continue", "Marathon", "Statistics",
			"Settings", "Exit" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		

		MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, classes);
		setListAdapter(adapter);
		 
		
		

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub

		super.onListItemClick(l, v, position, id);
		String title = classes[position];

		try {
			Class category = Class.forName("com.example.marias." + title);
			Intent ourIntent = new Intent(Menu.this, category);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
