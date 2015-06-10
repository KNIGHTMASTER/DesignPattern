package com.zisal.smsbanking.api.impl;

import com.zisal.smsbanking.api.ISMSPublisher;
import com.zisal.smsbanking.api.ISMSSubscriber;

public class SMSSubscriber implements ISMSSubscriber{

	private ISMSPublisher publisher;
	
	public SMSSubscriber( ISMSPublisher publisher ) {
		this.publisher = publisher;
		publisher.registerSubscriber(this);
	}
	
	@Override
	public void update(String content) {
		System.out.println("Update Content from SMS Subscriber "+ content);		
	}

}
