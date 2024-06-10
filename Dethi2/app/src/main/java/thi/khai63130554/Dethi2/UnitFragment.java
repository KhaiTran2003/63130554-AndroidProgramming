package thi.khai63130554.Dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class UnitFragment extends Fragment {
    EditText edtSoA;
    EditText edtKQ;
    Button nutKm, nutKg, nutByte;

    void TimDieuKhien(View view) {
        edtSoA = view.findViewById(R.id.id_edt_soA);
        edtKQ = view.findViewById(R.id.id_edtKetQua);
        nutKm = view.findViewById(R.id.id_km);
        nutKg = view.findViewById(R.id.id_kg);
        nutByte = view.findViewById(R.id.id_byte);
    }

    public UnitFragment() {
        // Required empty public constructor
    }

    public static UnitFragment newInstance() {
        UnitFragment fragment = new UnitFragment();
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

        View view = inflater.inflate(R.layout.fragment_unit, container, false);
        TimDieuKhien(view);

        nutKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = edtSoA.getText().toString();
                try {
                    Float soA = Float.parseFloat(so1);
                    Float kq = soA * 1000; // Km to m conversion
                    edtKQ.setText(String.valueOf(kq));
                } catch (NumberFormatException e) {
                    edtKQ.setText("Invalid input");
                }
            }
        });

        nutKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = edtSoA.getText().toString();
                try {
                    Float soA = Float.parseFloat(so1);
                    Float kq = soA * 1000;
                    edtKQ.setText(String.valueOf(kq));
                } catch (NumberFormatException e) {
                    edtKQ.setText("Invalid input");
                }
            }
        });

        nutByte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = edtSoA.getText().toString();
                try {
                    Float soA = Float.parseFloat(so1);
                    Float kq = soA * 8;
                    edtKQ.setText(String.valueOf(kq));
                } catch (NumberFormatException e) {
                    edtKQ.setText("Invalid input");
                }
            }
        });

        return view;
    }
}
