package com.ar15.akmalapps;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPAdapter extends FragmentStateAdapter {

    private String[] tittle= new String[]{"Home1","Home2"};

    public VPAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new fragment1();
            case 1:
                return new fragment2();
        }
        return new fragment1();
    }

    @Override
    public int getItemCount() {
        return tittle.length;
    }
}
