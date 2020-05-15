package com.company.weixin.entity;

import java.io.Serializable;

public class ResultVo implements Serializable{
	/**
	 * Description: 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private String msg;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String message) {
		this.msg = message;
	}
	
	
}
