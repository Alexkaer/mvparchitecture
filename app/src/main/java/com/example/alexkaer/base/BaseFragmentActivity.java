package com.example.alexkaer.base;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.squareup.leakcanary.RefWatcher;
import com.example.alexkaer.MainApplication;
import com.example.alexkaer.R;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragmentActivity<P extends BasePresenter> extends RxAppCompatActivity {
    protected final String TAG = this.getClass().getSimpleName();
    protected P mPresenter;
    Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mUnbinder = ButterKnife.bind(this);
        MainApplication.getInstance().addActivity(this);
        initToolbar();
        initView();
    }

    protected void initToolbar(){
        Toolbar bar = findViewByIdExt(R.id.toolbar);
        setSupportActionBar(bar);
    }

    /**
     * 根据id获取View
     * @param id
     * @param <T>
     * @return
     */
    public <T extends View> T findViewByIdExt(int id) {
        return (T)findViewById(id);
    }

    /**
     * 返回布局id即可，不需要设置setContentView
     * @return
     */
    protected abstract int getLayoutId();
    protected abstract void initView();

    public P getPresenter(){
        return mPresenter;
    }
    protected void setPresenter(P p){
        this.mPresenter = p;
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mPresenter != null){
            mPresenter.onStart();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPresenter != null){
            mPresenter.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mPresenter != null){
            mPresenter.onPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mPresenter != null){
            mPresenter.onStop();
        }
    }

    @Override
    protected void onDestroy() {
        MainApplication.getInstance().delActivity(this);
        if (mUnbinder != null) {
            mUnbinder.unbind();
            mUnbinder = null;
        }
        if (mPresenter != null) {
            mPresenter.onDestroy();//释放资源
            mPresenter = null;
        }
        super.onDestroy();
        RefWatcher refWatcher = MainApplication.getInstance().getRefWatcher(this);
        refWatcher.watch(this);
    }
}
