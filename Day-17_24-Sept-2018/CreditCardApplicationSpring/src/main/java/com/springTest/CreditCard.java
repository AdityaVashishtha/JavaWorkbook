package com.springTest;

public abstract class CreditCard {
	private String cardNo;
	private int limit;	
	private String expiryDate;
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public abstract int calculateReward(int amount);
		
	public void showCardInfo() { 
		System.out.println("YOUR CREDIT CARD DETAILS");
		System.out.println("CARD NO: \t\t\t"+this.cardNo);
		System.out.println("EXPIRY DATE: \t\t\t "+this.cardNo);
		System.out.println("LIMIT: \t\t\t "+this.limit);
	}
	
}
