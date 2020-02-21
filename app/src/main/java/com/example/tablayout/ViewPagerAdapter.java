package com.example.tablayout;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    private Activity context;
    int tabCount;

    private LayoutInflater liViewAdapter;


    public ViewPagerAdapter(MainActivity context, int tabCount) {
        this.context = context;
        this.tabCount = tabCount;
        liViewAdapter = LayoutInflater.from ( context );
    }

    @Override
    public int getCount() {
        return tabCount;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View adapterView = liViewAdapter.inflate ( R.layout.item_view_adapter, container, false );
        ((TextView) adapterView.findViewById ( R.id.textView )).setText ( "This is in adapter " + position );
        container.addView ( adapterView );
        return adapterView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView ( (View) object );
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
