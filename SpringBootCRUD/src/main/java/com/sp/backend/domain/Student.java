package com.sp.backend.domain;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Student {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String studentname;
	private String course;
	private int fee;
	
	public Student() {
		super();
	}

	public Student(long id,String studentname,String course,int fee) {
		this.id = id;
		this.studentname = studentname;
		this.course = course;
		this.fee = fee;
	}
	public long getId() {
		return id;
	}
	public String getStudentname() {
		return studentname;
	}
	public String getCourse() {
		return course;
	}
	public int getFee() {
		return fee;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
}
