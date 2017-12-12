package com.bess.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {
    private EditText edNickname;
    private EditText edPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        edNickname = (EditText) findViewById(R.id.nickname);
        edPhone = (EditText) findViewById(R.id.phone);
        String nickname = getSharedPreferences("atm", MODE_PRIVATE)
                .   getString("NICKNAME", "");
        edNickname.setText(nickname);
        String phone = getSharedPreferences("atm", MODE_PRIVATE)
                .   getString("PHONE", "");
        edPhone.setText(phone);
    }

    public void back(View view){
        EditText edNickname = (EditText) findViewById(R.id.nickname);
        EditText edPhone = (EditText) findViewById(R.id.phone);
        String nickname = edNickname.getText().toString();
        String phone = edPhone.getText().toString();
        getIntent().putExtra("EXTRA_USERNAME", nickname);
        getIntent().putExtra("EXTRA_PHONENUM", phone);
        setResult(RESULT_OK, getIntent());
        finish();
    }
}
