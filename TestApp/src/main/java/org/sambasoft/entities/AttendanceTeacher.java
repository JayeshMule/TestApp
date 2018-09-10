package org.sambasoft.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class AttendanceTeacher {
	@Id
	@GeneratedValue
	private Long id;
    private Long teacherId;
    private Date date;
    private Long batchId;
    private String status;
    private String salary;

    @OneToMany
    @JoinColumn(name = "teacherId", referencedColumnName="id")
    private List<Teacher> teacher;
    
	public Long getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Long getBatchId() {
		return batchId;
	}


	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public AttendanceTeacher() {
	}
    
}
