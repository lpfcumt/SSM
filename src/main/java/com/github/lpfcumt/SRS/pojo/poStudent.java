package com.github.lpfcumt.SRS.pojo;


public class poStudent {
	private String id;
	private String name;
	private String password;
	private String grade;
	private String major;
	
	public poStudent(){
		
	}
	public poStudent(String id, String name, String password, String grade, String major) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.grade = grade;
		this.major = major;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
