package com.cos.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.Users;
import com.cos.blog.service.UserService;

@RestController //데이터를 주고받으므로 RestController
public class UserApiController {

	@Autowired
	private UserService userservice;
	
	// 회원가입
	@PostMapping("/auth/joinProc")
	public ResponseDto<Integer> save(@RequestBody Users user) {
		
		userservice.회원가입(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
		// ResponseDto의 data는 1
		// ResponseDto의 state는 HttpStatus.OK.value()
		// 이 값을 요청한 user.js의 save:function()으로 돌려준다
	}
	
}
