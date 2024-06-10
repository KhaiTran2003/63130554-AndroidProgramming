package thi.khai63130554.Dethi2;

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
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemID = item.getItemId();
                if (itemID == R.id.id_home) {
                    selectedFragment = new WelcomeFragment();
                } else if (itemID == R.id.id_unit) {
                    selectedFragment = new UnitFragment();
                } else if (itemID == R.id.id_welkcoffee) {
                    selectedFragment = new WelknownCoffeeFragment();
                } else if (itemID == R.id.id_subjects) {
                    selectedFragment = new SubjectsFragment();
                } else if (itemID == R.id.id_myCV) {
                    selectedFragment = new MyCVFragment();
                }
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_Main, selectedFragment).commit();
                }
                return true;
            }
        });
    }
}