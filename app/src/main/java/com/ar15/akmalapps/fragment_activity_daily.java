package com.ar15.akmalapps;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/** NIM   : 10119230
 * Nama   : Akmal Rizqulloh
 * Kelas  : IF-6
 * Tanggal Pengerjaan : 20-05-2022
 */

public class fragment_activity_daily extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<activity_page> list_atc;

    public fragment_activity_daily() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_fragment_daily, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.activity_recyclerview);
        RecylerViewAdapter recyclerViewAdapter = new RecylerViewAdapter(getContext(),list_atc);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list_atc = new ArrayList<>();
        list_atc.add(new activity_page("Beribadah", R.drawable.masjid));
        list_atc.add(new activity_page("Belajar", R.drawable.buku));
        list_atc.add(new activity_page("Menonton", R.drawable.video));
        list_atc.add(new activity_page("Bermain Game", R.drawable.games));
        list_atc.add(new activity_page("Tidur", R.drawable.tidur));
    }
}