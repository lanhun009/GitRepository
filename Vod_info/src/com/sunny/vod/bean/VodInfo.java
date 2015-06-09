package com.sunny.vod.bean;
// default package

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * VodInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="vod_info_tb"
    ,catalog="hysxpt"
)

public class VodInfo  implements java.io.Serializable {


    // Fields    

     private String id;
     private String classroom;
     private String manager;
     private String telephone;
     private String lbip;
     private String skip;
     private String hdip;
     private String zbip;
     private Time createtime;


    // Constructors

    /** default constructor */
    public VodInfo() {
    }

    
    /** full constructor */
    public VodInfo(String classroom, String manager, String telephone, String lbip, String skip, String hdip, String zbip, Time createtime) {
        this.classroom = classroom;
        this.manager = manager;
        this.telephone = telephone;
        this.lbip = lbip;
        this.skip = skip;
        this.hdip = hdip;
        this.zbip = zbip;
        this.createtime = createtime;
    }

   
    // Property accessors
    @GenericGenerator(name="generator", strategy="increment")@Id @GeneratedValue(generator="generator")
    
    @Column(name="id", unique=true, nullable=false, length=32)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="classroom", length=100)

    public String getClassroom() {
        return this.classroom;
    }
    
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    
    @Column(name="manager", length=20)

    public String getManager() {
        return this.manager;
    }
    
    public void setManager(String manager) {
        this.manager = manager;
    }
    
    @Column(name="telephone", length=30)

    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Column(name="lbip", length=30)

    public String getLbip() {
        return this.lbip;
    }
    
    public void setLbip(String lbip) {
        this.lbip = lbip;
    }
    
    @Column(name="skip", length=30)

    public String getSkip() {
        return this.skip;
    }
    
    public void setSkip(String skip) {
        this.skip = skip;
    }
    
    @Column(name="hdip", length=30)

    public String getHdip() {
        return this.hdip;
    }
    
    public void setHdip(String hdip) {
        this.hdip = hdip;
    }
    
    @Column(name="zbip", length=30)

    public String getZbip() {
        return this.zbip;
    }
    
    public void setZbip(String zbip) {
        this.zbip = zbip;
    }
    
    @Column(name="createtime", length=8)

    public Time getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Time createtime) {
        this.createtime = createtime;
    }
   








}