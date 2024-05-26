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

        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = edtSoA.getText().toString();
                Float soA = Float.parseFloat(so1);
                String so2 = edtSoB.getText().toString();
                Float soB = Float.parseFloat(so2);
                Float kq = soA + soB;
                String chuoiKQ = String.valueOf(kq);
                edtKQ.setText(chuoiKQ);
            }
        });
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = edtSoA.getText().toString();
                String so2 = edtSoB.getText().toString();
                Float soA = Float.parseFloat(so1);
                Float soB = Float.parseFloat(so2);
                Float kq = soA - soB;
                String chuoiKQ = String.valueOf(kq);
                edtKQ.setText(chuoiKQ);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = edtSoA.getText().toString();
                String so2 = edtSoB.getText().toString();
                Float soA = Float.parseFloat(so1);
                Float soB = Float.parseFloat(so2);
                Float kq = soA*soB;
                String chuoiKQ = String.valueOf(kq);
                edtKQ.setText(chuoiKQ);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = edtSoA.getText().toString();
                String so2 = edtSoB.getText().toString();
                Float soA = Float.parseFloat(so1);
                Float soB = Float.parseFloat(so2);
                Float kq = soA/soB;
                String chuoiKQ = String.valueOf(kq);
                edtKQ.setText(chuoiKQ);
            }
        });
    }


}