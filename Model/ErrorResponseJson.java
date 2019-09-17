package com.apple.code.challenge.flagSelector.Model;

public class ErrorResponseJson {
	private long timestamp;
	private int status;
	private String error=null;
	private String message=null;

	
	public ErrorResponseJson() {
		// TODO Auto-generated constructor stub
	}


	public ErrorResponseJson(long timestamp, int status, String error, String message) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
	}


	public long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
