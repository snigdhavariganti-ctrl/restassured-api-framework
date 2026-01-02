package com.api.models.request;

public class TransactionTransferRequest {
	
	private String fromAccount;
	private String toAccount;
	private int amount;
	private String description;
	public TransactionTransferRequest(String fromAccount, String toAccount, int amount, String description) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.description = description;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
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
		return "TransactionTransferRequest [fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", amount="
				+ amount + ", description=" + description + ", getFromAccount()=" + getFromAccount()
				+ ", getToAccount()=" + getToAccount() + ", getAmount()=" + getAmount() + ", getDescription()="
				+ getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	


}
