package com.example.alexkaer.model.entity;

/**
 * Auto-generated: 2017-03-10 17:45:1
 */
public class BPadinfo {

    private int padid;
    private int archiveid;
    private String padcode;
    private String padname;
    private String imeicode;
    private String padip;
    private String serverip;
    private int serverport;
    private int padstatus;
    private String paddesc;
    private int creatorid;
    private String createtime;
    private String memo;
    private boolean issync;

    public void setPadid(int padid) {
        this.padid = padid;
    }

    public int getPadid() {
        return padid;
    }

    public void setArchiveid(int archiveid) {
        this.archiveid = archiveid;
    }

    public int getArchiveid() {
        return archiveid;
    }

    public void setPadcode(String padcode) {
        this.padcode = padcode;
    }

    public String getPadcode() {
        return padcode;
    }

    public void setPadname(String padname) {
        this.padname = padname;
    }

    public String getPadname() {
        return padname;
    }

    public void setImeicode(String imeicode) {
        this.imeicode = imeicode;
    }

    public String getImeicode() {
        return imeicode;
    }

    public void setPadip(String padip) {
        this.padip = padip;
    }

    public String getPadip() {
        return padip;
    }

    public void setServerip(String serverip) {
        this.serverip = serverip;
    }

    public String getServerip() {
        return serverip;
    }

    public void setServerport(int serverport) {
        this.serverport = serverport;
    }

    public int getServerport() {
        return serverport;
    }

    public void setPadstatus(int padstatus) {
        this.padstatus = padstatus;
    }

    public int getPadstatus() {
        return padstatus;
    }

    public void setPaddesc(String paddesc) {
        this.paddesc = paddesc;
    }

    public String getPaddesc() {
        return paddesc;
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
        return "BPadinfo{" +
                "padid=" + padid +
                ", archiveid=" + archiveid +
                ", padcode='" + padcode + '\'' +
                ", padname='" + padname + '\'' +
                ", imeicode='" + imeicode + '\'' +
                ", padip='" + padip + '\'' +
                ", serverip='" + serverip + '\'' +
                ", serverport=" + serverport +
                ", padstatus=" + padstatus +
                ", paddesc='" + paddesc + '\'' +
                ", creatorid=" + creatorid +
                ", createtime='" + createtime + '\'' +
                ", memo='" + memo + '\'' +
                ", issync=" + issync +
                '}';
    }
}