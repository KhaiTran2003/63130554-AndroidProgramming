package com.example.tuhoc;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;

    public void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edt_so1);
        editTextSo2 = (EditText)findViewById(R.id.edt_so2);
        editTextKetQua = (EditText)findViewById(R.id.edt_ketqua);
        nutCong = (Button)findViewById(R.id.btn_cong);
        nutTru = (Button)findViewById(R.id.btn_tru);
        nutNhan = (Button)findViewById(R.id.btn_nhan);
        nutChia = (Button)findViewById(R.id.btn_chia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = editTextSo1.getText().toString();
                String so2 = editTextSo2.getText().toString();

                float num1 = Float.parseFloat(so1);
                float num2 = Float.parseFloat(so2);
                float tong = num1 + num2;
                EditText editTextKetQua = (EditText)findViewById(R.id.edt_ketqua);
                String kq = String.valueOf(tong);
                editTextKetQua.setText(kq);
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = editTextSo1.getText().toString();
                String so2 = editTextSo2.getText().toString();

                float num1 = Float.parseFloat(so1);
                float num2 = Float.parseFloat(so2);
                float tong = num1 - num2;
                EditText editTextKetQua = (EditText)findViewById(R.id.edt_ketqua);
                String kq = String.valueOf(tong);
                editTextKetQua.setText(kq);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = editTextSo1.getText().toString();
                String so2 = editTextSo2.getText().toString();

                float num1 = Float.parseFloat(so1);
                float num2 = Float.parseFloat(so2);
                float tong = num1 * num2;
                EditText editTextKetQua = (EditText)findViewById(R.id.edt_ketqua);
                String kq = String.valueOf(tong);
                editTextKetQua.setText(kq);
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = editTextSo1.getText().toString();
                String so2 = editTextSo2.getText().toString();

                float num1 = Float.parseFloat(so1);
                float num2 = Float.parseFloat(so2);
                float tong = num1 / num2;
                EditText editTextKetQua = (EditText)findViewById(R.id.edt_ketqua);
                String kq = String.valueOf(tong);
                editTextKetQua.setText(kq);
            }
        });
    }
}