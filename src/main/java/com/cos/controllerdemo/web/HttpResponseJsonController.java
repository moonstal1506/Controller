package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.domain.User;

@RestController
public class HttpResponseJsonController {
	
	@GetMapping("/resp/json")
	public String respJson() {
		return "{\"username\":\"tnwjd\"}";
	}
	@GetMapping("/resp/json/object")
	public User respJsonObject() {
		User user = new User();
		user.setUsername("홍길동");
		return user;
		//1. MessageConverter가 자동으로 JavaObject를 json(구xml)으로 변경해서 통신을 통해 응답해줌
		//2. @RestController일때만 MessageConverter작동
	}
}
