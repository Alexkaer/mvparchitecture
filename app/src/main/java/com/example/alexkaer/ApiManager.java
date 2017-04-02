package com.example.alexkaer;

import com.example.alexkaer.model.entity.BaseEntity;
import com.example.alexkaer.model.entity.LoginData;
import com.example.alexkaer.model.entity.SystemInitData;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by alexkaer on 2017/3/10.
 */

public interface ApiManager {
    @POST("pad/system/init")
    Observable<BaseEntity<SystemInitData>> systemInit(@Query("imei") String imei, @Query("archiveId") long id);

    @POST("pad/system/login")
    Observable<BaseEntity<LoginData>> login(@Query("imei") String imei, @Query("userName") String userName, @Query("userPwd") String userPwd);
}
