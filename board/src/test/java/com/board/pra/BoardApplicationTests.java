package com.board.pra;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.pra.question.Question;
import com.board.pra.question.QuestionRepository;

@SpringBootTest
class BoardApplicationTests {
	
	@Autowired
	QuestionRepository questionRepository;

	//@Test ->junit으로 실행
	@Test
	void contextLoads() {
		 Question q = new Question();
		 q.setSubject("테스트 글 제목");
		 q.setContent("테스트 글 내용");
		 q.setCreateDate(LocalDateTime.now());
		 this.questionRepository.save(q);
		 
		 Question q2 = new Question();
		 q2.setSubject("테스트 글 제목");
		 q2.setContent("테스트 글 내용");
		 q2.setCreateDate(LocalDateTime.now());
		 this.questionRepository.save(q2);
	}
	
}
