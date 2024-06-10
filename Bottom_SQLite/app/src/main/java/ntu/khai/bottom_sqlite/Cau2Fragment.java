package ntu.khai.bottom_sqlite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Cau2Fragment extends Fragment {
    String DB_PATH_SUFFIX = "/databases/";
    SQLiteDatabase database = null;
    String DATABASE_NAME = "datatest.db";
    ListView lvCau2;
    ArrayList<String> myList;
    ArrayAdapter<String> myAdapter;

    @SuppressLint("MissingInflatedId")
    public Cau2Fragment() {
        // Required empty public constructor
    }

    public static Cau2Fragment newInstance() {
        Cau2Fragment fragment = new Cau2Fragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cau2, container, false);

        lvCau2 = view.findViewById(R.id.lv_cau2);
        myList = new ArrayList<>();
        myAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, myList);
        lvCau2.setAdapter(myAdapter);

        CopyDataBaseFormAsset();
        loadDatabaseData();

        return view;
    }

    // Load data from database and update ListView
    private void loadDatabaseData() {
        String dbPath = getDatabasePath();
        database = SQLiteDatabase.openOrCreateDatabase(dbPath, null);
        Cursor c = database.query("dulich", null, null, null, null, null, null);
        if (c != null) {
            c.moveToFirst();
            while (!c.isAfterLast()) {
                String data = c.getString(0) + "-" + c.getString(1) + "-" + c.getString(2) + "-" + c.getString(3);
                myList.add(data);
                c.moveToNext();
            }
            c.close();
        }
        myAdapter.notifyDataSetChanged();
    }

    // Copy database from assets to the application's database path
    private void CopyDataBaseFormAsset() {
        try {
            InputStream myInput = getContext().getAssets().open(DATABASE_NAME);
            String outFileName = getDatabasePath();
            File f = new File(getContext().getApplicationInfo().dataDir + DB_PATH_SUFFIX);
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
        return getContext().getApplicationInfo().dataDir + DB_PATH_SUFFIX + DATABASE_NAME;
    }
}
