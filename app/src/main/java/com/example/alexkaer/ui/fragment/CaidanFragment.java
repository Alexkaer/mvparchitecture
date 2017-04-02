package com.example.alexkaer.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alexkaer.R;
import com.example.alexkaer.base.BaseFragment;
import com.example.alexkaer.base.BaseView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CaidanFragment extends BaseFragment implements BaseView{


    public CaidanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_caidan, container, false);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String message) {

    }
}
