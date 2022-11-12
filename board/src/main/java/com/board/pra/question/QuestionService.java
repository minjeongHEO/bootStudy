package com.board.pra.question;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.board.pra.DataNotFoundException;

import lombok.RequiredArgsConstructor;

//dto,vo 대신 lombok 정보를 가져온다
@RequiredArgsConstructor
@Service
//@Repository -> 맨 처음에 만들어서 필요없다 ????
public class QuestionService {
	private final QuestionRepository questionRepository;
	
	public List<Question>  getList(){
		return this.questionRepository.findAll();
	}
	
	//디테일 조회하는 메서드
	public Question getQuestion(Integer id) {
		Optional<Question> question = this.questionRepository.findById(id); //nullpointerexception 방지해주는 클래스
		if(question.isPresent()) { //isPresent() : 해당 데이터 있는지 없는지 검사
			return question.get();
		}else {
			throw new DataNotFoundException("question not found");
		}
	}
}

//1.컨트롤러 에서 리파지토리로 바로연결되던 상황
//2.그 사이에 서비스를 거쳐서 리파지토리로 변경하는 상황