package com.example.alexkaer.base;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;

import com.example.alexkaer.R;
import com.example.alexkaer.utils.LogUtils;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by alexkaer on 2017/3/10.
 */

public class BaseDialog extends Dialog {
    final String TAG = this.getClass().getSimpleName();
    int mThemeId = R.style.DialogBaseTheme;
    private Unbinder mUnbinder;
    private static BaseDialog mDialog;

    public BaseDialog(@NonNull Context context) {
        super(context);
        setCanceledOnTouchOutside(false);
    }

    public BaseDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        setCanceledOnTouchOutside(false);
    }

    protected BaseDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        setCanceledOnTouchOutside(false);
    }

    private static BaseDialog getInstance(Context context, int resId, int theme) {
        if (null == mDialog) {
            synchronized (BaseDialog.class) {
                if (null == mDialog) {
                    mDialog = new BaseDialog(context, theme);
                }
            }
        }
        if (resId > 0) {
            mDialog.setContentView(resId);
        }
        return mDialog;
    }

    public static BaseDialog create(Context context, int resId) {
        return BaseDialog.create(context, resId, R.style.DialogBaseTheme);
    }

    public static BaseDialog create(Context context, int resId, int theme) {
        return BaseDialog.getInstance(context, resId, theme);
    }

    private void unBinderButterKnife() {
        if (mUnbinder != null) {
            mUnbinder.unbind();
            mUnbinder = null;
            LogUtils.d(TAG, "ButterKnife unBind.");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        mUnbinder = ButterKnife.bind(this, this);
        if (mUnbinder != null) {
            LogUtils.d(TAG, "ButterKnife bind.");
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        unBinderButterKnife();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unBinderButterKnife();
        release();
    }

    private void release() {
        if (mDialog != null) {
            mDialog = null;
        }
    }
}
