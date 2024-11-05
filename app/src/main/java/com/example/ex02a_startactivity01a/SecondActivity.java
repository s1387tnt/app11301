package com.example.ex02a_startactivity01a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(this);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name");
            String tel = bundle.getString("tel");
            String phone = bundle.getString("phone");
            String email = bundle.getString("email");


            ((TextView) findViewById(R.id.txtView03)).setText("姓名: " + name);
            ((TextView) findViewById(R.id.txtView04)).setText("電話: " + tel);
            ((TextView) findViewById(R.id.txtView05)).setText("手機: " + phone);
            ((TextView) findViewById(R.id.txtView06)).setText("E-mail: " + email);
        }
    }

    @Override
    public void onClick(View v) {
        finish(); // 返回到 MainActivity
    }
}

