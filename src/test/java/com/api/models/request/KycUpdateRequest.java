package com.api.models.request;

public class KycUpdateRequest {
	
    private String file;

	public KycUpdateRequest(String file) {
		super();
		this.file = file;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "KycUpdate [file=" + file + ", getFile()=" + getFile() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


}
