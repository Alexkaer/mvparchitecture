package com.example.alexkaer.ui;

import com.example.alexkaer.base.BaseView;

/**
 * Created by alexkaer on 2017/3/10.
 */

public interface WelcomeView extends BaseView {

    /**
     * 初始化完成
     * @param success 是否成功
     */
    void onInitFinished(boolean success);

    void showPermissionDeniedTip(String msg);

    void onLogin(boolean success, String msg);
}
