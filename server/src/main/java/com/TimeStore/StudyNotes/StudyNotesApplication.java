package com.TimeStore.StudyNotes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.TimeStore.StudyNotes.mapper")
public class StudyNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyNotesApplication.class, args);
	}
	
}
