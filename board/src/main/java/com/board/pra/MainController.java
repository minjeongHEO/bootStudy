package com.board.pra;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.pra.question.Question;
import com.board.pra.question.QuestionRepository;
import com.board.pra.question.QuestionService;

import lombok.RequiredArgsConstructor;
@RequestMapping("/question") //url prefix
@RequiredArgsConstructor //QuestionRepository를 가져오기 위한 어노테이션 -> 자동으로 생성자를 설정해준다. 즉 리파지토리에 연결되어있는 해당 객체(엔티티)로 생성자를 만들어준다.
@Controller
public class MainController {
	
//1.private final QuestionRepository questionRepository;
//2.
	private final QuestionService questionService;
	
	//@ResponseBody
	@RequestMapping(value = "/list")
//	public String list(Model model) {
	public String list(Model model) {
//1.	List<Question> questionList = this.questionRepository.findAll();
//2.
		List<Question> questionList = this.questionService.getList(); 
		//questionService는 findAll()메서드가 없지만 서비스에서 findall을 호출해주고있음
		
		model.addAttribute("questionList",questionList); //model은 key:value형태로 객체를 가져오는데,
		return "question_list"; //뷰단 파일이름만 맞춰준다.
	}
	
	
//	@RequestMapping("/question/list")
	@RequestMapping(value = "/detail/{id}")
		public String detail(Model model, @PathVariable("id") Integer id) {
		Question question = this.questionService.getQuestion(id);
		model.addAttribute("question",question);
		return "question_detail";
	}
	
	
	@RequestMapping("/main")
	@ResponseBody //url요청에 대한 응답처리 , ajax(비동기)사용 시 
	public String index() {
		System.out.println("인덱스 입니다");
		return "인덱스입니다";
	}
	
	
}
