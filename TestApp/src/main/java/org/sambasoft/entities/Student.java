package org.sambasoft.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
    private String fname;
    private String lname;
    private String address;
    private String mobile1;
    private String whatsapp;
    private String email;
    private String password;
    private Date joiningdate;
    private String status;
    private String emergencycontact;
    private String parentname;
    @Column(nullable=false)
    private Long batchid;
    
    @ManyToOne(optional=false)
    @JoinColumn(name = "batchid", referencedColumnName="id",insertable = false, updatable = false)
    private Batch batch;
    
    public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile1() {
		return mobile1;
	}
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmergencycontact() {
		return emergencycontact;
	}
	public void setEmergencycontact(String emergencycontact) {
		this.emergencycontact = emergencycontact;
	}
	public String getParentname() {
		return parentname;
	}
	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	public Long getBatchid() {
		return batchid;
	}
	public void setBatchid(Long batchid) {
		this.batchid = batchid;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Student(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	public Student() {
	}
    
}
