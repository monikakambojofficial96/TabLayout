package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        tabLayout = findViewById ( R.id.activity_main_tab_layout );
        viewPager = findViewById ( R.id.activity_main_view_pager );
        tabLayout.addTab ( tabLayout.newTab ().setText ( "Popular" ) );
        tabLayout.addTab ( tabLayout.newTab ().setText ( "TopRated" ) );
        tabLayout.addTab ( tabLayout.newTab ().setText ( "Upcomming" ) );
        tabLayout.setTabGravity ( TabLayout.GRAVITY_FILL );

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter ( this, tabLayout.getTabCount () );
        viewPager.setAdapter ( viewPagerAdapter );
        viewPager.addOnPageChangeListener ( new ViewPager.OnPageChangeListener () {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        } );
        tabLayout.setOnTabSelectedListener ( new TabLayout.OnTabSelectedListener () {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem ( tab.getPosition () );
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        } );
    }
}
