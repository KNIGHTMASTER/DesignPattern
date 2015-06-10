package com.zisal.smsbanking.api.impl;

import java.util.ArrayList;
import java.util.List;

import com.zisal.smsbanking.api.ISMSPublisher;
import com.zisal.smsbanking.api.ISMSSubscriber;

public class SMSPublisher implements ISMSPublisher{

	List<ISMSSubscriber> subscribers = new ArrayList<ISMSSubscriber>();
	private String content;
	
	@Override
	public void registerSubscriber(ISMSSubscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(ISMSSubscriber subscriber) {
		int index = subscribers.indexOf(subscriber);
		if( index <= 0 ){
			subscribers.remove(index);
		}
	}

	@Override
	public void notifySubscriber() {
		for( ISMSSubscriber subscriber: subscribers ){
			subscriber.update(content);
		}
	}
	
	public void setContent( String content ){
		this.content = content;
		notifySubscriber();
	}

}
