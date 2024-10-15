package com.example.appdatxe;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.appdatxe.fragment.AccFragment;
import com.example.appdatxe.fragment.HistoryFragment;
import com.example.appdatxe.fragment.HomeFragment;
import com.example.appdatxe.fragment.MessFragment;
import com.example.appdatxe.fragment.WalletFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new HistoryFragment();
            case 2:
                return new WalletFragment();
            case 3:
                return new MessFragment();
            case 4:
                return new AccFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
