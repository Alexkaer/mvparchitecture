package com.example.alexkaer.model.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Auto-generated: 2017-03-10 17:45:1
 */
public class SystemInitData {

    @SerializedName("B_DinningTableInfo")
    private BDinningtableinfo bDinningtableinfo;
    @SerializedName("B_BasicParamInfo")
    private BBasicparaminfo bBasicparaminfo;
    @SerializedName("tableManager")
    private String tablemanager;
    @SerializedName("B_MerchantInfo")
    private BMerchantinfo bMerchantinfo;
    @SerializedName("IsLogin")
    private boolean islogin;
    @SerializedName("B_PadInfo")
    private BPadinfo bPadinfo;
    @SerializedName("B_ShopAreaInfo")
    private BShopareainfo bShopareainfo;
    @SerializedName("U_OrganizationInfo")
    private UOrganizationinfo uOrganizationinfo;

    public void setBDinningtableinfo(BDinningtableinfo bDinningtableinfo) {
        this.bDinningtableinfo = bDinningtableinfo;
    }

    public BDinningtableinfo getBDinningtableinfo() {
        return bDinningtableinfo;
    }

    public void setBBasicparaminfo(BBasicparaminfo bBasicparaminfo) {
        this.bBasicparaminfo = bBasicparaminfo;
    }

    public BBasicparaminfo getBBasicparaminfo() {
        return bBasicparaminfo;
    }

    public void setTablemanager(String tablemanager) {
        this.tablemanager = tablemanager;
    }

    public String getTablemanager() {
        return tablemanager;
    }

    public void setBMerchantinfo(BMerchantinfo bMerchantinfo) {
        this.bMerchantinfo = bMerchantinfo;
    }

    public BMerchantinfo getBMerchantinfo() {
        return bMerchantinfo;
    }

    public void setIslogin(boolean islogin) {
        this.islogin = islogin;
    }

    public boolean getIslogin() {
        return islogin;
    }

    public void setBPadinfo(BPadinfo bPadinfo) {
        this.bPadinfo = bPadinfo;
    }

    public BPadinfo getBPadinfo() {
        return bPadinfo;
    }

    public void setBShopareainfo(BShopareainfo bShopareainfo) {
        this.bShopareainfo = bShopareainfo;
    }

    public BShopareainfo getBShopareainfo() {
        return bShopareainfo;
    }

    public void setUOrganizationinfo(UOrganizationinfo uOrganizationinfo) {
        this.uOrganizationinfo = uOrganizationinfo;
    }

    public UOrganizationinfo getUOrganizationinfo() {
        return uOrganizationinfo;
    }

    @Override
    public String toString() {
        return "SystemInitData{" +
                "bDinningtableinfo=" + bDinningtableinfo +
                ", bBasicparaminfo=" + bBasicparaminfo +
                ", tablemanager='" + tablemanager + '\'' +
                ", bMerchantinfo=" + bMerchantinfo +
                ", islogin=" + islogin +
                ", bPadinfo=" + bPadinfo +
                ", bShopareainfo=" + bShopareainfo +
                ", uOrganizationinfo=" + uOrganizationinfo +
                '}';
    }
}