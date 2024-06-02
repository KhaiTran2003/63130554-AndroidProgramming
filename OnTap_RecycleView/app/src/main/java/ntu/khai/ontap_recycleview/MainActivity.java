package ntu.khai.ontap_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyleViewData;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyleViewData = getDataForRecycleView();
        recyclerViewLandScape = findViewById(R.id.id_recyleview);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this,recyleViewData);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape> getDataForRecycleView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape lc1 = new LandScape("avarta","Its me");
        dsDuLieu.add(lc1);
        dsDuLieu.add(new LandScape("dulich1","du lịch"));
        dsDuLieu.add(new LandScape("dulich2","du lịch"));
        dsDuLieu.add(new LandScape("tinhtoan1","tinhtoan1"));
        dsDuLieu.add(new LandScape("tinhtoan2","dtinhtoan2"));
        return dsDuLieu;
    }
}