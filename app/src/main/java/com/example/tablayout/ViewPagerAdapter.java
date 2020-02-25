package com.example.tablayout;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int tabCount;

   public ViewPagerAdapter(FragmentManager fragmentManager, int tabCount) {
        super ( fragmentManager );
        this.tabCount = tabCount;
    }

    @Override
    public int getCount() {
        return tabCount;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Log.i(">>>>>>>>>>>>>",">>>>>>>>>>>>>  inside get item  " + position);
        switch (position) {
            case 0:
                return new PopularFragment ();
            case 1:
                return  new TopRatedFragment ();
            case 2:
                return new UpcomingFragment ();
//            case 3:
//                return new PopularFragment ();                           //Agar same data dikana hai to ek hi fragement use krege or uski type pass krege but agar diffent data dikana hai
                                                                           // jitni trha ka data hai unsb k liye utne hi fragments bnege
//            case 4:
//                return new TopRatedFragment ();
            default: {
                return null;
            }

        }
    }
}
