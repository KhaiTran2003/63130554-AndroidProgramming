package com.example.intent_vidu2_nhaplieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NhapLieu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_lieu);
    }
    public void getDataForMain(View v){
        EditText edtName = (EditText) findViewById(R.id.edt_hoten);
        EditText edtSinhVien = (EditText) findViewById(R.id.edt_sinhvientruong);
        String hoTen = edtName.getText().toString();
        String sinhVien = edtSinhVien.getText().toString();
        Intent iGetDataForMain = new Intent();
        iGetDataForMain.putExtra("FN",hoTen);
        iGetDataForMain.putExtra("SV",sinhVien);
        setResult(RESULT_OK,iGetDataForMain);
        finish();
    }
}