package thick.khai.tryhard_onthi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau1Fragment extends Fragment {
    EditText edt_met ;
    EditText edt_km;
    Button btn_chuyendoi;
    public Cau1Fragment() {
        // Required empty public constructor
    }
    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau1, container, false);
        edt_met = view.findViewById(R.id.edt_donvi_m);
        edt_km = view.findViewById(R.id.edt_donvi_km);
        btn_chuyendoi =view.findViewById(R.id.id_btn_doidonvi);
        btn_chuyendoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duLieuMet = edt_met.getText().toString();
                String duLieuKm = edt_km.getText().toString();
                if(!duLieuMet.isEmpty()){//có nhập mét sẽ đổi sang km
                    try{
                        double met = Double.parseDouble(duLieuMet);
                        double km = met/1000;
                        edt_km.setText(String.format("%.2f",km));

                    }catch (NumberFormatException e){
                        Toast.makeText(getContext(),"Đổi thất bại",Toast.LENGTH_SHORT).show();
                    }
                }
                else{//ngc lại
                    try{
                        double km = Double.parseDouble(duLieuKm);
                        double met = km*1000;
                        edt_met.setText(String.format("%.2f",met));

                    }catch (NumberFormatException e){
                        Toast.makeText(getContext(),"Đổi thất bại",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        return view;
    }
}