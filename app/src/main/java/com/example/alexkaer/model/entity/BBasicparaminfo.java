package com.example.alexkaer.model.entity;

/**
 * Auto-generated: 2017-03-10 17:45:1
 */
public class BBasicparaminfo {

    private int paramid;
    private int archiveid;
    private int orgid;
    private int reservationtype;
    private int reservationfee;
    private boolean isservicefee;
    private String servicefeetype;
    private String servicefee;
    private int lateminute;
    private String daytype;
    private String isgregorian;
    private String weekday;
    private String monthday;
    private String yearday;
    private String specificday;
    private String aheadminute;
    private String canbookingday;
    private String opentime;
    private String closetime;
    private int alertamount;
    private boolean enablepending;
    private boolean prepaypending;
    private int droptailmethod;
    private int creatorid;
    private String createtime;
    private String memo;
    private boolean issync;

    public void setParamid(int paramid) {
        this.paramid = paramid;
    }

    public int getParamid() {
        return paramid;
    }

    public void setArchiveid(int archiveid) {
        this.archiveid = archiveid;
    }

    public int getArchiveid() {
        return archiveid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    public int getOrgid() {
        return orgid;
    }

    public void setReservationtype(int reservationtype) {
        this.reservationtype = reservationtype;
    }

    public int getReservationtype() {
        return reservationtype;
    }

    public void setReservationfee(int reservationfee) {
        this.reservationfee = reservationfee;
    }

    public int getReservationfee() {
        return reservationfee;
    }

    public void setIsservicefee(boolean isservicefee) {
        this.isservicefee = isservicefee;
    }

    public boolean getIsservicefee() {
        return isservicefee;
    }

    public void setServicefeetype(String servicefeetype) {
        this.servicefeetype = servicefeetype;
    }

    public String getServicefeetype() {
        return servicefeetype;
    }

    public void setServicefee(String servicefee) {
        this.servicefee = servicefee;
    }

    public String getServicefee() {
        return servicefee;
    }

    public void setLateminute(int lateminute) {
        this.lateminute = lateminute;
    }

    public int getLateminute() {
        return lateminute;
    }

    public void setDaytype(String daytype) {
        this.daytype = daytype;
    }

    public String getDaytype() {
        return daytype;
    }

    public void setIsgregorian(String isgregorian) {
        this.isgregorian = isgregorian;
    }

    public String getIsgregorian() {
        return isgregorian;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setMonthday(String monthday) {
        this.monthday = monthday;
    }

    public String getMonthday() {
        return monthday;
    }

    public void setYearday(String yearday) {
        this.yearday = yearday;
    }

    public String getYearday() {
        return yearday;
    }

    public void setSpecificday(String specificday) {
        this.specificday = specificday;
    }

    public String getSpecificday() {
        return specificday;
    }

    public void setAheadminute(String aheadminute) {
        this.aheadminute = aheadminute;
    }

    public String getAheadminute() {
        return aheadminute;
    }

    public void setCanbookingday(String canbookingday) {
        this.canbookingday = canbookingday;
    }

    public String getCanbookingday() {
        return canbookingday;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setClosetime(String closetime) {
        this.closetime = closetime;
    }

    public String getClosetime() {
        return closetime;
    }

    public void setAlertamount(int alertamount) {
        this.alertamount = alertamount;
    }

    public int getAlertamount() {
        return alertamount;
    }

    public void setEnablepending(boolean enablepending) {
        this.enablepending = enablepending;
    }

    public boolean getEnablepending() {
        return enablepending;
    }

    public void setPrepaypending(boolean prepaypending) {
        this.prepaypending = prepaypending;
    }

    public boolean getPrepaypending() {
        return prepaypending;
    }

    public void setDroptailmethod(int droptailmethod) {
        this.droptailmethod = droptailmethod;
    }

    public int getDroptailmethod() {
        return droptailmethod;
    }

    public void setCreatorid(int creatorid) {
        this.creatorid = creatorid;
    }

    public int getCreatorid() {
        return creatorid;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public void setIssync(boolean issync) {
        this.issync = issync;
    }

    public boolean getIssync() {
        return issync;
    }

    @Override
    public String toString() {
        return "BBasicparaminfo{" +
                "paramid=" + paramid +
                ", archiveid=" + archiveid +
                ", orgid=" + orgid +
                ", reservationtype=" + reservationtype +
                ", reservationfee=" + reservationfee +
                ", isservicefee=" + isservicefee +
                ", servicefeetype='" + servicefeetype + '\'' +
                ", servicefee='" + servicefee + '\'' +
                ", lateminute=" + lateminute +
                ", daytype='" + daytype + '\'' +
                ", isgregorian='" + isgregorian + '\'' +
                ", weekday='" + weekday + '\'' +
                ", monthday='" + monthday + '\'' +
                ", yearday='" + yearday + '\'' +
                ", specificday='" + specificday + '\'' +
                ", aheadminute='" + aheadminute + '\'' +
                ", canbookingday='" + canbookingday + '\'' +
                ", opentime='" + opentime + '\'' +
                ", closetime='" + closetime + '\'' +
                ", alertamount=" + alertamount +
                ", enablepending=" + enablepending +
                ", prepaypending=" + prepaypending +
                ", droptailmethod=" + droptailmethod +
                ", creatorid=" + creatorid +
                ", createtime='" + createtime + '\'' +
                ", memo='" + memo + '\'' +
                ", issync=" + issync +
                '}';
    }
}