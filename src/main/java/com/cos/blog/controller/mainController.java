package com.cos.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //파일을 전송함 //RestController는 데이터를 전송함			
public class mainController {

	@GetMapping("/")
	public String hello() {
		return "index";
	}
}
