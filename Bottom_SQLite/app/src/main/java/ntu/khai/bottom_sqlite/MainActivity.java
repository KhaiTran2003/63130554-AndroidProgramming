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
    String DB_PATH_SUFFIX = "/databases/";
    SQLiteDatabase database = null;
    String DATABASE_NAME = "datatest.db";
    ListView lvCau2;
    ArrayList<String> myList;
    ArrayAdapter<String> myAdapter;

    @SuppressLint("MissingInflatedId")
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
        //câu 2
        lvCau2 = findViewById(R.id.lv_cau2);
        myList = new ArrayList<>();
        myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,myList);
        lvCau2.setAdapter(myAdapter);
        CopyDataBaseFormAsset();
        database = openOrCreateDatabase("datatest.db",MODE_PRIVATE,null);
        Cursor c = database.query("dulich",null,null,null,null,null,null);
        String data = "";
        c.moveToFirst();
        while (c.isAfterLast()==false){
            data = c.getString(0)+"-"+c.getString(1)+"-"+c.getString(2)+"-"+c.getString(3);
            4
        }
    }

    //caau2:
    public void CopyDataBaseFormAsset() {
        try {
            InputStream myInput;
            myInput = getAssets().open(DATABASE_NAME);
            String outFileName = getDatabasePath();
            File f = new File(getApplicationInfo().dataDir + DB_PATH_SUFFIX);
            if (!f.exists())
                f.mkdir();
            OutputStream myOutput = new FileOutputStream(outFileName);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = myInput.read(buffer)) > 0) {
                myOutput.write(buffer, 0, length);
            }
            myOutput.flush();
            myOutput.close();
            myInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getDatabasePath() {
        return getApplicationInfo().dataDir + DB_PATH_SUFFIX + DATABASE_NAME;
    }
}
