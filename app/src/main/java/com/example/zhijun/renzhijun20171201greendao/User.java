package com.example.zhijun.renzhijun20171201greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Zhijun on 2017/12/1.
 */
@Entity
public class User {
    @Id
    private Long uId;
    private String uName;
    private Integer uAge;
    private Integer uSex;
    private String uTel;

    @Generated(hash = 1963424245)
    public User(Long uId, String uName, Integer uAge, Integer uSex, String uTel) {
        this.uId = uId;
        this.uName = uName;
        this.uAge = uAge;
        this.uSex = uSex;
        this.uTel = uTel;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uAge=" + uAge +
                ", uSex=" + uSex +
                ", uTel='" + uTel + '\'' +
                '}';
    }

    public Long getUId() {
        return this.uId;
    }

    public void setUId(Long uId) {
        this.uId = uId;
    }

    public String getUName() {
        return this.uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public Integer getUAge() {
        return this.uAge;
    }

    public void setUAge(Integer uAge) {
        this.uAge = uAge;
    }

    public Integer getUSex() {
        return this.uSex;
    }

    public void setUSex(Integer uSex) {
        this.uSex = uSex;
    }

    public String getUTel() {
        return this.uTel;
    }

    public void setUTel(String uTel) {
        this.uTel = uTel;
    }
}