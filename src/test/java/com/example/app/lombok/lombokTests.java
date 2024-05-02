package com.example.app.lombok;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.app.domain.dto.PersonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class lombokTests {

	@Test
	public void personDtoTest() {
		PersonDto ob = new PersonDto();
		ob.setName("홍길동");
		ob.setAddr("대구");
		ob.setAge(55);
		log.info(ob.toString());
		
		//Junit Test function..
		assertNotNull(ob);
		
		//null 체크
		//PersonDto ob2 = null;
		//assertNotNull(ob2);
	}
	
	@Test
	public void personDtoTests_2() {
		
		//@Builder
		PersonDto ob = PersonDto.builder()
						.age(11)
						.name("홍길동")
						.addr("포항")
						.build();
		log.info(ob.toString());
		assertNotNull(ob);
	}
	

}
