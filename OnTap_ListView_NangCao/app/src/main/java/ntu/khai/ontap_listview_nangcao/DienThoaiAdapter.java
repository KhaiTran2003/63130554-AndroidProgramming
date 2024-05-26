package ntu.khai.ontap_listview_nangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DienThoaiAdapter extends BaseAdapter {
    private ArrayList<DienThoai> dsDienThoai;
    private LayoutInflater layoutInflater;
    private Context context;

    public DienThoaiAdapter(Context context, ArrayList<DienThoai> dsDienThoai) {
        this.dsDienThoai = dsDienThoai;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsDienThoai.size();
    }

    @Override
    public Object getItem(int position) {
        return dsDienThoai.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewHienHanh = convertView;
        if(viewHienHanh==null){
            viewHienHanh = layoutInflater.inflate(R.layout.layout_item_dienthoai,null);

            DienThoai dienThoaiHienTai = dsDienThoai.get(position);
            TextView tvTenMon = (TextView) viewHienHanh.findViewById(R.id.id_tvTenDT);
            TextView tvDonGia = (TextView) viewHienHanh.findViewById(R.id.id_tvGia);
            TextView tvMoTa = (TextView) viewHienHanh.findViewById(R.id.id_tvMoTa);
            ImageView imgAnh = (ImageView) viewHienHanh.findViewById(R.id.id_img);
            tvTenMon.setText(dienThoaiHienTai.getTenDT());
            tvDonGia.setText(String.valueOf(dienThoaiHienTai.getDonGia()));
            tvMoTa.setText(dienThoaiHienTai.getMoTa());
            imgAnh.setImageResource(dienThoaiHienTai.getIdAnhMinhHoa());
        }
        return viewHienHanh;
    }
}
