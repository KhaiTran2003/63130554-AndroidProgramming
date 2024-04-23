package com.example.intent_vidu2_nhaplieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChuyenManHinhNhapLieu(View v){
        Intent iChuyenManHinhNhapLieu = new Intent(this, NhapLieu.class);
        startActivity(iChuyenManHinhNhapLieu);
    }
}