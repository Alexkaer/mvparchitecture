package com.example.alexkaer.utils;

import android.Manifest;
import android.app.Activity;

import com.tbruyelle.rxpermissions.RxPermissions;
import com.example.alexkaer.base.BaseFragment;
import com.example.alexkaer.base.BaseFragmentActivity;
import com.example.alexkaer.base.BaseView;
import com.trello.rxlifecycle.LifecycleTransformer;

import rx.Subscriber;

/**
 * Created by alexkaer on 2017/3/10
 */

public class PermissionUtil {
    public static final String TAG = "Permission";


    public interface RequestPermission {
        void onRequestPermissionSuccess(boolean success);
    }

    public static <T> LifecycleTransformer<T> bindToLifecycle(BaseView view) {
        if (view instanceof BaseFragmentActivity) {
            return ((BaseFragmentActivity) view).<T>bindToLifecycle();
        } else if (view instanceof BaseFragment) {
            return ((BaseFragment) view).<T>bindToLifecycle();
        } else {
            throw new IllegalArgumentException("view isn't activity or fragment");
        }

    }

    private static Activity getActivity(BaseView view) {
        if (view instanceof BaseFragmentActivity) {
            return (BaseFragmentActivity) view;
        } else if (view instanceof BaseFragment) {
            return ((BaseFragment) view).getActivity();
        } else {
            throw new IllegalArgumentException("view isn't activity or fragment");
        }
    }


    /**
     * 请求摄像头权限
     */
    public static void launchCamera(final RequestPermission requestPermission, final BaseView view) {
        RxPermissions rxPermissions = new RxPermissions(getActivity(view));
        //先确保是否已经申请过摄像头，和写入外部存储的权限
        boolean isPermissionsGranted =
                rxPermissions
                        .isGranted(Manifest.permission.WRITE_EXTERNAL_STORAGE) &&
                        rxPermissions
                                .isGranted(Manifest.permission.CAMERA);

        if (isPermissionsGranted) {//已经申请过，直接执行操作
            requestPermission.onRequestPermissionSuccess(isPermissionsGranted);
        } else {//没有申请过，则申请
            rxPermissions
                    .request(Manifest.permission.WRITE_EXTERNAL_STORAGE
                            , Manifest.permission.CAMERA)
//                    .compose(PermissionUtil.<Boolean>bindToLifecycle(view))//使用RXlifecycle,使subscription和activity一起销毁
                    .subscribe(new Subscriber<Boolean>() {
                        @Override
                        public void onCompleted() {
                        }

                        @Override
                        public void onError(Throwable e) {
                            requestPermission.onRequestPermissionSuccess(false);
                        }

                        @Override
                        public void onNext(Boolean granted) {
                            requestPermission.onRequestPermissionSuccess(granted);
                        }
                    });
        }
    }


    /**
     * 请求外部存储的权限
     */
    public static void externalStorage(final RequestPermission requestPermission, final BaseView view) {
        RxPermissions rxPermissions = new RxPermissions(getActivity(view));
        //先确保是否已经申请过摄像头，和写入外部存储的权限
        boolean isPermissionsGranted =
                rxPermissions
                        .isGranted(Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (isPermissionsGranted) {//已经申请过，直接执行操作
            requestPermission.onRequestPermissionSuccess(isPermissionsGranted);
        } else {//没有申请过，则申请
            rxPermissions
                    .request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
//                    .compose(PermissionUtil.<Boolean>bindToLifecycle(view))//使用RXlifecycle,使subscription和activity一起销毁
                    .subscribe(new Subscriber<Boolean>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            requestPermission.onRequestPermissionSuccess(false);
                        }

                        @Override
                        public void onNext(Boolean granted) {
                            requestPermission.onRequestPermissionSuccess(granted);
                        }
                    });
        }
    }


    /**
     * 请求发送短信权限
     */
    public static void sendSms(final RequestPermission requestPermission, final BaseView view) {
        RxPermissions rxPermissions = new RxPermissions(getActivity(view));
        //先确保是否已经申请过权限
        boolean isPermissionsGranted =
                rxPermissions
                        .isGranted(Manifest.permission.SEND_SMS);

        if (isPermissionsGranted) {//已经申请过，直接执行操作
            requestPermission.onRequestPermissionSuccess(isPermissionsGranted);
        } else {//没有申请过，则申请
            rxPermissions
                    .request(Manifest.permission.SEND_SMS)
//                    .compose(PermissionUtil.<Boolean>bindToLifecycle(view))//使用RXlifecycle,使subscription和activity一起销毁
                    .subscribe(new Subscriber<Boolean>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            requestPermission.onRequestPermissionSuccess(false);
                        }

                        @Override
                        public void onNext(Boolean granted) {
                            requestPermission.onRequestPermissionSuccess(granted);
                        }
                    });
        }
    }


    /**
     * 请求打电话权限
     */
    public static void callPhone(final RequestPermission requestPermission, final BaseView view) {
        RxPermissions rxPermissions = new RxPermissions(getActivity(view));
        //先确保是否已经申请过权限
        boolean isPermissionsGranted =
                rxPermissions
                        .isGranted(Manifest.permission.CALL_PHONE);

        if (isPermissionsGranted) {//已经申请过，直接执行操作
            requestPermission.onRequestPermissionSuccess(isPermissionsGranted);
        } else {//没有申请过，则申请
            rxPermissions
                    .request(Manifest.permission.CALL_PHONE)
//                    .compose(PermissionUtil.<Boolean>bindToLifecycle(view))//使用RXlifecycle,使subscription和activity一起销毁
                    .subscribe(new Subscriber<Boolean>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            requestPermission.onRequestPermissionSuccess(false);
                        }

                        @Override
                        public void onNext(Boolean granted) {
                            requestPermission.onRequestPermissionSuccess(granted);
                        }
                    });
        }
    }

    /**
     * 请求权限
     */
    public static void request(final RequestPermission requestPermission, final BaseView view, final String... permissions) {
        RxPermissions rxPermissions = new RxPermissions(getActivity(view));
        PermissionUtil.request(rxPermissions, requestPermission, view, permissions);
    }

    /**
     * 请求权限,如果在请求权限过程中有可能存在重启activity时使用，
     * 例如在单击按钮请求时，界面在横竖屏间切换，请使用此方法，RxPermissions在onCreate方法中获取实例
     */
    public static void request(final RxPermissions rxPermissions, final RequestPermission requestPermission, final BaseView view, final String... permissions) {
        //先确保是否已经申请过权限
        boolean isPermissionsGranted = true;
        for (String p : permissions) {
            if (!rxPermissions.isGranted(p)) {
                isPermissionsGranted = false;
                break;
            }
        }

        if (isPermissionsGranted) {//已经申请过，直接执行操作
            requestPermission.onRequestPermissionSuccess(isPermissionsGranted);
        } else {//没有申请过，则申请
            rxPermissions
                    .request(permissions)
//                    .compose(PermissionUtil.<Boolean>bindToLifecycle(view))//使用RXlifecycle,使subscription和activity一起销毁
                    .subscribe(new Subscriber<Boolean>() {
                        @Override
                        public void onCompleted() {
                            LogUtils.d("request permission completed.");
                        }

                        @Override
                        public void onError(Throwable e) {
                            LogUtils.d("request permission onError:" + e.getMessage());
                            requestPermission.onRequestPermissionSuccess(false);
                        }

                        @Override
                        public void onNext(Boolean granted) {
                            LogUtils.d("request permission granted:" + granted);
                            requestPermission.onRequestPermissionSuccess(granted);
                        }
                    });
        }
    }

}

