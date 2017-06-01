package com.github.lpfcumt.pojo;


public class Students {
	private int id;
	private String students_id;
	private String name;
	private String password;
	private String repassword;
	private String email;
	private String tel;
	private String grade;
	private String major;
	private String school;
	private String sex;
	private String time;
	private String state;
	
	public Students(){
		
	}
	
	public Students(int id, String students_id, String name, String password, String repassword, String email,
			String tel, String grade, String major, String school, String sex, String time, String state) {
		super();
		this.id = id;
		this.students_id = students_id;
		this.name = name;
		this.password = password;
		this.repassword = repassword;
		this.email = email;
		this.tel = tel;
		this.grade = grade;
		this.major = major;
		this.school = school;
		this.sex = sex;
		this.time = time;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
	

	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	

	public String getStudents_id() {
		return students_id;
	}
	public void setStudents_id(String students_id) {
		this.students_id = students_id;
	}
	
	
	
	
}
