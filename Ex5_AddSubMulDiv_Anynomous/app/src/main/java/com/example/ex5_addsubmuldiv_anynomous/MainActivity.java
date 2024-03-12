package com.example.ex5_addsubmuldiv_anynomous;

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

        etxt_num1 = findViewById(R.id.etxt_num1);
        etxt_num2 = findViewById(R.id.etxt_num2);
        txt_kq = findViewById(R.id.txt_kq);

        findViewById(R.id.btn_cong).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etxt_num1.getText().toString());
                double num2 = Double.parseDouble(etxt_num2.getText().toString());
                double result = num1 + num2;
                txt_kq.setText("Kết quả: " + result);
            }
        });

        findViewById(R.id.btn_tru).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etxt_num1.getText().toString());
                double num2 = Double.parseDouble(etxt_num2.getText().toString());
                double result = num1 - num2;
                txt_kq.setText("Kết quả: " + result);
            }
        });

        findViewById(R.id.btn_nhan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etxt_num1.getText().toString());
                double num2 = Double.parseDouble(etxt_num2.getText().toString());
                double result = num1 * num2;
                txt_kq.setText("Kết quả: " + result);
            }
        });

        findViewById(R.id.btn_chia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etxt_num1.getText().toString());
                double num2 = Double.parseDouble(etxt_num2.getText().toString());
                if (num2 == 0) {
                    txt_kq.setText("Không thể chia cho số 0");
                } else {
                    double result = num1 / num2;
                    txt_kq.setText("Kết quả: " + result);
                }
            }
        });
    }
}
