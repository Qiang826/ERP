package com.qiang.erp.common;

public enum ResponseCode {
	
	SUCCESS(0,"success"),
	ERROR(1,"error"),
	NEED_LOGIN(2,"NEED_LOGIN");
	
	private int code;
	private String desc;



	public int getCode() {
		return code;
	}

	

	public String getDesc() {
		return desc;
	}

	

	private ResponseCode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
