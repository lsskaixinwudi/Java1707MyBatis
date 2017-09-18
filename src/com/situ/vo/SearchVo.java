package com.situ.vo;

import java.util.List;

import com.situ.pojo.Student;

public class SearchVo {
	private Student student;
	private List<Integer> idList;

	
	
	public SearchVo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SearchVo(List<Integer> idList) {
		super();
		this.idList = idList;
	}



	public SearchVo(Student student, List<Integer> idList) {
		super();
		this.student = student;
		this.idList = idList;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public List<Integer> getIdList() {
		return idList;
	}



	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}



	@Override
	public String toString() {
		return "SearchVo [student=" + student + ", idList=" + idList + "]";
	}



	
	
}
