package com.example.ezcook_library;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter_Library extends FragmentStatePagerAdapter {
    public ViewPagerAdapter_Library(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LikeFragment();
            case 1:
                return new SaveFragment();
            case 2:
                return new CollectionFragment();
            default:
                return new LikeFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title_Fr = "";
        switch (position){
            case 0:
                title_Fr = "Yêu thích";break;
            case 1:
                title_Fr = "Đã lưu";break;
            case 2:
                title_Fr = "Bộ sưu tập";break;
        }
        return title_Fr;
    }
}
