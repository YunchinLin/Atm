package com.bess.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CityActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] cities;
    private String TAG = CityActivity.class.getSimpleName();
    public final static int REQUEST_AREA_K = 7;
    public final static int REQUEST_AREA_N = 9;
    public final static int REQUEST_AREA_T = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        ListView city = (ListView) findViewById(R.id.city);
        cities = new String[]{"基隆市", "新北市", "台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities);
        city.setAdapter(adapter);
        city.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//        Log.d(TAG, "onItemClick:" + position + "/" + cities[position]);
////        TextView tv = (TextView) view;
////        tv.setText(tv.getText() + "*");
        String[] data = null;
        if (position == 0){
            Intent intent = new Intent(this, Area1Activity.class);
            startActivityForResult(intent, REQUEST_AREA_K);
        }else if(position == 1){
            Intent intent = new Intent(this, Area2Activity.class);
            startActivityForResult(intent, REQUEST_AREA_N);
        }else{
            Intent intent = new Intent(this, Area3Activity.class);
            startActivityForResult(intent, REQUEST_AREA_T);
        }
    }
}
