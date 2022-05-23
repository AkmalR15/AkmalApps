package com.ar15.akmalapps;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/** NIM   : 10119230
 * Nama   : Akmal Rizqulloh
 * Kelas  : IF-6
 * Tanggal Pengerjaan : 20-05-2022
 */

public class fragment_about extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.activity_fragment_about, container, false);
    }
}