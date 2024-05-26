package ntu.khai.ontap_pheptoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtSoA;
    EditText edtSoB;
    EditText edtKQ;
    Button nutCong,nutTru,nutNhan,nutChia;

    void TimDieuKhien(){
        edtSoA = (EditText) (findViewById(R.id.id_edt_soA));
        edtSoB = (EditText) (findViewById(R.id.id_edt_soB));
        edtKQ = (EditText) findViewById(R.id.id_edtKetQua);
        nutCong = (Button) findViewById(R.id.id_btnCong);
        nutTru = (Button) findViewById(R.id.id_btnTru);
        nutNhan = (Button) findViewById(R.id.id_btnNhan);
        nutChia = (Button) findViewById(R.id.id_btnChia);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

    }

    public void XuLyCong(View v){
        String soA = edtSoA.getText().toString();
        String soB = edtSoB.getText().toString();
        Float so1 = Float.parseFloat(soA);
        Float so2 = Float.parseFloat(soB);
        float kq = so1 + so2;
        String chuoiKQ = String.valueOf(kq);
        edtKQ.setText(chuoiKQ);
    }
    public void XuLyTru(View v){
        String so1 = edtSoA.getText().toString();
        String so2 = edtSoB.getText().toString();
        Float soA = Float.parseFloat(so1);
        Float soB = Float.parseFloat(so2);
        Float kq = soA - soB;
        String chuoiKQ = String.valueOf(kq);
        edtKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){
        String so1 = edtSoA.getText().toString();
        String so2 = edtSoB.getText().toString();
        Float soA = Float.parseFloat(so1);
        Float soB = Float.parseFloat(so2);
        Float kq = soA * soB;
        String chuoiKQ = String.valueOf(kq);
        edtKQ.setText(chuoiKQ);
    }
    public void XuLyChia(View v){
        String so1 = edtSoA.getText().toString();
        String so2 = edtSoB.getText().toString();
        Float soA = Float.parseFloat(so1);
        Float soB = Float.parseFloat(so2);
        Float kq = soA / soB;
        String chuoiKQ = String.valueOf(kq);
        edtKQ.setText(chuoiKQ);
    }

}