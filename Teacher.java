package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="teacher")
@Entity
public class Teacher{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="Tname")
	private String tname;
	@Column(name="email")
	private String email;
	@Column(name="addr")
	private String addr;
	@Column(name="subject")
	private String subject;
	@Column(name="dob")
	private int dob;
	@Column(name="gender")
	private String gender;
	@Column(name="mob_no")
	private int mob_no;
	public Teacher()
	{
		
	}
	
	public Teacher(int id, String tname, String email, String addr, String subject, int dob, String gender, int mob_no) {
		super();
		this.id = id;
		this.tname = tname;
		this.email = email;
		this.addr = addr;
		this.subject = subject;
		this.dob = dob;
		this.gender = gender;
		this.mob_no = mob_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMob_no() {
		return mob_no;
	}
	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}
	

}