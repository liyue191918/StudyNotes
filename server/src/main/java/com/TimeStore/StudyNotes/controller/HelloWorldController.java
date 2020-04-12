package com.TimeStore.StudyNotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TimeStore.StudyNotes.mapper.UserMapper;
import com.TimeStore.StudyNotes.model.user.User;

@RestController
public class HelloWorldController {

	@Autowired
	private UserMapper userMapper;
	
    @RequestMapping("/hello")
    public String index() {
    	User user=userMapper.getOne("demo");
        return user.getFirstName();
    }
}