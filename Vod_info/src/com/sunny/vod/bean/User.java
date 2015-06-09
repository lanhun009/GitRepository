package com.sunny.vod.bean;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user_tb"
    ,catalog="hysxpt"
)

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String username;
     private String password;
     private String sex;
     private String citys;
     private String schooltype;
     private String school;
     private String email;
     private String identification;
     private String name;
     private String createtime;
     private String privilegeId;
     private String status;
     private String userMd5;
     private String groupName;
     private String headSculpture;
     private String schoolId;
     private String cityId;
     private String identity;
     private String lastLoginTime;
     private String thisLoginTime;
     private String createIp;


    // Constructors

    /** default constructor */
    public User() {
    }

    
    /** full constructor */
    public User(String username, String password, String sex, String citys, String schooltype, String school, String email, String identification, String name, String createtime, String privilegeId, String status, String userMd5, String groupName, String headSculpture, String schoolId, String cityId, String identity, String lastLoginTime, String thisLoginTime, String createIp) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.citys = citys;
        this.schooltype = schooltype;
        this.school = school;
        this.email = email;
        this.identification = identification;
        this.name = name;
        this.createtime = createtime;
        this.privilegeId = privilegeId;
        this.status = status;
        this.userMd5 = userMd5;
        this.groupName = groupName;
        this.headSculpture = headSculpture;
        this.schoolId = schoolId;
        this.cityId = cityId;
        this.identity = identity;
        this.lastLoginTime = lastLoginTime;
        this.thisLoginTime = thisLoginTime;
        this.createIp = createIp;
    }

   
    // Property accessors
    @GenericGenerator(name="generator", strategy="increment")@Id @GeneratedValue(generator="generator")
    
    @Column(name="Id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="username", length=20)

    public String getUserName() {
        return this.username;
    }
    
    public void setUserName(String username) {
        this.username = username;
    }
    
    @Column(name="password", length=20)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="sex", length=4)

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Column(name="citys", length=20)

    public String getCitys() {
        return this.citys;
    }
    
    public void setCitys(String citys) {
        this.citys = citys;
    }
    
    @Column(name="schooltype", length=20)

    public String getSchooltype() {
        return this.schooltype;
    }
    
    public void setSchooltype(String schooltype) {
        this.schooltype = schooltype;
    }
    
    @Column(name="school", length=100)

    public String getSchool() {
        return this.school;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }
    
    @Column(name="email", length=50)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="identification", length=30)

    public String getIdentification() {
        return this.identification;
    }
    
    public void setIdentification(String identification) {
        this.identification = identification;
    }
    
    @Column(name="name", length=20)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="createtime", length=20)

    public String getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
    
    @Column(name="privilegeId", length=20)

    public String getPrivilegeId() {
        return this.privilegeId;
    }
    
    public void setPrivilegeId(String privilegeId) {
        this.privilegeId = privilegeId;
    }
    
    @Column(name="status", length=16)

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="userMd5", length=100)

    public String getUserMd5() {
        return this.userMd5;
    }
    
    public void setUserMd5(String userMd5) {
        this.userMd5 = userMd5;
    }
    
    @Column(name="groupName", length=100)

    public String getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    @Column(name="headSculpture", length=100)

    public String getHeadSculpture() {
        return this.headSculpture;
    }
    
    public void setHeadSculpture(String headSculpture) {
        this.headSculpture = headSculpture;
    }
    
    @Column(name="schoolId", length=10)

    public String getSchoolId() {
        return this.schoolId;
    }
    
    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }
    
    @Column(name="cityId", length=5)

    public String getCityId() {
        return this.cityId;
    }
    
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    
    @Column(name="identity", length=10)

    public String getIdentity() {
        return this.identity;
    }
    
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    @Column(name="lastLoginTime", length=20)

    public String getLastLoginTime() {
        return this.lastLoginTime;
    }
    
    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    
    @Column(name="thisLoginTime", length=20)

    public String getThisLoginTime() {
        return this.thisLoginTime;
    }
    
    public void setThisLoginTime(String thisLoginTime) {
        this.thisLoginTime = thisLoginTime;
    }
    
    @Column(name="createIp", length=50)

    public String getCreateIp() {
        return this.createIp;
    }
    
    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }
   








}