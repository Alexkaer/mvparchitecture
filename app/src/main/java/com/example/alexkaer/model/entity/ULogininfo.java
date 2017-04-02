package com.example.alexkaer.model.entity;

/**
 * Auto-generated: 2017-03-12 14:43:33
 */
public class ULogininfo {

    private int loginid;
    private int userid;
    private String loginname;
    private String nickname;
    private String orgcode;
    private String employeecode;
    private String loginpassword;
    private int passwordformat;
    private String certificatecode;
    private int loginstatus;
    private boolean isforcechange;
    private String passwordquestion;
    private String passwordanswer;
    private String effectivetime;
    private String expiretime;
    private String failedpasswordattemptcount;
    private boolean isvalid;
    private String signature;
    private String sortno;
    private String latestlogintime;
    private String latestloginarea;
    private String latestloginip;
    private String latestpasswordchangetime;
    private String latestfailedlogintime;
    private int creatorid;
    private String createtime;
    private String memo;
    private boolean issync;

    public void setLoginid(int loginid) {
        this.loginid = loginid;
    }

    public int getLoginid() {
        return loginid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getUserid() {
        return userid;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode;
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword;
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setPasswordformat(int passwordformat) {
        this.passwordformat = passwordformat;
    }

    public int getPasswordformat() {
        return passwordformat;
    }

    public void setCertificatecode(String certificatecode) {
        this.certificatecode = certificatecode;
    }

    public String getCertificatecode() {
        return certificatecode;
    }

    public void setLoginstatus(int loginstatus) {
        this.loginstatus = loginstatus;
    }

    public int getLoginstatus() {
        return loginstatus;
    }

    public void setIsforcechange(boolean isforcechange) {
        this.isforcechange = isforcechange;
    }

    public boolean getIsforcechange() {
        return isforcechange;
    }

    public void setPasswordquestion(String passwordquestion) {
        this.passwordquestion = passwordquestion;
    }

    public String getPasswordquestion() {
        return passwordquestion;
    }

    public void setPasswordanswer(String passwordanswer) {
        this.passwordanswer = passwordanswer;
    }

    public String getPasswordanswer() {
        return passwordanswer;
    }

    public void setEffectivetime(String effectivetime) {
        this.effectivetime = effectivetime;
    }

    public String getEffectivetime() {
        return effectivetime;
    }

    public void setExpiretime(String expiretime) {
        this.expiretime = expiretime;
    }

    public String getExpiretime() {
        return expiretime;
    }

    public void setFailedpasswordattemptcount(String failedpasswordattemptcount) {
        this.failedpasswordattemptcount = failedpasswordattemptcount;
    }

    public String getFailedpasswordattemptcount() {
        return failedpasswordattemptcount;
    }

    public void setIsvalid(boolean isvalid) {
        this.isvalid = isvalid;
    }

    public boolean getIsvalid() {
        return isvalid;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public void setSortno(String sortno) {
        this.sortno = sortno;
    }

    public String getSortno() {
        return sortno;
    }

    public void setLatestlogintime(String latestlogintime) {
        this.latestlogintime = latestlogintime;
    }

    public String getLatestlogintime() {
        return latestlogintime;
    }

    public void setLatestloginarea(String latestloginarea) {
        this.latestloginarea = latestloginarea;
    }

    public String getLatestloginarea() {
        return latestloginarea;
    }

    public void setLatestloginip(String latestloginip) {
        this.latestloginip = latestloginip;
    }

    public String getLatestloginip() {
        return latestloginip;
    }

    public void setLatestpasswordchangetime(String latestpasswordchangetime) {
        this.latestpasswordchangetime = latestpasswordchangetime;
    }

    public String getLatestpasswordchangetime() {
        return latestpasswordchangetime;
    }

    public void setLatestfailedlogintime(String latestfailedlogintime) {
        this.latestfailedlogintime = latestfailedlogintime;
    }

    public String getLatestfailedlogintime() {
        return latestfailedlogintime;
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
        return "ULogininfo{" +
                "loginid=" + loginid +
                ", userid=" + userid +
                ", loginname='" + loginname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", orgcode='" + orgcode + '\'' +
                ", employeecode='" + employeecode + '\'' +
                ", loginpassword='" + loginpassword + '\'' +
                ", passwordformat=" + passwordformat +
                ", certificatecode='" + certificatecode + '\'' +
                ", loginstatus=" + loginstatus +
                ", isforcechange=" + isforcechange +
                ", passwordquestion='" + passwordquestion + '\'' +
                ", passwordanswer='" + passwordanswer + '\'' +
                ", effectivetime='" + effectivetime + '\'' +
                ", expiretime='" + expiretime + '\'' +
                ", failedpasswordattemptcount='" + failedpasswordattemptcount + '\'' +
                ", isvalid=" + isvalid +
                ", signature='" + signature + '\'' +
                ", sortno='" + sortno + '\'' +
                ", latestlogintime='" + latestlogintime + '\'' +
                ", latestloginarea='" + latestloginarea + '\'' +
                ", latestloginip='" + latestloginip + '\'' +
                ", latestpasswordchangetime='" + latestpasswordchangetime + '\'' +
                ", latestfailedlogintime='" + latestfailedlogintime + '\'' +
                ", creatorid=" + creatorid +
                ", createtime='" + createtime + '\'' +
                ", memo='" + memo + '\'' +
                ", issync=" + issync +
                '}';
    }
}