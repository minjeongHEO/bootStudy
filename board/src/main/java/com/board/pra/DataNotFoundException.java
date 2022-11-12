package com.board.pra;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//예외 직접 생성 후 RuntimeException을 상속받아야 한다.

//@ResponseStatus : 데이터 찾을 수 없을 때 404에러 띄워주기
@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="entity not found")
public class DataNotFoundException extends RuntimeException {
	
	public DataNotFoundException(String message) {
		super(message);
	}
}
