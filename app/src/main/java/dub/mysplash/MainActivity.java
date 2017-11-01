package dub.mysplash;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import GuidePage.GuidePage1Fragment;
import GuidePage.GuidePage2Fragment;
import GuidePage.GuidePage3Fragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private mViewPagerAdapter mAdapter;
    private List<Fragment> mFragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        init();
    }

    private void init() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new GuidePage1Fragment());
        mFragmentList.add(new GuidePage2Fragment());
        mFragmentList.add(new GuidePage3Fragment());
        mAdapter = new mViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mViewPager.setCurrentItem(0);
    }

    private void findViewById() {
        mViewPager = (ViewPager) findViewById(R.id.act_guidepage_vp);
    }

    private class mViewPagerAdapter extends FragmentPagerAdapter {

        public mViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }


    }
}
