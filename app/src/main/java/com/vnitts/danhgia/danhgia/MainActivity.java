package com.vnitts.danhgia.danhgia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etPhoneNumber, etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPhoneNumber = (EditText)findViewById(R.id.etPhone);
        etPass = (EditText)findViewById(R.id.etPassword);
    }

    public void onLogin (View view){
        String phonenum = etPhoneNumber.getText().toString();
        String pass = etPass.getText().toString();
        String type = "login";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, phonenum, pass);
    }
}
