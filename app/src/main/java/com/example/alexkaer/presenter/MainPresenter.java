package com.example.alexkaer.presenter;

import com.example.alexkaer.MainActivity;
import com.example.alexkaer.base.BaseModel;
import com.example.alexkaer.base.BasePresenter;
import com.example.alexkaer.ui.MainView;

/**
 * Created by alexkaer on 2017/3/9.
 */

public class MainPresenter extends BasePresenter<BaseModel, MainView> {
    public MainPresenter(MainActivity rootView) {
        super(rootView);
    }

    public MainPresenter(BaseModel model, MainActivity view){
        super(model, view);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (!isInit()){
            getView().showInitPage();
        }
    }

    private boolean isInit(){
        return false;
    }
}
