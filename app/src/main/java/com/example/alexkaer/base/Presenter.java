package com.example.alexkaer.base;

/**
 * Created by alexkaer on 17/3/8.
 */
public interface Presenter {
    void onCreate();
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onDestroy();
}
