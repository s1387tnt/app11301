package com.example.ex02a_startactivity01a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String name = ((EditText) findViewById(R.id.editText01)).getText().toString();
        String tel = ((EditText) findViewById(R.id.editText02)).getText().toString();
        String phone = ((EditText) findViewById(R.id.editText03)).getText().toString();
        String email = ((EditText) findViewById(R.id.editText04)).getText().toString();


        intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("tel", tel);
        intent.putExtra("phone", phone);
        intent.putExtra("email", email);

        this.startActivity(intent);
    }
}
