package com.handcoding.websocket.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
@ToString
public class OutLoginVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String domain;
	private int timeout;
	private TimeUnit timeUnit;

}
