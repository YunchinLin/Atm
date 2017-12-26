package com.bess.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Area2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] areas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area2);
        ListView area1 = (ListView) findViewById(R.id.area2);
        areas2 = new String[]{"永和區", "板橋區", "新莊區"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, areas2);
        area1.setAdapter(adapter);
        area1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

    }
}
