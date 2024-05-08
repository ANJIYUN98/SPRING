package com.example.app.domain.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;

import com.example.app.domain.dto.BoardDto;

@Mapper
public interface BoardMapper {
	
	@Insert("insert into tbl_board value(#{id}, #{title}, #{contents}, #{writer}, #{regDate})")
	public int Insert (BoardDto boardDto);
	
	@Update("update tbl_board set title=#{title}, contents=#{contents}, writer=#{writer}, regDate=#{regDate} where id=#{id}")
	public int Update (BoardDto boardDto);
	
	@Delete("delete from tbl_board where id=#{id}")
	public int Delete (int id);
	
	@Select("select * from tbl_board where id=#{id}")
	public BoardDto SelectAt (int id);
	
	@Select("select * from tbl_board")
	public List<BoardDto> SelectAll();
	
	@Results(id="BoardResultMap", value= {
			@Result(property="id",column="id"),
			@Result(property="title",column="title"),
			@Result(property="contents",column="contents"),
			@Result(property="writer",column="writer"),
			@Result(property="regDate",column="regDate")
			
	})
	@Select("select * from tbl_board")
	public List< Map<String,Object> >SelectAllResultMap();
	
	
	//BoardMapper.xml
	public int InsertXML(BoardDto boardDto);
	public int UpdateXML(BoardDto boardDto);
	public int DeleteXML(int id);
	public BoardDto SelectAtXML(int id);
	public List<BoardDto> SelectAllXML();
	public List< Map<String,Object> >SelectAllResultMapXML();
	
}
