package ntu_63130554.cau2_apphenho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnView;
    Button btnNext;
    Button btnExit;
    void TimDieuKhien(){
        btnView = (Button) findViewById(R.id.id_btnView);
        btnNext = (Button) findViewById(R.id.id_btnnext);
        btnExit = (Button) findViewById(R.id.id_btnexit);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] ds_ho = {"Trần", "Nguyễn", "Lê", "Đinh", "Tống", "Bùi"};
        String[] ds_Ten = {"Đình Huy", "Văn Linh", "Tuấn Nam", "Khánh Trang", "Hồng An", "Trọng Minh", "Xuân Thảo", "Thanh Tùng", "Văn Dũng", "Kim Hoa"};
        String[] ds_SDT = {"090876653", "088769231", "099991221", "076666223", "0423843823", "099912125", "098357238", "273597923"};
        String[] ds_DC = {"Nha Trang", "Phú Yên", "Cam Ranh", "Hà Nội", "TP.HCM", "Bình Thuận", "Cà Mau", "Vĩnh Phúc"};
        String[] ds_GT = {"Hiền lành, Giàu, Body đẹp", "Cá tính, Dễ nóng, Hiểu chuyện", "Vui vẻ, Hòa đồng"};
        int[] ds_img = {R.drawable.img,R.drawable.img_1, R.drawable.img_2,
                R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,
                R.drawable.img_7,R.drawable.img_8,R.drawable.img_9};

        Random rand = new Random();
        ArrayList<DoiTuong> dsdt = new ArrayList<DoiTuong>();

        for (int i = 0; i < 5; i++) {
            int ho = rand.nextInt(ds_ho.length);
            int ten = rand.nextInt(ds_Ten.length);
            int sdt = rand.nextInt(ds_SDT.length);
            int dc = rand.nextInt(ds_DC.length);
            int gt = rand.nextInt(ds_GT.length);
            dsdt.add(new DoiTuong(ds_ho[ho], ds_Ten[ten], ds_SDT[sdt], ds_DC[dc], ds_GT[gt], R.drawable.img));
        }

        ListView LVDoiTuong = findViewById(R.id.lv_dsdoituong);
        DoiTuongAdapter dt_adapter = new DoiTuongAdapter(this, dsdt);
        LVDoiTuong.setAdapter(dt_adapter);

        EditText edt_tenChon = findViewById(R.id.id_tenChon);
        LVDoiTuong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DoiTuong selectedDoiTuong = dsdt.get(position);
                String selectedName = selectedDoiTuong.getHo() + " " + selectedDoiTuong.getTen();
                edt_tenChon.setText(selectedName);
            }
        });


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Random các đối tượng mới
                ArrayList<DoiTuong> newDsdt = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    int ho = rand.nextInt(ds_ho.length);
                    int ten = rand.nextInt(ds_Ten.length);
                    int sdt = rand.nextInt(ds_SDT.length);
                    int dc = rand.nextInt(ds_DC.length);
                    int gt = rand.nextInt(ds_GT.length);
                    int img = rand.nextInt(ds_img.length);
                    newDsdt.add(new DoiTuong(ds_ho[ho], ds_Ten[ten], ds_SDT[sdt], ds_DC[dc], ds_GT[gt], ds_img[img]));
                }

                dsdt.clear();
                dsdt.addAll(newDsdt);
                dt_adapter.notifyDataSetChanged();
            }
        });
        //Chi tiết đối tươgnj
        TimDieuKhien();
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChiTietDT = new Intent(MainActivity.this, ChiTietDoiTuong.class);
                startActivity(intentChiTietDT);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
