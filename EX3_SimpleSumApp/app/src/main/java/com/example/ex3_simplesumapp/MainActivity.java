package com.example.ex3_simplesumapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etxt_num1, etxt_num2;
    private TextView txt_kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt_num1 = findViewById(R.id.editTextNumber1);
        etxt_num2 = findViewById(R.id.editTextNumber2);
        txt_kq = findViewById(R.id.textViewResult);
    }

    public void calculateSum(View view) {
        int num1 = Integer.parseInt(etxt_num1.getText().toString());
        int num2 = Integer.parseInt(etxt_num2.getText().toString());
        int sum = num1 + num2;
        txt_kq.setText("Kết quả: " + sum);
    }
}