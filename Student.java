package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="stud")
@Entity
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id") 
	private int id;
	@Column(name="sname") 
	private String sname;
	@Column(name="email") 
	private String email;
	@Column(name="addr") 
	private String addr;
	@Column(name="s_class") 
	private String s_class;
	@Column(name="dob") 
	private Date dob;
	@Column(name="gender") 
	private String gender;
	@Column(name="mob_no") 
	private int mob_no;
	private int t_id;
	public Student()
	{
		
	}
	public Student(int id, String sname, String email, String addr, String s_class, Date dob, String gender, int mob_no) {
		super();
		this.id = id;
		this.sname = sname;
		this.email = email;
		this.addr = addr;
		this.s_class = s_class;
		this.dob = dob;
		this.gender = gender;
		this.mob_no = mob_no;
		this.t_id = t_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
	public String getS_class() {
		return s_class;
	}
	public void setS_class(String s_class) {
		this.s_class = s_class;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
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
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	

}