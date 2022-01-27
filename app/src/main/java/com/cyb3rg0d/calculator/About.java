package com.cyb3rg0d.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        final ListView list = findViewById(R.id.supportList);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Report issue");
        arrayList.add("Know more");
        arrayList.add("Contribute");
        arrayList.add("More apps");
        arrayList.add("License");
        String[] urls = {"https://github.com/CYB3R-G0D/Calculator-app/issues",
        "https://github.com/CYB3R-G0D/Calculator-app#readme","https://github.com/CYB3R-G0D/Calculator-app",
        "https://github.com/CYB3R-G0D","https://github.com/CYB3R-G0D/Calculator-app/blob/main/LICENSE"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String) list.getItemAtPosition(position);
                Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                startActivity(openLinkIntent);
            }
        });
    }
}