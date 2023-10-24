package com.example.ezcook_library;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout_Library;
    private ViewPager mViewPager_Library;
    private ViewPagerAdapter_Library mViewPagerAdapter_Library;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTabLayout_Library = findViewById(R.id.tabLayout_library);
        mViewPager_Library = findViewById(R.id.viewpager_library);

        mViewPagerAdapter_Library = new ViewPagerAdapter_Library(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    mViewPager_Library.setAdapter(mViewPagerAdapter_Library);
    mTabLayout_Library.setupWithViewPager(mViewPager_Library);
    }
}