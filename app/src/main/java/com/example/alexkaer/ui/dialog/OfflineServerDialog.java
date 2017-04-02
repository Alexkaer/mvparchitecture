package com.example.alexkaer.ui.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.widget.Button;

import com.example.alexkaer.R;
import com.example.alexkaer.base.BaseDialog;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by alexkaer on 2017/3/10.
 */

public class OfflineServerDialog extends BaseDialog {
    private Context mContext;
    @BindView(R.id.id_btn_next)
    Button mNextBtn;
    @BindView(R.id.id_btn_close)
    Button mCloseBtn;
    public OfflineServerDialog(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    public OfflineServerDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
        mContext = context;
    }

    public OfflineServerDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        mContext = context;
    }

    public static OfflineServerDialog create(Context context){
        OfflineServerDialog dialog = OfflineServerDialog.create(context, R.style.DialogBaseTheme);
        return dialog;
    }

    public static OfflineServerDialog create(Context context, int theme){
        OfflineServerDialog dialog = new OfflineServerDialog(context, theme);
        dialog.setContentView(R.layout.offline_server_dialog);
        return dialog;
    }

    @OnClick(R.id.id_btn_next)
    void next(){
        LoginDialog.create(mContext).show();
        dismiss();
    }

    @OnClick(R.id.id_btn_close)
    void close(){
        dismiss();
    }
}
