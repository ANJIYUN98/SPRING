package com.example.app.domain.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.app.domain.dto.MemoDto;

@Repository
public class MemoDaoImpl {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static String namespace="com.example.app.domain.mapper.MemoMapper."; 
	//여기 안에 있는 함수를 쓸 것이기 때문에 맨 뒤에 . 까지 찍어줘야 한다.
	
	public MemoDto Insert(MemoDto memoDto) {
		sqlSession.insert(namespace+"Insert", memoDto);
		return memoDto;
	}
}
