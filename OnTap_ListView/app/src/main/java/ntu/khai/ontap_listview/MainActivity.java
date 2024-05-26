package ntu.khai.ontap_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> nguonDuLieu = new ArrayList<String>();
        nguonDuLieu.add("Chạy ngay đi");
        nguonDuLieu.add("Chúng ta không thuộc về nhau");
        nguonDuLieu.add("Nam doi ban tay");
        nguonDuLieu.add("Hãy trao cho anh");
        nguonDuLieu.add("Đừng làm trái tim anh đau");
        ListView lvBaiHat = (ListView) findViewById(R.id.id_listView);
        ArrayAdapter<String> BaiHatAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,nguonDuLieu);
        lvBaiHat.setAdapter(BaiHatAdapter);

        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getValueItem = BaiHatAdapter.getItem(position);
                Toast.makeText(MainActivity.this,"Chọn "+getValueItem,Toast.LENGTH_SHORT).show();
            }
        });
    }
}