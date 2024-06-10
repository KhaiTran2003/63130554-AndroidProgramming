package thi.khai63130554.Dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class WelknownCoffeeFragment extends Fragment {

    public WelknownCoffeeFragment() {
        // Required empty public constructor
    }

    public static WelknownCoffeeFragment newInstance(String param1, String param2) {
        WelknownCoffeeFragment fragment = new WelknownCoffeeFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<String> nguonDuLieu = new ArrayList<String>();
        nguonDuLieu.add("Chạy ngay đi");
        nguonDuLieu.add("Chúng ta không thuộc về nhau");
        nguonDuLieu.add("Nam doi ban tay");
        nguonDuLieu.add("Hãy trao cho anh");
        nguonDuLieu.add("Đừng làm trái tim anh đau");
        ListView lvBaiHat;
        lvBaiHat = (ListView) lvBaiHat.findViewById(R.id.id_listView);
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welknown_coffee, container, false);
    }
}