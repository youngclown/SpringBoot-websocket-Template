package com.handcoding.websocket.vo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InChatMessageVO {
	
	private String token;		// 사용자 정보를 가져올 토큰
	private String content;		// 메세지 내용
	private String type;		// 채팅 타입
	private String chatId;		// 채팅 고유 아이디

}
