package com.board.pra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;//juit을 쓰기위해서 import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.pra.question.Question;
import com.board.pra.question.QuestionRepository;

@SpringBootTest
public class Search {
	
	//리파지토리에 대한 호출 => 리파지토리=dao
	@Autowired
	private QuestionRepository questionRepository; //interface, jpa의 repository를 상속받고있음 ->board/src/main/java/com/board/pra/QuestionRepository.java
	
	@Test
	void testJpa() {
		//jpa를 통한 데이터조회를 해보자
		List<Question> all = this.questionRepository.findAll();
		//assertEquals(기대값, 실제값) : 기대값이 실제값과 동일하지 않으면 테스트는 실패 처리된다.
		assertEquals(1, all.size());
		
		Question q = all.get(0);
		assertEquals("테스트중입니다",q.getSubject());
		
	}

}
