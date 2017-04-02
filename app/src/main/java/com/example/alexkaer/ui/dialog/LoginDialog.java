package com.example.alexkaer.ui.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.widget.EditText;

import com.example.alexkaer.R;
import com.example.alexkaer.base.BaseDialog;
import com.example.alexkaer.ui.activity.WelcomeActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by alexkaer on 2017/3/10.
 */

public class LoginDialog extends BaseDialog {
    private Context mContext;

    @BindView(R.id.edt_input_username)
    EditText mUserName;
    @BindView(R.id.edt_input_userpass)
    EditText mUserPass;
    private LoginDialog(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    private LoginDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        mContext = context;
    }

    private LoginDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        mContext = context;
    }

    public static LoginDialog create(Context context) {
        LoginDialog dialog = LoginDialog.create(context, R.style.DialogBaseTheme);
        return dialog;
    }

    public static LoginDialog create(Context context, int theme) {
        LoginDialog dialog = new LoginDialog(context, theme);
        dialog.setContentView(R.layout.login_dialog);
        return dialog;
    }

    @OnClick(R.id.id_btn_close)
    void close(){
        dismiss();
    }

    @OnClick(R.id.id_btn_prev)
    void prev() {
        OfflineServerDialog.create(mContext).show();
        dismiss();
    }

    @OnClick(R.id.id_btn_login)
    void login() {
        ((WelcomeActivity)mContext).getPresenter().login(mUserName.getText().toString(), mUserPass.getText().toString());
    }
}
