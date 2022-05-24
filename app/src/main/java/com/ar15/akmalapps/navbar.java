package com.ar15.akmalapps;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

/** NIM   : 10119230
 * Nama   : Akmal Rizqulloh
 * Kelas  : IF-6
 * Tanggal Pengerjaan : 20-05-2022
 */

public class navbar extends AppCompatActivity {

    BottomNavigationView bot_nav;
    fragment_home fragment_home = new fragment_home();
    fragment_activity_daily fragment_activity_daily = new fragment_activity_daily();
    fragment_gallery fragment_gallery = new fragment_gallery();
    fragment_favorite fragment_favorite = new fragment_favorite();
    fragment_about fragment_about = new fragment_about();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);
        bot_nav = findViewById(R.id.bot_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_home).commit();
        bot_nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_home).commit();
                        return true;
                    case R.id.activity:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_activity_daily).commit();
                        return true;
                    case R.id.gallery:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_gallery).commit();
                        return true;
                    case R.id.favorite:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_favorite).commit();
                        return true;
                    case R.id.about:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_about).commit();
                        return true;
                }

                return false;
            }
        }
        );
    }


}