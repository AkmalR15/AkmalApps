package com.ar15.akmalapps;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

/** NIM   : 10119230
 * Nama   : Akmal Rizqulloh
 * Kelas  : IF-6
 * Tanggal Pengerjaan : 20-05-2022
 */

public class SplashScreen extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(SplashScreen.this,MainActivity.class));
                finish();
            }
        },2000);
    }
}
