package com.ssi;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class InterestService {

	public void calculate(InterestModel model){
		model.setRate(10);
		if(model.getTime()<5){
			model.setRate(8);
		}
		int interest=(model.getAmount()*model.getTime()*model.getRate())/100;
		model.setInterest(interest);
		model.setNet(model.getAmount()+model.getInterest());
	}
	
}
