package ntu.khai.ontap_listview_nangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvDienThoai = (ListView) findViewById(R.id.lv_dsDienThoai);

        ArrayList<DienThoai> dsDienThoai = new ArrayList<DienThoai>();
        dsDienThoai.add(new DienThoai("Iphone 15", 30_000_000,"Mô tả",R.drawable.img));
        dsDienThoai.add(new DienThoai("Iphone 14", 30_000_000,"Mô tả",R.drawable.img_1));
        dsDienThoai.add(new DienThoai("Iphone 13", 30_000_000,"Mô tả",R.drawable.img_2));
        dsDienThoai.add(new DienThoai("Iphone 11", 30_000_000,"Mô tả",R.drawable.img_3));
        dsDienThoai.add(new DienThoai("Nokia", 30_000_000,"Mô tả",R.drawable.img_4));
        dsDienThoai.add(new DienThoai("Iphone 15", 30_000_000,"Mô tả",R.drawable.img_5));
        dsDienThoai.add(new DienThoai("Iphone 15", 30_000_000,"Mô tả",R.drawable.img_6));
        dsDienThoai.add(new DienThoai("Iphone 15", 30_000_000,"Mô tả",R.drawable.img_7));
        dsDienThoai.add(new DienThoai("Iphone 15", 30_000_000,"Mô tả",R.drawable.img_8));
        dsDienThoai.add(new DienThoai("Iphone 15", 30_000_000,"Mô tả",R.drawable.img_9));

        DienThoaiAdapter adapter = new DienThoaiAdapter(this,dsDienThoai);
        lvDienThoai.setAdapter(adapter);

        lvDienThoai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DienThoai chonDienThoai = dsDienThoai.get(position);
                Toast.makeText(MainActivity.this,"Bạn chọn mua "+chonDienThoai.getTenDT(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}