package com.example.alexkaer.model.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Auto-generated: 2017-03-12 14:43:33
 */
public class LoginData {

    @SerializedName("U_LoginInfo")
    private ULogininfo uLogininfo;
    @SerializedName("B_PadInfo")
    private BPadinfo bPadinfo;

    public void setULogininfo(ULogininfo uLogininfo) {
        this.uLogininfo = uLogininfo;
    }

    public ULogininfo getULogininfo() {
        return uLogininfo;
    }

    public void setBPadinfo(BPadinfo bPadinfo) {
        this.bPadinfo = bPadinfo;
    }

    public BPadinfo getBPadinfo() {
        return bPadinfo;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "uLogininfo=" + uLogininfo +
                ", bPadinfo=" + bPadinfo +
                '}';
    }
}