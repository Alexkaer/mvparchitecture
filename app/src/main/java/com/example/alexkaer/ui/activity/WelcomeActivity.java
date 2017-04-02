package com.example.alexkaer.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.alexkaer.MainActivity;
import com.example.alexkaer.R;
import com.example.alexkaer.base.BaseFragmentActivity;
import com.example.alexkaer.model.WelcomeModel;
import com.example.alexkaer.presenter.WelcomPresenter;
import com.example.alexkaer.ui.WelcomeView;
import com.example.alexkaer.ui.dialog.OfflineServerDialog;
import com.example.alexkaer.utils.LogUtils;
import com.example.alexkaer.utils.UiUtils;

public class WelcomeActivity extends BaseFragmentActivity<WelcomPresenter> implements WelcomeView {
    ImageView mBg;
    Button mBindButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setPresenter(new WelcomPresenter(new WelcomeModel(), this));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.d(TAG, "WelcomeActivity onDestroy");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void initView() {
        mBg = findViewByIdExt(R.id.iv_welcome_bg);
        mBindButton = findViewByIdExt(R.id.btn_bind);
        Glide.with(this)
                .load(R.drawable.welcome_bg)
                .crossFade()
                .into(mBg);
    }

    /**
     * 绑定按钮是否可用
     *
     * @param enable
     */
    private void enableBindButton(boolean enable) {
        mBindButton.setEnabled(enable);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String message) {
        UiUtils.makeText(message);
    }


    public void showBindOfflineServerDialog() {
        OfflineServerDialog.create(this).show();
    }

    @Override
    public void onInitFinished(boolean success) {
        enableBindButton(true);
        if (!success) {
            mBindButton.setText(R.string.device_bind);
        }
    }

    @Override
    public void showPermissionDeniedTip(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLogin(boolean success, String msg) {
//        if (success){
            UiUtils.startActivity(this, MainActivity.class);
            finish();
//        } else {
//            UiUtils.makeText(msg);
//        }
    }

    public void Bind(View view) {
        showBindOfflineServerDialog();
    }
}
