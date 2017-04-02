package com.example.alexkaer;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

import com.example.alexkaer.base.BaseFragment;
import com.example.alexkaer.base.BaseFragmentActivity;
import com.example.alexkaer.presenter.MainPresenter;
import com.example.alexkaer.ui.Adapter.FragmentPagerAdapter;
import com.example.alexkaer.ui.MainView;
import com.example.alexkaer.ui.activity.WelcomeActivity;
import com.example.alexkaer.ui.fragment.CaidanFragment;
import com.example.alexkaer.ui.fragment.HomeFragment;
import com.example.alexkaer.ui.fragment.OrderFragment;
import com.example.alexkaer.ui.fragment.ServiceFragment;
import com.example.alexkaer.utils.FragmentUtils;
import com.example.alexkaer.utils.UiUtils;

public class MainActivity extends BaseFragmentActivity<MainPresenter> implements MainView, View.OnClickListener {
    private ViewPager mViewPager;
    private FragmentPagerAdapter mFragmentPagerAdapter = null;
    private static Class[] CLASSES_FRAGMENT = {HomeFragment.class, CaidanFragment.class,
            OrderFragment.class, ServiceFragment.class};

    private LinearLayout mMenuHome;
    private LinearLayout mMenuCaidan;
    private LinearLayout mMenuOrder;
    private LinearLayout mMenuService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setPresenter(new MainPresenter(this));
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mViewPager = findViewByIdExt(R.id.viewpager);
        mFragmentPagerAdapter = new FragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mFragmentPagerAdapter);
        mViewPager.setOffscreenPageLimit(4);

        mMenuHome = findViewByIdExt(R.id.tab_home);
        mMenuCaidan = findViewByIdExt(R.id.tab_diancai);
        mMenuOrder = findViewByIdExt(R.id.tab_order);
        mMenuService = findViewByIdExt(R.id.tab_service);
        initLisener();
    }

    private void initLisener(){
        mMenuHome.setOnClickListener(this);
        mMenuCaidan.setOnClickListener(this);
        mMenuOrder.setOnClickListener(this);
        mMenuService.setOnClickListener(this);
    }

    public void openSetting(View view){
        UiUtils.startActivity(this, WelcomeActivity.class);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tab_home:
                mViewPager.setCurrentItem(0, true);
                break;
            case R.id.tab_diancai:
                mViewPager.setCurrentItem(1, true);
                break;
            case R.id.tab_order:
                mViewPager.setCurrentItem(2, true);
                break;
            case R.id.tab_service:
                mViewPager.setCurrentItem(3, true);
                break;
            default:
                break;
        }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        MainApplication.getInstance().cleanActivitys();
        finish();
    }

    @Override
    public void showInitPage() {
//        UiUtils.startActivity(this, WelcomeActivity.class);
    }

    class FragmentAdapter extends FragmentPagerAdapter {

        public FragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public BaseFragment getItem(int position) {
            BaseFragment f = (BaseFragment) FragmentUtils.newFragment(CLASSES_FRAGMENT[position]);
            return f;
        }

        @Override
        public int getCount() {
            return CLASSES_FRAGMENT.length;
        }
    }
}
