package ntu.khai.viewpager2_v2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class QuocGiaPagerAdapter extends FragmentStateAdapter {
    List<QuocGia> lsQuocGia;
    public QuocGiaPagerAdapter(@NonNull FragmentActivity fragmentActivity, List<QuocGia> _lsQuocGia) {
        super(fragmentActivity);
        this.lsQuocGia = _lsQuocGia;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        QuocGia quocGiaX = lsQuocGia.get(position);
        QuocGiaFragment quocGiaFragment = new QuocGiaFragment(quocGiaX);
        return quocGiaFragment;
    }

    @Override
    public int getItemCount() {
        return lsQuocGia.size();
    }
}
