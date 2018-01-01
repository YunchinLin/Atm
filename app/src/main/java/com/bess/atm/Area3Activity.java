package com.bess.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Area3Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area3);
        ListView area1 = (ListView) findViewById(R.id.area3);
        tp = new String[]{"信義區", "大安區", "士林區"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, tp);
        area1.setAdapter(adapter);
        area1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if(position==0){
            String pos3 = "信義區";
            getIntent().putExtra("AREA_C",pos3);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(position==1){
            String pos3 = "大安區";
            getIntent().putExtra("AREA_C",pos3);
            setResult(RESULT_OK,getIntent());
            finish();
        }
        if(position==2){
            String pos3 = "士林區";
            getIntent().putExtra("AREA_C",pos3);
            setResult(RESULT_OK,getIntent());
            finish();
        }
    }
}
