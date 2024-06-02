package ntu.khai.viewpager2_v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class QuocGiaFragment extends Fragment {
    QuocGia quocGia;

    public QuocGiaFragment(QuocGia _quocGia) {
        quocGia = _quocGia;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_quoc_gia, container, false);
        TextView tvName = view.findViewById(R.id.id_name);
        TextView tvDanSo = view.findViewById(R.id.id_population);
        ImageView imgFlag = view.findViewById(R.id.id_img);

        tvName.setText("Quốc gia: "+quocGia.getName());
        tvDanSo.setText("Dân số: "+String.valueOf(quocGia.getPopulation()));
        int resID = view.getResources().getIdentifier(quocGia.getFlag(),
                "mipmap",view.getContext().getPackageName());
        imgFlag.setImageResource(resID);
        return view;
    }
}