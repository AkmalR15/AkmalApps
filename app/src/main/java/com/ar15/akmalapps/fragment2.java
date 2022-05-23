package com.ar15.akmalapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

/** NIM   : 10119230
 * Nama   : Akmal Rizqulloh
 * Kelas  : IF-6
 * Tanggal Pengerjaan : 20-05-2022
 */

public class fragment2 extends Fragment {

    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
           View view = inflater.inflate(R.layout.activity_fragment2, container, false);
        button = view.findViewById(R.id.btn_lanjut);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getcontext(), navbar.class));

            }
        });
        return view;
    }
}