package com.example.alexkaer.model.entity;

/**
 * Auto-generated: 2017-03-10 17:45:1
 */
public class BShopareainfo {

    private int areaid;
    private int parentid;
    private int archiveid;
    private int orgid;
    private String areacode;
    private String areaname;
    private int isdefault;
    private String areadesc;
    private String locationcode;
    private String locationdesc;
    private int managerid;
    private String managername;
    private boolean isbooking;
    private String treeid;
    private String sortno;
    private int creatorid;
    private String createtime;
    private String memo;
    private boolean issync;

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public int getAreaid() {
        return areaid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getParentid() {
        return parentid;
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

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setIsdefault(int isdefault) {
        this.isdefault = isdefault;
    }

    public int getIsdefault() {
        return isdefault;
    }

    public void setAreadesc(String areadesc) {
        this.areadesc = areadesc;
    }

    public String getAreadesc() {
        return areadesc;
    }

    public void setLocationcode(String locationcode) {
        this.locationcode = locationcode;
    }

    public String getLocationcode() {
        return locationcode;
    }

    public void setLocationdesc(String locationdesc) {
        this.locationdesc = locationdesc;
    }

    public String getLocationdesc() {
        return locationdesc;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public int getManagerid() {
        return managerid;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getManagername() {
        return managername;
    }

    public void setIsbooking(boolean isbooking) {
        this.isbooking = isbooking;
    }

    public boolean getIsbooking() {
        return isbooking;
    }

    public void setTreeid(String treeid) {
        this.treeid = treeid;
    }

    public String getTreeid() {
        return treeid;
    }

    public void setSortno(String sortno) {
        this.sortno = sortno;
    }

    public String getSortno() {
        return sortno;
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
        return "BShopareainfo{" +
                "areaid=" + areaid +
                ", parentid=" + parentid +
                ", archiveid=" + archiveid +
                ", orgid=" + orgid +
                ", areacode='" + areacode + '\'' +
                ", areaname='" + areaname + '\'' +
                ", isdefault=" + isdefault +
                ", areadesc='" + areadesc + '\'' +
                ", locationcode='" + locationcode + '\'' +
                ", locationdesc='" + locationdesc + '\'' +
                ", managerid=" + managerid +
                ", managername='" + managername + '\'' +
                ", isbooking=" + isbooking +
                ", treeid='" + treeid + '\'' +
                ", sortno='" + sortno + '\'' +
                ", creatorid=" + creatorid +
                ", createtime='" + createtime + '\'' +
                ", memo='" + memo + '\'' +
                ", issync=" + issync +
                '}';
    }
}