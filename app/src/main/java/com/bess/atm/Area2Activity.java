package com.bess.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Area2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] ntp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area2);
        ListView area1 = (ListView) findViewById(R.id.area2);
        ntp = new String[]{"永和區", "板橋區", "新莊區"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ntp);
        area1.setAdapter(adapter);
        area1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if(position==0){
            String pos2 = "永和區";
            getIntent().putExtra("AREA_B",pos2);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(position==1){
            String pos2 = "板橋區";
            getIntent().putExtra("AREA_B",pos2);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(position==2){
            String pos2 = "新莊區";
            getIntent().putExtra("AREA_B",pos2);
            setResult(RESULT_OK,getIntent());
            finish();
        }
    }
}
