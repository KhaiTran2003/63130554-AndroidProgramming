package ntu_63130554.cau2_apphenho;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DoiTuongAdapter extends BaseAdapter {

    private ArrayList<DoiTuong> dsDoiTuong;
    private LayoutInflater layoutInflater;
    private Context context;

    public DoiTuongAdapter(Context _context, ArrayList<DoiTuong> dsDoiTuong) {
        this.dsDoiTuong = dsDoiTuong;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return dsDoiTuong.size();
    }

    @Override
    public Object getItem(int position) {
        return dsDoiTuong.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewHienHanh = view;
        if (viewHienHanh == null) {
            viewHienHanh = layoutInflater.inflate(R.layout.item_doituong, viewGroup, false);
        }
        DoiTuong doiTuongHienTai = dsDoiTuong.get(i);
        ImageView imageView = viewHienHanh.findViewById(R.id.id_imgView);
        TextView tv_ho = viewHienHanh.findViewById(R.id.id_ho);
        TextView tv_ten = viewHienHanh.findViewById(R.id.id_ten);
        TextView tv_sdt = viewHienHanh.findViewById(R.id.id_sdt);
        TextView tv_diachi = viewHienHanh.findViewById(R.id.id_diachi);
        TextView tv_gioithieu = viewHienHanh.findViewById(R.id.id_gioithiu);

        imageView.setImageResource(doiTuongHienTai.getIdAvatar());
        tv_ho.setText(doiTuongHienTai.getHo());
        tv_ten.setText(doiTuongHienTai.getTen());
        tv_sdt.setText(doiTuongHienTai.getSdt());
        tv_diachi.setText(doiTuongHienTai.getDiaChi());
        tv_gioithieu.setText(doiTuongHienTai.getGioiThieu());
        return viewHienHanh;
    }
}

