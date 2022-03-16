package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller//file 응답 컨트롤러(클라이언트가 브라우저 .html)
@RestController//데이터 응답 컨트롤러(클라이언트가 핸드폰이면 data)
public class HttpController {
	
	//http://localhost:8080/get
	@GetMapping("/get")
	public String get() {
		return "<h1>get</h1>";
	}
	
	@PostMapping("/post")
	public String post() {
		return "post";
	}
	
	@PutMapping("/put")
	public String put() {
		return "put";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "delete";
	}
}
