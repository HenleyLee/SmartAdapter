package com.henley.smartadapter.viewpager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * 实现Fragment在ViewPager中进行滑动切换的适配器
 * <ul>
 * <strong>注意：</strong>
 * <li>当使用FragmentStatePagerAdapter的时候，它的宿主ViewPager必须有一个id。
 * <li>FragmentStatePagerAdapter拥有自己的缓存策略，当和ViewPager配合使用的时候，默认会缓存当前Fragment以及左边一个、右边一个，一共三个Fragment对象。
 * <li>当Fragment对用户不可见的时候，整个Fragment会被销毁，只会保存Fragment的保存状态。
 * <li>FragmentStatePagerAdapter适合用于很多界面之间的转换，而且消耗更少的内存资源。
 * </ul>
 *
 * @author Henley
 * @date 2017/8/1 18:07
 */
public class CommonFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    private List<? extends Fragment> mFragments;
    private List<? extends CharSequence> mTitles;

    public CommonFragmentStatePagerAdapter(FragmentManager fm, List<? extends Fragment> fragments) {
        this(fm, fragments, null);
    }

    public CommonFragmentStatePagerAdapter(FragmentManager fm, List<? extends Fragment> fragments, List<? extends CharSequence> titles) {
        super(fm);
        this.mFragments = fragments;
        this.mTitles = titles;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles == null ? null : mTitles.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments == null ? null : mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments == null ? 0 : mFragments.size();
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

}
