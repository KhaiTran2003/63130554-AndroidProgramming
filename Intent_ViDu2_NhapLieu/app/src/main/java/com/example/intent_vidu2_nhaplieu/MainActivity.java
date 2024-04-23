package com.example.intent_vidu2_nhaplieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChuyenManHinhNhapLieu(View v){
        Intent iChuyenManHinhNhapLieu = new Intent(this, NhapLieu.class);
        startActivityForResult(iChuyenManHinhNhapLieu,500);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode==500)
            if(resultCode==RESULT_OK){
                String hoTen = data.getStringExtra("FN");
                String sinhVienTruong = data.getStringExtra("SV");
                TextView tvName = (TextView) findViewById(R.id.edt_hoten);
                TextView tvSinhVien  =(TextView) findViewById(R.id.edt_sinhvientruong);
                tvName.setText(hoTen);
                tvSinhVien.setText(sinhVienTruong);
            }
            else
                Toast.makeText(this,"Trả về thất bại",Toast.LENGTH_LONG);
        else
            super.onActivityResult(requestCode,resultCode,data);

    }
}