package com.example.alexkaer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import java.lang.ref.WeakReference;
import java.util.LinkedList;

/**
 * Created by alexkaer on 2017/3/8.
 */

public class MainApplication extends Application {
    private static MainApplication mApplication;
    private LinkedList<WeakReference<Activity>> activities = new LinkedList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        mRefWatcher = LeakCanary.install(this);
    }

    /**
     * 返回Application
     *
     * @return
     */
    public static MainApplication getInstance() {
        return mApplication;
    }

    private RefWatcher mRefWatcher;

    public static RefWatcher getRefWatcher(Context context) {
        MainApplication application = (MainApplication) context.getApplicationContext();
        return application.mRefWatcher;
    }

    public void addActivity(Activity act) {
        synchronized (this) {

            for (int i=0;i<activities.size();i++) {
                Activity a = activities.get(i).get();
                if (a == act){
                    return;
                }
            }
            activities.offer(new WeakReference<>(act));
        }
    }

    public void delActivity(Activity act) {
        synchronized (this) {
            for (int i=0;i<activities.size();i++) {
                WeakReference<Activity> ref = activities.get(i);
                if (act == ref.get()){
                    activities.remove(ref);
                    ref = null;
                }
            }
        }
    }

    /**
     * 清空activity
     */
    public synchronized void cleanActivitys() {

        for (WeakReference<Activity> act : activities) {
            act.get().finish();
            act = null;
        }
        activities.clear();
    }
}
