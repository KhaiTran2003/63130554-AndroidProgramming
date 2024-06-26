package ntu.khai.bottom_sqlite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        BottomNavigationView bottomNav = findViewById(R.id.id_bottomNav);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemID = item.getItemId();
                if (itemID == R.id.id_navhome) {
                    selectedFragment = new HomeFragment();
                } else if (itemID == R.id.id_navCau1) {
                    selectedFragment = new Cau1Fragment();
                } else if (itemID == R.id.id_navCau2) {
                    selectedFragment = new Cau2Fragment();
                } else if (itemID == R.id.id_navCau3) {
                    selectedFragment = new Cau3Fragment();
                } else if (itemID == R.id.id_navMyProfile) {
                    selectedFragment = new MyProfileFragment();
                }
                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.id_frameLayout, selectedFragment).commit();
                }
                return true;
            }
        });

    }

}
