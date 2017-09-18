package com.situ.pojo;

import java.io.Serializable;

public class Student implements Serializable{
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String adderss;
	private Integer banji_id;
	private Banji banji;
	
	
	public Student() {
		
	}


	public Student(Integer id, String name, Integer age, String gender, String adderss, Integer banji_id) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.adderss = adderss;
		this.banji_id = banji_id;
	}
	
	


	public Student(Integer id, String name, Integer age, String gender, String adderss, Integer banji_id, Banji banji) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.adderss = adderss;
		this.banji_id = banji_id;
		this.banji = banji;
	}


	public Banji getBanji() {
		return banji;
	}


	public void setBanji(Banji banji) {
		this.banji = banji;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return adderss;
	}


	public void setAddress(String address) {
		this.adderss = address;
	}


	public Integer getBanji_id() {
		return banji_id;
	}


	public void setBanji_id(Integer banji_id) {
		this.banji_id = banji_id;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", adderss=" + adderss
				+ ", banji_id=" + banji_id + ", banji=" + banji + "]";
	}


	
	

}
