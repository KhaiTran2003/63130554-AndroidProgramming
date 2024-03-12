package com.example.ex4_addsubmuldiv_onclick;

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
    }

    public void XULY_CONG(View view) {
        double num1 = Double.parseDouble(etxt_num1.getText().toString());
        double num2 = Double.parseDouble(etxt_num2.getText().toString());
        double result = num1 + num2;
        txt_kq.setText("Kết quả: " + result);
    }

    public void XULY_TRU(View view) {
        double num1 = Double.parseDouble(etxt_num1.getText().toString());
        double num2 = Double.parseDouble(etxt_num2.getText().toString());
        double result = num1 - num2;
        txt_kq.setText("Kết quả: " + result);
    }

    public void XULY_NHAN(View view) {
        double num1 = Double.parseDouble(etxt_num1.getText().toString());
        double num2 = Double.parseDouble(etxt_num2.getText().toString());
        double result = num1 * num2;
        txt_kq.setText("Kết quả: " + result);
    }

    public void XULY_CHIA(View view) {
        double num1 = Double.parseDouble(etxt_num1.getText().toString());
        double num2 = Double.parseDouble(etxt_num2.getText().toString());
        if (num2 == 0) {
            txt_kq.setText("Không thể chia cho số 0");
        } else {
            double result = num1 / num2;
            txt_kq.setText("Kết quả: " + result);
        }
    }
}
