package com.ar15.akmalapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

/** NIM   : 10119230
 * Nama   : Akmal Rizqulloh
 * Kelas  : IF-6
 * Tanggal Pengerjaan : 16-05-2022
 */

public class MainActivity extends AppCompatActivity {
    VPAdapter vpAdapter;
    ViewPager2 viewPager2;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        viewPager2=findViewById(R.id.viewPager1);
        vpAdapter = new VPAdapter(this);

        viewPager2.setAdapter(vpAdapter);
    }
}