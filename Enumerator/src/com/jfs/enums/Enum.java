package com.jfs.enums;

public enum Enum {
	SUCCESS(200), FAILED(404), BADREQUEST(400), INTERNALSERVERERROR();
	
	private int code;
	
	private Enum() {
		
	}
	
	private Enum(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
