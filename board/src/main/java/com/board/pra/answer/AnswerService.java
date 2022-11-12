package com.board.pra.answer;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.board.pra.question.Question;

import lombok.RequiredArgsConstructor;

//dto,vo 대신 lombok 정보를 가져온다
@RequiredArgsConstructor
@Service
//@Repository -> 맨 처음에 만들어서 필요없다 ????
public class AnswerService {
	private final AnswerRepository answerRepository;
	
	public void create(Question question, String content) {
		Answer answer = new Answer();
		answer.setContent(content);
		answer.setCreateDate(LocalDateTime.now()); //현재 컴퓨터의 시간을 저장
		answer.setQuestion(question);
		this.answerRepository.save(answer);
	}
}

//1.컨트롤러 에서 리파지토리로 바로연결되던 상황
//2.그 사이에 서비스를 거쳐서 리파지토리로 변경하는 상황