package org.yhb.vo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userid;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Byte role;

    private Date regtime;

    private String regip;

    private Date lastlogintime;

    private String lastloginip;

    private Byte teaposition;

    private Byte teacurrentstu;

    private Byte teamaxstu;

    private String stunumber;

    private Byte stuclassid;

    private Integer stucourseid;

    private Integer stuteacherid;

    private Byte isdeleted;

    private String teadescription;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip;
    }

    public Byte getTeaposition() {
        return teaposition;
    }

    public void setTeaposition(Byte teaposition) {
        this.teaposition = teaposition;
    }

    public Byte getTeacurrentstu() {
        return teacurrentstu;
    }

    public void setTeacurrentstu(Byte teacurrentstu) {
        this.teacurrentstu = teacurrentstu;
    }

    public Byte getTeamaxstu() {
        return teamaxstu;
    }

    public void setTeamaxstu(Byte teamaxstu) {
        this.teamaxstu = teamaxstu;
    }

    public String getStunumber() {
        return stunumber;
    }

    public void setStunumber(String stunumber) {
        this.stunumber = stunumber;
    }

    public Byte getStuclassid() {
        return stuclassid;
    }

    public void setStuclassid(Byte stuclassid) {
        this.stuclassid = stuclassid;
    }

    public Integer getStucourseid() {
        return stucourseid;
    }

    public void setStucourseid(Integer stucourseid) {
        this.stucourseid = stucourseid;
    }

    public Integer getStuteacherid() {
        return stuteacherid;
    }

    public void setStuteacherid(Integer stuteacherid) {
        this.stuteacherid = stuteacherid;
    }

    public Byte getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getTeadescription() {
        return teadescription;
    }

    public void setTeadescription(String teadescription) {
        this.teadescription = teadescription;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getRegtime() == null ? other.getRegtime() == null : this.getRegtime().equals(other.getRegtime()))
            && (this.getRegip() == null ? other.getRegip() == null : this.getRegip().equals(other.getRegip()))
            && (this.getLastlogintime() == null ? other.getLastlogintime() == null : this.getLastlogintime().equals(other.getLastlogintime()))
            && (this.getLastloginip() == null ? other.getLastloginip() == null : this.getLastloginip().equals(other.getLastloginip()))
            && (this.getTeaposition() == null ? other.getTeaposition() == null : this.getTeaposition().equals(other.getTeaposition()))
            && (this.getTeacurrentstu() == null ? other.getTeacurrentstu() == null : this.getTeacurrentstu().equals(other.getTeacurrentstu()))
            && (this.getTeamaxstu() == null ? other.getTeamaxstu() == null : this.getTeamaxstu().equals(other.getTeamaxstu()))
            && (this.getStunumber() == null ? other.getStunumber() == null : this.getStunumber().equals(other.getStunumber()))
            && (this.getStuclassid() == null ? other.getStuclassid() == null : this.getStuclassid().equals(other.getStuclassid()))
            && (this.getStucourseid() == null ? other.getStucourseid() == null : this.getStucourseid().equals(other.getStucourseid()))
            && (this.getStuteacherid() == null ? other.getStuteacherid() == null : this.getStuteacherid().equals(other.getStuteacherid()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getTeadescription() == null ? other.getTeadescription() == null : this.getTeadescription().equals(other.getTeadescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getRegtime() == null) ? 0 : getRegtime().hashCode());
        result = prime * result + ((getRegip() == null) ? 0 : getRegip().hashCode());
        result = prime * result + ((getLastlogintime() == null) ? 0 : getLastlogintime().hashCode());
        result = prime * result + ((getLastloginip() == null) ? 0 : getLastloginip().hashCode());
        result = prime * result + ((getTeaposition() == null) ? 0 : getTeaposition().hashCode());
        result = prime * result + ((getTeacurrentstu() == null) ? 0 : getTeacurrentstu().hashCode());
        result = prime * result + ((getTeamaxstu() == null) ? 0 : getTeamaxstu().hashCode());
        result = prime * result + ((getStunumber() == null) ? 0 : getStunumber().hashCode());
        result = prime * result + ((getStuclassid() == null) ? 0 : getStuclassid().hashCode());
        result = prime * result + ((getStucourseid() == null) ? 0 : getStucourseid().hashCode());
        result = prime * result + ((getStuteacherid() == null) ? 0 : getStuteacherid().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getTeadescription() == null) ? 0 : getTeadescription().hashCode());
        return result;
    }
}