package org.sambasoft.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	@GeneratedValue
    private Long id;
    private String fname;
    private String lname;
    private String address;
    private String mobile;
    private String whatsapp;
    private String email;
    private String password;
    private Date joiningdate;
    private Date startworkingdate;
    private Date leavingdate;
    private String status;
    
   
    
    public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public Date getStartworkingdate() {
		return startworkingdate;
	}
	public void setStartworkingdate(Date startworkingdate) {
		this.startworkingdate = startworkingdate;
	}
	public Date getLeavingdate() {
		return leavingdate;
	}
	public void setLeavingdate(Date leavingdate) {
		this.leavingdate = leavingdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public Teacher(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public Teacher() {
	}
    
}
