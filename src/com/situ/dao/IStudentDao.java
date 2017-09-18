package com.situ.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.situ.pojo.Banji;
import com.situ.pojo.Student;
import com.situ.vo.SearchVo;

public interface IStudentDao {
	
	public Student findById(int id);
	public List<Student> findAll();
	public List<Student> findByName(String name);
	
	public List<Student> findBySearchVo(SearchVo searchVo);
	public List<Student> findByPage(Map<String, Integer>map);
	public List<Student> findByPageNew(@Param(value="index")int index,@Param(value="pageSize")int pageSize);
	public int findCount();
	
	public List<Student> findByCondition(Student student);
	public void dynaUpdate(Student student);
	
	public List<Student> findByIdArray(int[] array);
	public List<Student> findByIdList(List<Integer>list);
	public List<Student> findByIdSeachVo(SearchVo searchVo);
	
	public List<Student> findInfos();
	public Banji findBanjiInfo(int id);
	
	public Student findBanjiCourseInfoById(int id);
	
}
