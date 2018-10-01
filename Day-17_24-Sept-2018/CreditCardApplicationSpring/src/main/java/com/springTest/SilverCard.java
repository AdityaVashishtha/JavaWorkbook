package com.springTest;

public class SilverCard extends CreditCard {
	private static final int REWARD_RATE = 2;
	
	@Override
	public int calculateReward(int amount) {
		return ((amount*REWARD_RATE)/1000);
	}
}
