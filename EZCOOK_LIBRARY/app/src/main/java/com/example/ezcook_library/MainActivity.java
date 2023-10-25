package com.example.ezcook_library;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout_Library;
    private ViewPager mViewPager_Library;
    private ViewPagerAdapter_Library mViewPagerAdapter_Library;


    private Button btn_create;

    private Button btn_chitiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_create = (Button) findViewById(R.id.btn_create);
        btn_chitiet = (Button) findViewById(R.id.btn_chitiet);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CreateActivity.class);
                startActivity(intent);
            }
        });
        btn_chitiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, f_DetailActivity.class);
                startActivity(intent2);
            }
        });

        mTabLayout_Library = findViewById(R.id.tabLayout_library);
        mViewPager_Library = findViewById(R.id.viewpager_library);

        mViewPagerAdapter_Library = new ViewPagerAdapter_Library(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    mViewPager_Library.setAdapter(mViewPagerAdapter_Library);
    mTabLayout_Library.setupWithViewPager(mViewPager_Library);
    }
}