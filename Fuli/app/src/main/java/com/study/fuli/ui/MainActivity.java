package com.study.fuli.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;

import com.astuetz.PagerSlidingTabStrip;
import com.study.fuli.R;
import com.study.fuli.model.ModelButt;
import com.study.fuli.model.ModelChest;
import com.study.fuli.model.ModelStockings;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private PagerSlidingTabStrip mTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(new MainViewPagerAdapter());
        mViewPager.setOffscreenPageLimit(3);

        mTab = (PagerSlidingTabStrip) findViewById(R.id.tab);
        mTab.setViewPager(mViewPager);
        mTab.setIndicatorColor(R.color.colorPrimary);
        mTab.setIndicatorHeight((int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                3,
                getResources().getDisplayMetrics()));
    }

    private class MainViewPagerAdapter extends FragmentPagerAdapter {
        private String[] mTitles = getResources().getStringArray(R.array.tab_page_titles);

        public MainViewPagerAdapter() {
            super(getSupportFragmentManager());
        }

        @Override
        public Fragment getItem(int position) {
            if (0 == position) {
                return new FragPageStockings();
            } else if (1 == position) {
                return new FragPageButt();
            } else {
                return new FragPageChest();
            }
        }

        @Override
        public int getCount() {
            return mTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }
    }
}
