package com.board.pra.answer;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.board.pra.question.Question;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
//	@Id : 기본키 지정, 기본키의 모든 특성을 가진 컬럼과 동일하게 적용
//	@GeneratedValue : sequence(oracle)/auto_increament(mysql)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
//	@Column : 컬럼의 세부설정 필요 시 사용
	@Column(columnDefinition="TEXT")
	private String content;
	
//	컬럼 어노테이션이 없어도 컬럼으로 인식함.
//	@Transient : 만약 컬럼으로 인식하고 싶지 않은 필드에 사용한다.
	private LocalDateTime createDate;
	
//	@ManyToOne or OneToMany
	@ManyToOne
	private Question question;
	
}
