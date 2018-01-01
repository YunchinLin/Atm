package com.bess.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {
    private EditText edNickname;
    private EditText edPhone;
    private static final String TAG = UserInfoActivity.class.getSimpleName();
    private Spinner ages;
    public final static int REQUEST_ADDRESS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        ages = (Spinner) findViewById(R.id.ages);
//        ArrayList<String> data = new ArrayList<>();
//        for (int i = 15; i<=40; i++){
//            data.add(i+"");
//        }
//        String[] data = getResources().getStringArray(R.array.ages);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.aaa, android.R.layout.simple_list_item_1);
        ages.setAdapter(adapter);
        edNickname = (EditText) findViewById(R.id.nickname);
        edPhone = (EditText) findViewById(R.id.phone);
        String nickname = getSharedPreferences("atm", MODE_PRIVATE)
                .   getString("NICKNAME", "");
        edNickname.setText(nickname);
        String phone = getSharedPreferences("atm", MODE_PRIVATE)
                .   getString("PHONE", "");
        edPhone.setText(phone);
    }

    public void ok(View view){
        Log.d(TAG, "ok:" + ages.getSelectedItem().toString());
        int age = Integer.parseInt(ages.getSelectedItem().toString());
        EditText edNickname = (EditText) findViewById(R.id.nickname);
        EditText edPhone = (EditText) findViewById(R.id.phone);
        String nickname = edNickname.getText().toString();
        String phone = edPhone.getText().toString();
        getIntent().putExtra("EXTRA_USERNAME", nickname);
        getIntent().putExtra("EXTRA_PHONENUM", phone);
        setResult(RESULT_OK, getIntent());
        finish();
    }

    public void addr(View view){
//        startActivity(new Intent(this,AddrActivity.class));
        Intent intent = new Intent(this,CityActivity.class);
        startActivityForResult(intent ,REQUEST_ADDRESS);
    }

}
