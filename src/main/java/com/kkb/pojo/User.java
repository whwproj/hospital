package com.kkb.pojo;

import java.util.Date;

public class User {
    private Integer uId;

    private String uLoginName;

    private String uPassword;

    private String uTrunAme;

    private String uEmail;

    private Integer uState;

    private Integer rId;

    private Integer uIsDel;

    private Date uCreateTime;

    private Date uUpdateTime;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuLoginName() {
        return uLoginName;
    }

    public void setuLoginName(String uLoginName) {
        this.uLoginName = uLoginName == null ? null : uLoginName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuTrunAme() {
        return uTrunAme;
    }

    public void setuTrunAme(String uTrunAme) {
        this.uTrunAme = uTrunAme == null ? null : uTrunAme.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public Integer getuState() {
        return uState;
    }

    public void setuState(Integer uState) {
        this.uState = uState;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getuIsDel() {
        return uIsDel;
    }

    public void setuIsDel(Integer uIsDel) {
        this.uIsDel = uIsDel;
    }

    public Date getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public Date getuUpdateTime() {
        return uUpdateTime;
    }

    public void setuUpdateTime(Date uUpdateTime) {
        this.uUpdateTime = uUpdateTime;
    }
}