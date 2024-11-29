package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
//		return "/home/main";
		return "home/main";
	}
	// jar 빌드 => 배포 후 html 경로를 찾지 못하는 문제가 발생함
	// html 경로를 직접 반환하는 부분을 상대경로로 수정해야함!
	// /home/main => home/main
	// 리턴타입이 void인 경우에는 수정할 필요없음!(String일 경우 상대경로로)
	
	//커스텀 로그인 페이지 반환하는 메소드
	@GetMapping("/customlogin")
	public String customLogin() {
//		return "/home/login";
		return "home/login";
	}

}
