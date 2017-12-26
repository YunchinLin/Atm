package com.bess.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {

    private Spinner spCity;
    private Spinner spArea;
    private String TAG = AddrActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        spCity = (Spinner) findViewById(R.id.sp_city);
        spArea = (Spinner) findViewById(R.id.sp_area);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, new String[]{"基隆市", "新北市", "台北市"});
        spCity.setAdapter(adapter);
        spCity.setOnItemSelectedListener(new  AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String[] data = null;
                if (position == 0){
                    data = new String[]{"中正區", "暖暖區", "八堵區"};
                }else if(position == 1){
                    data = new String[]{"永和區", "板橋區", "新莊區"};
                }else{
                    data = new String[]{"信義區", "大安區", "士林區"};
                }
                ArrayAdapter adapter1 = new ArrayAdapter(AddrActivity.this, android.R.layout.simple_list_item_1, data);
                spArea.setAdapter(adapter1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}