package com.board.pra;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//롬복의 getter setter 어노테이션을 통해 set, get 등의 메서드를 굳이 작성하지 않아도 사용할수 있도록 처리
//@RequiredArgsConstructor : 해당 속성을 필요로 하는 생성자가 롬복을 통해 자동 생성 -> 의존성 주입에도 사용한다.
// 							생성자의 초기화까지 해준다.

@Getter
@Setter
//@RequiredArgsConstructor
public class LombokTest {
	
	private String hello;
	private int lombokInt;                    

	public static void main(String[] args) {
		LombokTest lb = new LombokTest();
		lb.setHello("hello");
		lb.getHello();
	}

}
