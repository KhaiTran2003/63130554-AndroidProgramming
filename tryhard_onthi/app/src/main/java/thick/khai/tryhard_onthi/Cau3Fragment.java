package thick.khai.tryhard_onthi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {

    //Khai báo biến
    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandSpace;

    public Cau3Fragment() {
        // Required empty public constructor
    }

    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //data cho list
        list = new ArrayList<LandScape>();
        list.add(new LandScape("Ảnh 1","img1"));
        list.add(new LandScape("Ảnh 2","img1"));
        list.add(new LandScape("Ảnh 3","img1"));
        list.add(new LandScape("Ảnh 4","img1"));
        list.add(new LandScape("Ảnh 5","img1"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandSpace = view.findViewById(R.id.id_recycleViewCau3);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(view.getContext());
        recyclerViewLandSpace.setLayoutManager(layoutLinear);
        adapter = new LandScapeAdapter(view.getContext(),list);
        recyclerViewLandSpace.setAdapter(adapter);
        return view;
    }
}