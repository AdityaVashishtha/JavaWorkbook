package com.springTest;

public class RewardCalculator {
	private CreditCard card;
		
	public RewardCalculator() {
		super();
	}

	public RewardCalculator(CreditCard card) {
		super();
		this.card = card;
	}

	public CreditCard getCard() {
		return card;
	}

	public void setCard(CreditCard card) {
		this.card = card;
	}
	
	public void calculate(int amount) {
		System.out.println(card.calculateReward(amount));
	}
}
