package com.situ.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.situ.dao.IStudentDao;
import com.situ.pojo.Banji;
import com.situ.pojo.Course;
import com.situ.pojo.Student;
import com.situ.vo.SearchVo;

public class StudentTest {
	
	SqlSessionFactory sqlSessionFactory;
	public StudentTest(){
		String resource = "mybatis.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testFindAll() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		List<Student>list = studentDao.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
		session.close();
	}
	
	@Test
	public void testFindById() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		Student student = studentDao.findById(3);
		System.out.println(student);
		session.close();
	}
	
	@Test
	public void testFindByName() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		List<Student>list = studentDao.findByName("zha");
		for (Student student : list) {
			System.out.println(student);
		}
		session.close();
	}
	
	@Test
	public void testFindBySearchVo() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		SearchVo searchVo = new SearchVo();
		Student student = new Student();
		student.setName("zha");
		searchVo.setStudent(student);
		List<Student> list = studentDao.findBySearchVo(searchVo);
		for (Student stu : list) {
			System.out.println(stu);
		}
		session.close();
	}
	
	
	@Test
	public void testFindByPage() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("index", 0);
		map.put("pageSize", 3);
		List<Student> list = studentDao.findByPage(map);
		for (Student stu : list) {
			System.out.println(stu);
		}
		session.close();
	}
	
	@Test
	public void testFindByPageNew() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		List<Student> list = studentDao.findByPageNew(3, 3);
		for (Student stu : list) {
			System.out.println(stu);
		}
		session.close();
	}
	
	@Test
	public void testFindCount() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		int count = studentDao.findCount();
		System.out.println(count);
		session.close();
	}
	
	@Test
	public void testFindByCondition() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		Student student = new Student();
		student.setName("zha");
		student.setAge(20);
		List<Student> list = studentDao.findByCondition(student);
		for (Student stu : list) {
			System.out.println(stu);
		}
		session.close();
	}
	
	
	@Test
	public void testDynaUpdate() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		Student student = new Student();
		student.setId(5);
		student.setName("¿œ’≈");
		student.setAge(30);
		student.setGender("≈Æ");
		studentDao.dynaUpdate(student);
		session.commit();
		session.close();
	}
	
	@Test
	public void testFindByIdArray() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		int[] array = {2,3,4};
		List<Student> list = studentDao.findByIdArray(array);
		for (Student student : list) {
			System.out.println(student);
		}
		session.close();
	}
	
	@Test
	public void testFindByIdList() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		List<Student> listResult = studentDao.findByIdList(list);
		for (Student student : listResult) {
			System.out.println(student);
		}
		session.close();
	}
	
	
	@Test
	public void testFindByIdSrarchVo() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		SearchVo searchVo = new SearchVo();
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(67);
		searchVo.setIdList(list);
		List<Student> listResult = studentDao.findByIdSeachVo(searchVo);
		for (Student student : listResult) {
			System.out.println(student);
		}
		session.close();
	}
	
	@Test
	public void testFindInfos() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		
		List<Student> listResult = studentDao.findInfos();
		for (Student student : listResult) {
			System.out.println(student);
		}
		session.close();
	}
	
	@Test
	public void testFindBanjiInfo() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		
		Banji banji = studentDao.findBanjiInfo(1);
		System.out.println(banji);
		session.close();
	}
	
	
	@Test
	public void testFindBanjiCourseInfoById() {
		SqlSession session = sqlSessionFactory.openSession();
		IStudentDao studentDao = session.getMapper(IStudentDao.class);
		
		Student student = studentDao.findBanjiCourseInfoById(1);
		System.out.println(student);
		Banji banji = student.getBanji();
		List<Course> list = banji.getCourseList();
		for (Course course : list) {
			System.out.println(course);
		}
		session.close();
	}

}
