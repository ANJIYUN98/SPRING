package com.example.app.domain.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
public class BoardDto {
	private Long id;
	private String title;
	private String contents;
	private String writer;
	private String regDate;
}
