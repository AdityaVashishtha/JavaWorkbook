package com.springTest;

public class GoldCard extends CreditCard {
	private static final int REWARD_RATE = 5;
	
	@Override
	public int calculateReward(int amount) {
		return ((amount*REWARD_RATE)/1000);
	}	
	
}
