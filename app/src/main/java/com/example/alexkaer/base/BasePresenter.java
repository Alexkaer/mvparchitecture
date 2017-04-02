package com.example.alexkaer.base;

/**
 * Created by alexkaer on 17/3/8.
 */
public class BasePresenter<M, V extends BaseView> implements Presenter {
    protected final String TAG = this.getClass().getSimpleName();

    protected M mModel;
    protected V mRootView;


    public BasePresenter(M model, V rootView) {
        this.mModel = model;
        this.mRootView = rootView;
        onCreate();
    }

    public BasePresenter(V rootView) {
        this.mRootView = rootView;
        onCreate();
    }

    public BasePresenter() {
        onCreate();
    }


    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {
        this.mModel = null;
        this.mRootView = null;
    }

    public M getModel() {
        return mModel;
    }

    public V getView() {
        return mRootView;
    }
}
