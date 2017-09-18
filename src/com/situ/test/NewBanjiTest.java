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

import com.situ.dao.IBanjiDao;
import com.situ.dao.IStudentDao;
import com.situ.pojo.Banji;
import com.situ.pojo.Student;
import com.situ.vo.SearchVo;

public class NewBanjiTest {
	
	SqlSessionFactory sqlSessionFactory;
	public NewBanjiTest(){
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
	
	@Test
	public void testFindBanjiInfoById() {
		SqlSession session = sqlSessionFactory.openSession();
		IBanjiDao banjiDao = session.getMapper(IBanjiDao.class);
		Banji banji = banjiDao.findBanjiInfoById(1);
		System.out.println(banji);
		session.close();
	}
	
	

}
