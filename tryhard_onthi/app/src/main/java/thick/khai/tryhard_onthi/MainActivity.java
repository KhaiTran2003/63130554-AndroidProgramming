package thick.khai.tryhard_onthi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.id_bottom_nav);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                int itemID = item.getItemId();
                if(itemID==R.id.nav_cau1){
                    fragment = new Cau1Fragment();
                }
                else if (itemID==R.id.nav_cau2){
                    fragment = new Cau2Fragment();
                }
                else if(itemID==R.id.nav_cau3){
                    fragment = new Cau3Fragment();
                }
                else if(itemID==R.id.nav_cau4){
                    fragment = new Cau4Fragment();
                }
                else if(itemID==R.id.nav_cau5) {
                    fragment = new Cau5Fragment();
                }
                if(fragment!=null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.id_frag_container,fragment).commit();
                }
                return true;
            }
        });
    }
}