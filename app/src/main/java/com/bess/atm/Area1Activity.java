package com.bess.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Area1Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] kl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area1);
        ListView area1 = (ListView) findViewById(R.id.area1);
        kl = new String[]{"中正區", "暖暖區", "八堵區"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, kl);
        area1.setAdapter(adapter);
        area1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if(position==0){
            String pos1 = "中正區";
            getIntent().putExtra("AREA_A",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(position==1){
            String pos1 = "暖暖區";
            getIntent().putExtra("AREA_A",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(position==2){
            String pos1 = "八堵區";
            getIntent().putExtra("AREA_A",pos1);
            setResult(RESULT_OK,getIntent());
            finish();
        }
    }
}
