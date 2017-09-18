package com.situ.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.situ.pojo.Student;

public class MybatisTest {
	
	@Test
	public void testFindById() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream); 
		SqlSession sqlSession = factory.openSession();
		Student student = sqlSession.selectOne("student.findById",4);
		System.out.println(student);
		sqlSession.close();
	}
	
	@Test
	public void testFindAll() throws IOException {
	
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession = factory.openSession();
		
		List<Student> list = sqlSession.selectList("student.findAll");
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
	}
	
	@Test
	public void testFindByName() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream); 
		SqlSession sqlSession = factory.openSession();
		List<Student> list = sqlSession.selectList("student.findByName","zha");
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
	}
	
	@Test
	public void testDeleteById() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream); 
		SqlSession sqlSession = factory.openSession();
		int result = sqlSession.delete("student.deleteById",17);
		System.out.println(result);
		
		sqlSession.commit();
		sqlSession.close();
	}
	
	
	@Test
	public void testAdd() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream); 
		SqlSession sqlSession = factory.openSession();
		Student student = new Student();
		student.setName("¹þÊ¿Ææ");
		student.setAge(23);
		student.setGender("Å®");
		int result = sqlSession.update("student.add",student);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void testDelete() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream); 
		SqlSession sqlSession = factory.openSession();
		Student student = new Student();
		student.setId(19);
		int result = sqlSession.delete("student.delete",student);
		System.out.println(result);
		
		sqlSession.commit();
		sqlSession.close();
	}
	
	
	

}
