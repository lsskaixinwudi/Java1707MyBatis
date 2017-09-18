package com.situ.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.situ.pojo.Banji;

public class BanjiTest {
	
	@Test
	public void testById() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream); 
		SqlSession sqlSession = factory.openSession();
		Banji banji = sqlSession.selectOne("banji.findById",1);
		System.out.println(banji);
		sqlSession.close();
	}
	
	
	@Test
	public void testFindBanjiInfoById() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream); 
		SqlSession sqlSession = factory.openSession();
		Banji banji = sqlSession.selectOne("banji.findById",1);
		System.out.println(banji);
		sqlSession.close();
	}

}
