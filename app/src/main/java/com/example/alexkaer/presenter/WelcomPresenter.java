package com.example.alexkaer.presenter;

import android.Manifest;

import com.example.alexkaer.R;
import com.example.alexkaer.base.BasePresenter;
import com.example.alexkaer.model.WelcomeModel;
import com.example.alexkaer.model.entity.BaseEntity;
import com.example.alexkaer.model.entity.LoginData;
import com.example.alexkaer.model.entity.SystemInitData;
import com.example.alexkaer.ui.WelcomeView;
import com.example.alexkaer.ui.activity.WelcomeActivity;
import com.example.alexkaer.utils.DeviceUtils;
import com.example.alexkaer.utils.LogUtils;
import com.example.alexkaer.utils.PermissionUtil;
import com.example.alexkaer.utils.UiUtils;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by alexkaer on 2017/3/10.
 */

public class WelcomPresenter extends BasePresenter<WelcomeModel, WelcomeView> implements PermissionUtil.RequestPermission {

    public WelcomPresenter(WelcomeView rootView) {
        super(rootView);
    }

    public WelcomPresenter(WelcomeModel model, WelcomeView rootView) {
        super(model, rootView);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initSystem();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onDestroy() {
        LogUtils.d(TAG, "WelcomPresenter onDestroy");
        super.onDestroy();
    }

    private void initSystem(){
        checkPermission();
    }

    private void checkInitStatus(BaseEntity<SystemInitData> entity){
        boolean ret = false;
        if (entity != null && (entity.getCode() == 0) && entity.getData() != null){
            ret = entity.getData().getIslogin();
        }
        getView().onInitFinished(ret);
    }

    private void doInit(){
        LogUtils.d("IMEI:"+DeviceUtils.getIMEI(UiUtils.getContext()));
        getModel().getSystemInitData(DeviceUtils.getIMEI(UiUtils.getContext()), 129)
                .subscribeOn(Schedulers.newThread())
                .compose(((WelcomeActivity)getView()).<BaseEntity<SystemInitData>>bindToLifecycle())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<BaseEntity<SystemInitData>>() {
                    @Override
                    public void onCompleted() {
                        LogUtils.d("system init request completed.");
                    }

                    @Override
                    public void onError(Throwable e) {
                        checkInitStatus(null);
                        getView().showMessage(UiUtils.getString(R.string.get_data_failed));
                        LogUtils.debugLongInfo("system init request onError:"+e.getMessage());
                    }

                    @Override
                    public void onNext(BaseEntity<SystemInitData> systemInitEntity) {
                        LogUtils.debugLongInfo("system init request successful:"+systemInitEntity.toString());
                        checkInitStatus(systemInitEntity);
                    }
                });
    }

    /**
     * 检查是否有权限
     */
    private void checkPermission(){
        PermissionUtil.request(this, getView(), Manifest.permission.READ_PHONE_STATE);
    }

    @Override
    public void onRequestPermissionSuccess(boolean success) {
        if (success){
            doInit();
        } else {
            getView().showPermissionDeniedTip(UiUtils.getString(R.string.read_phone_state_denied));
        }
    }

    public void login(String userName, String userPass){
        getModel().login(DeviceUtils.getIMEI(UiUtils.getContext()), userName, userPass)
                .subscribeOn(Schedulers.io())
                .compose(((WelcomeActivity)getView()).<BaseEntity<LoginData>>bindToLifecycle())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<BaseEntity<LoginData>>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        getView().onLogin(false, UiUtils.getString(R.string.login_failed));
                    }

                    @Override
                    public void onNext(BaseEntity<LoginData> ret) {
                        getView().onLogin(ret.getCode() == 0, ret.getMessage());
                    }
                });
    }
}
