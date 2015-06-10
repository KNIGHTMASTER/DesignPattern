package com.zisal.smsbanking;

import com.zisal.smsbanking.api.impl.SMSPublisher;
import com.zisal.smsbanking.api.impl.SMSSubscriber;

public class MainApplication {

	
	public static void main( String [] args ){
		SMSPublisher publisher = new SMSPublisher();
		SMSSubscriber subscriber = new SMSSubscriber(publisher);
		
		publisher.setContent("Content 1");
	}
}
