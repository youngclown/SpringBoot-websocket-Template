package com.handcoding.websocket.vo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginVO {
	
	private String id;
	private String domain;
	private String token;
	private String name;

}
