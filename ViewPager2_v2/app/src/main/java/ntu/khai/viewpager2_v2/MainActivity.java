package ntu.khai.viewpager2_v2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<QuocGia> dsQuocGia;
    ViewPager2 viewPager2;
    QuocGiaPagerAdapter quocGiaPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dsQuocGia = new ArrayList<QuocGia>();
        QuocGia qg1 = new QuocGia("Việt Nam", "img",1000);
        dsQuocGia.add(qg1);
        QuocGia qg2 = new QuocGia("Trung Quốc","img_1",10000);
        dsQuocGia.add(qg2);
        QuocGia qg3 = new QuocGia("Thái Lan","img_2",500);
        dsQuocGia.add(qg3);

        viewPager2.findViewById(R.id.id_viewPager2);
        quocGiaPagerAdapter = new QuocGiaPagerAdapter(this,dsQuocGia);
        viewPager2.setAdapter(quocGiaPagerAdapter);
    }
}