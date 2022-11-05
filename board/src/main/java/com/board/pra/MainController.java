package com.board.pra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/main")
	@ResponseBody //url요청에 대한 응답처리 , ajax(비동기)사용 시 
	public String index() {
		System.out.println("인덱스 입니다");
		return "인덱스입니다";
	}
}
