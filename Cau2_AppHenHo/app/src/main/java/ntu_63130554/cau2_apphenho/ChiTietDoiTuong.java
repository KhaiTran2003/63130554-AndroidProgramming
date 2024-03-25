package ntu_63130554.cau2_apphenho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChiTietDoiTuong extends AppCompatActivity {
    Button btnExitCTDT = (Button) findViewById(R.id.idbtnexit);
    Button btnChoose = (Button) findViewById(R.id.id_btnchoose);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_doi_tuong);
        btnExitCTDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentQuayVe = new Intent(ChiTietDoiTuong.this, MainActivity.class);
                startActivity(intentQuayVe);
            }
        });
        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChiTietDoiTuong.this, "Chọn thành công!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}