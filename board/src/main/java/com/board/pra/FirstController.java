package com.board.pra;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@RequestMapping("/hello") //url
	@ResponseBody //url응답
	public String sayhi() {
		//리턴 문자를 수정했지만 페이지 상의 내용은 변경되지 않았음
		//로컬 was가 변경된 클래스를 리로딩 하지 않았음
		return "안녕하세요!!!!!";
	}
	
	//Lombok(롬복)
	//자바 클래스에 getter setter 생성자등을 자동으로 만들어주는 도구
	//깔끔한 소스 코드를 만들 수 있다.
	//단점은 라이브러리 적용이 안돼는 경우가 자주 발생함
	
	//프로젝트 명 + Application파일
	//스프링 부트의 시작을 담당하는 파일
	//@SpringBootApplication : 스트링 부트의 설정을 관리하는 어노테이션
	
	//데이터베이스를 이용하려면?
	//쿼리를 통해 원하는 데이터들을 조회하거나 삭제할 수 있었음.
	//ORM을 통해 자바 문법으로 데이터베이스를 다룰 수 있다.
	
	//JPA(Java Persistence API) / 인터페이스(추상크래스의 종류인)
	// : 자바 ORM 기술 표준
	//Hibernate를 같이 사용할 것임
	
	//제목이 Subject고 내용 컬럼이 content라 가정했을 때 쿼리를 이용해서 데이터를 추가하려면?
	//기존] insert into question (subject, content) values('1','2')
	//ORM 사용할 떄] (dbms를 안가림)
	//			Question q1 = new Question();
	//			q1.setSubject('1');
	//			this.questionRespository.save(q1);
	
	
	
	
	
	
	
	
}
