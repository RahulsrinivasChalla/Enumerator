package com.jfs.enums;

public class Test {
	public static void main(String[] args) {
		
		Enum success = Enum.SUCCESS;
		System.out.println("Received Status " + success.getCode());
		
		Enum internalServerError = Enum.INTERNALSERVERERROR;
		internalServerError.setCode(500);
		System.out.println("Recieved Internal Server Error " + internalServerError.getCode());
		
		Enum badRequest = Enum.BADREQUEST;
		System.out.println("Recieved BAD Request " + badRequest.getCode());
		
		Enum failed = Enum.FAILED;
		System.out.println("Request Failed " + failed.getCode());
		}
}
