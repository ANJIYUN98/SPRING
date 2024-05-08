package com.example.app.mybatis;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.app.controller.controllerTests;
import com.example.app.domain.dto.BoardDto;
import com.example.app.domain.mapper.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class mybatisTest {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
//	@Autowired
//	private SqlSession sqlSession;
	
	@Test
	public void sqlSessionFactoryTests() {
		log.info(sqlSessionFactory.toString());
		SqlSession session = sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		log.info(conn.toString());
	}
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void BoardMapperTests() {
//		boardMapper.Insert(new BoardDto((long)11,"title1","content1","a1","2024-01-01"));
//		boardMapper.Update(new BoardDto((long)11,"Title11","Content11","b1","2024-02-01"));
		
//		for(Long i=(long) 1; i<=11; i++) {
//			boardMapper.Insert(new BoardDto(i,"title"+i,"content"+i,"a"+i,"2024-01-0"+i));
//		}
	
//		boardMapper.Delete(6);
		
//		BoardDto b1 = boardMapper.SelectAt(5);
//		log.info(b1.toString());
		
//		List<BoardDto> list = boardMapper.SelectAll();
//		for(BoardDto dto : list)
//			log.info(dto.toString());
		
		List< Map<String,Object> > result = boardMapper.SelectAllResultMap();
		result.forEach((map)->{
			for(String key : map.keySet()) {				
				log.info(key + " : " + map.get(key));
			}
		});
	
	}
	
	@Test
	public void MybatisTestsXML() {
//		boardMapper.InsertXML(new BoardDto((long)12,"title12","contents12","writer12","2024-02-02"));
//		boardMapper.UpdateXML(new BoardDto(12L,"Title12","Contents12","b2","2024-03-02"));
//		(long)12 대신 12L 도 가능하다. 	
//		boardMapper.DeleteXML(12);
		
//		BoardDto dto = boardMapper.SelectAtXML(3);
//		log.info(dto.toString());
		
//		List<BoardDto> list = boardMapper.SelectAllXML();
//		for(BoardDto dto : list)
//			log.info(dto.toString());
		
		List<Map<String,Object>> result = boardMapper.SelectAllResultMapXML();
		result.forEach(map->{
			for(String key : map.keySet()) {
				log.info(key + " : " + map.get(key));
			}
		});
	}
	

}
