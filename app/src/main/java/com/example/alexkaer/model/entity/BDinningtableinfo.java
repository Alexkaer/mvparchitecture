package com.example.alexkaer.model.entity;

/**
 * Auto-generated: 2017-03-10 17:45:1
 */
public class BDinningtableinfo {

    private int tableid;
    private int archiveid;
    private int areaid;
    private String tablecode;
    private String qrcode;
    private String tablename;
    private int defaultperson;
    private int maxperson;
    private int minperson;
    private int tablestatus;
    private int minconsumption;
    private String highestconsumption;
    private boolean canbooking;
    private boolean cansharing;
    private boolean cancombine;
    private boolean cansplit;
    private int sharenumber;
    private String sharecode;
    private int combinenumber;
    private String combinename;
    private String combinecode;
    private String splitnumber;
    private String splitcode;
    private String tabledesc;
    private String sortno;
    private boolean issync;
    private int creatorid;
    private String createtime;
    private String memo;

    public void setTableid(int tableid) {
        this.tableid = tableid;
    }

    public int getTableid() {
        return tableid;
    }

    public void setArchiveid(int archiveid) {
        this.archiveid = archiveid;
    }

    public int getArchiveid() {
        return archiveid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public int getAreaid() {
        return areaid;
    }

    public void setTablecode(String tablecode) {
        this.tablecode = tablecode;
    }

    public String getTablecode() {
        return tablecode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getTablename() {
        return tablename;
    }

    public void setDefaultperson(int defaultperson) {
        this.defaultperson = defaultperson;
    }

    public int getDefaultperson() {
        return defaultperson;
    }

    public void setMaxperson(int maxperson) {
        this.maxperson = maxperson;
    }

    public int getMaxperson() {
        return maxperson;
    }

    public void setMinperson(int minperson) {
        this.minperson = minperson;
    }

    public int getMinperson() {
        return minperson;
    }

    public void setTablestatus(int tablestatus) {
        this.tablestatus = tablestatus;
    }

    public int getTablestatus() {
        return tablestatus;
    }

    public void setMinconsumption(int minconsumption) {
        this.minconsumption = minconsumption;
    }

    public int getMinconsumption() {
        return minconsumption;
    }

    public void setHighestconsumption(String highestconsumption) {
        this.highestconsumption = highestconsumption;
    }

    public String getHighestconsumption() {
        return highestconsumption;
    }

    public void setCanbooking(boolean canbooking) {
        this.canbooking = canbooking;
    }

    public boolean getCanbooking() {
        return canbooking;
    }

    public void setCansharing(boolean cansharing) {
        this.cansharing = cansharing;
    }

    public boolean getCansharing() {
        return cansharing;
    }

    public void setCancombine(boolean cancombine) {
        this.cancombine = cancombine;
    }

    public boolean getCancombine() {
        return cancombine;
    }

    public void setCansplit(boolean cansplit) {
        this.cansplit = cansplit;
    }

    public boolean getCansplit() {
        return cansplit;
    }

    public void setSharenumber(int sharenumber) {
        this.sharenumber = sharenumber;
    }

    public int getSharenumber() {
        return sharenumber;
    }

    public void setSharecode(String sharecode) {
        this.sharecode = sharecode;
    }

    public String getSharecode() {
        return sharecode;
    }

    public void setCombinenumber(int combinenumber) {
        this.combinenumber = combinenumber;
    }

    public int getCombinenumber() {
        return combinenumber;
    }

    public void setCombinename(String combinename) {
        this.combinename = combinename;
    }

    public String getCombinename() {
        return combinename;
    }

    public void setCombinecode(String combinecode) {
        this.combinecode = combinecode;
    }

    public String getCombinecode() {
        return combinecode;
    }

    public void setSplitnumber(String splitnumber) {
        this.splitnumber = splitnumber;
    }

    public String getSplitnumber() {
        return splitnumber;
    }

    public void setSplitcode(String splitcode) {
        this.splitcode = splitcode;
    }

    public String getSplitcode() {
        return splitcode;
    }

    public void setTabledesc(String tabledesc) {
        this.tabledesc = tabledesc;
    }

    public String getTabledesc() {
        return tabledesc;
    }

    public void setSortno(String sortno) {
        this.sortno = sortno;
    }

    public String getSortno() {
        return sortno;
    }

    public void setIssync(boolean issync) {
        this.issync = issync;
    }

    public boolean getIssync() {
        return issync;
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

    @Override
    public String toString() {
        return "BDinningtableinfo{" +
                "tableid=" + tableid +
                ", archiveid=" + archiveid +
                ", areaid=" + areaid +
                ", tablecode='" + tablecode + '\'' +
                ", qrcode='" + qrcode + '\'' +
                ", tablename='" + tablename + '\'' +
                ", defaultperson=" + defaultperson +
                ", maxperson=" + maxperson +
                ", minperson=" + minperson +
                ", tablestatus=" + tablestatus +
                ", minconsumption=" + minconsumption +
                ", highestconsumption='" + highestconsumption + '\'' +
                ", canbooking=" + canbooking +
                ", cansharing=" + cansharing +
                ", cancombine=" + cancombine +
                ", cansplit=" + cansplit +
                ", sharenumber=" + sharenumber +
                ", sharecode='" + sharecode + '\'' +
                ", combinenumber=" + combinenumber +
                ", combinename='" + combinename + '\'' +
                ", combinecode='" + combinecode + '\'' +
                ", splitnumber='" + splitnumber + '\'' +
                ", splitcode='" + splitcode + '\'' +
                ", tabledesc='" + tabledesc + '\'' +
                ", sortno='" + sortno + '\'' +
                ", issync=" + issync +
                ", creatorid=" + creatorid +
                ", createtime='" + createtime + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}