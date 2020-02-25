package com.example.tablayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

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
//        tabLayout.addTab ( tabLayout.newTab ().setText ( "Upcomming1" ) );
//        tabLayout.addTab ( tabLayout.newTab ().setText ( "Upcomming2" ) );
        tabLayout.setTabGravity ( TabLayout.GRAVITY_FILL );

        // ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter ( this, getSupportFragmentManager (), tabLayout.getTabCount () );

        viewPager.setAdapter ( new ViewPagerAdapter ( getSupportFragmentManager (), tabLayout.getTabCount () ) );

        //run all fragments at a same time(agar three hai to three pass krna hai... five hai to five)

        viewPager.setOffscreenPageLimit ( 3 );

        //when page changed

        viewPager.addOnPageChangeListener ( new TabLayout.TabLayoutOnPageChangeListener ( tabLayout ) );

        // When tab is changed

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
