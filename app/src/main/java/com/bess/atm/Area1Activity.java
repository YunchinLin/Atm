package com.bess.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Area1Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] areas1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        ListView area1 = (ListView) findViewById(R.id.area1);
        areas1 = new String[]{"中正區", "暖暖區", "八堵區"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, areas1);
        area1.setAdapter(adapter);
        area1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

    }
}
