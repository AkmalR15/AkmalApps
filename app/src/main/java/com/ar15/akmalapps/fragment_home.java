package com.ar15.akmalapps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/** NIM   : 10119230
 * Nama   : Akmal Rizqulloh
 * Kelas  : IF-6
 * Tanggal Pengerjaan : 16-05-2022
 */

public class fragment_home extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.activity_fragment_home, container, false);
    }
}