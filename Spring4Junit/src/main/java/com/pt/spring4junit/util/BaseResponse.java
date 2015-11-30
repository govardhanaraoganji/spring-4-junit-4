package com.pt.spring4junit.util;
//***************************************************************************************************
//***************************************************************************************************
//      Project name                    	: Conduira
//      Class Name                          : BaseResponse
//      Author                              : PurpleTalk, Inc.
//***************************************************************************************************
//      Class Description: Defines the base response functionality.
//***************************************************************************************************
//***************************************************************************************************


import com.pt.spring4junit.PtSpring4Junit;

public class BaseResponse implements PtSpring4Junit {
	
	private String statusCode;
	private String statusMessage;

	public BaseResponse(String statusCode, String statusMessage) {
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}

	public BaseResponse() {
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	@Override
	public String toString() {
		return "BaseResponse [statusCode=" + statusCode + ", statusMessage="
				+ statusMessage + "]";
	}

}
