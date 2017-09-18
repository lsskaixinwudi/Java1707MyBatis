package com.situ.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.situ.dao.IStudentDao;
import com.situ.pojo.Banji;
import com.situ.pojo.Student;
import com.situ.vo.SearchVo;

public class StudentDaoImpl implements IStudentDao{

	SqlSessionFactory sqlSessionFactory;
	public StudentDaoImpl(){
		String resource = "mybatis.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();		
		List<Student> list = sqlSession.selectList("student.findAll");
		sqlSession.close();
		return list;
	}

	@Override
	public List<Student> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findBySearchVo(SearchVo searchVo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findByPage(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findByPageNew(int index, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Student> findByCondition(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void dynaUpdate(Student student) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Student> findByIdArray(int[] array) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findByIdList(List<Integer> list) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findByIdSeachVo(SearchVo searchVo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findInfos() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Banji findBanjiInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student findBanjiCourseInfoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
