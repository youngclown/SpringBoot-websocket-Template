package com.handcoding.websocket.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OutChatMessageVO {
	
	private String id;
	private String name;
	private String domain;
	private String content;
}
