package com.api.models.request;

public class TranscationsRequest {

	private String accountNumber;
	private int amount;
	private String description;
	public TranscationsRequest(String accountNumber, int amount, String description) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.description = description;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TranscationsRequest [accountNumber=" + accountNumber + ", amount=" + amount + ", description="
				+ description + ", getAccountNumber()=" + getAccountNumber() + ", getAmount()=" + getAmount()
				+ ", getDescription()=" + getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
