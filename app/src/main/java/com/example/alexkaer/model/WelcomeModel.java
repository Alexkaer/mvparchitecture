package com.example.alexkaer.model;

import com.example.alexkaer.ApiManager;
import com.example.alexkaer.base.BaseModel;
import com.example.alexkaer.http.NetManager;
import com.example.alexkaer.model.entity.BaseEntity;
import com.example.alexkaer.model.entity.LoginData;
import com.example.alexkaer.model.entity.SystemInitData;

import rx.Observable;



public class WelcomeModel extends BaseModel {
    public Observable<BaseEntity<SystemInitData>> getSystemInitData(String imei, long archiveId) {
        ApiManager api = NetManager.getApiManager();
        Observable<BaseEntity<SystemInitData>> data = api.systemInit(imei, archiveId);
        //这里可以做数据缓存等功能，下次可以从缓存中读取数据
        return data;
    }

    public Observable<BaseEntity<LoginData>> login(String imei, String userName, String userPwd) {
        ApiManager api = NetManager.getApiManager();
        return api.login(imei, userName, userPwd);
    }
}
