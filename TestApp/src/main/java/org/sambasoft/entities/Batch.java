package org.sambasoft.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Batch {
	@Id
	@GeneratedValue
	private Long id;
    private String style;
    private String charge;
    private String classcount;
    private String day;
    private String status;
    private String address;
    private String timing;
    private Long teacherId;
    private Long tempTeacherId;
    
    @OneToMany
    @JoinColumn(name = "teacherId", referencedColumnName="id")
    private List<Teacher> teacher;
    
    @OneToMany
    @JoinColumn(name = "tempTeacherId", referencedColumnName="id")
    private List<Teacher> temp_teacher;
    
    public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public String getClasscount() {
		return classcount;
	}
	public void setClasscount(String classcount) {
		this.classcount = classcount;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public Long getTeacherid() {
		return teacherId;
	}
	public void setTeacherid(Long teacherid) {
		this.teacherId = teacherid;
	}
	public Long getTempTeacherId() {
		return tempTeacherId;
	}
	public void setTempTeacherId(Long tempTeacherId) {
		this.tempTeacherId = tempTeacherId;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	

	public Batch() {
	}
    
}
