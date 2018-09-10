package org.sambasoft.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class AttendanceStudent {
	@Id
	@GeneratedValue
	private Long id;
    private Long studentId;
    private Date date;
    private Long batchId;
    private String status;
   
    @OneToMany
    @JoinColumn(name = "studentId", referencedColumnName="id")
    private List<Student> students;
    
  
    
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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


	public AttendanceStudent() {
	}
    
}
