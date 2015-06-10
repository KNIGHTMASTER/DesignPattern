package com.zisal.smsbanking.api;

public interface ISMSPublisher {

	public void registerSubscriber( ISMSSubscriber subscriber );
	
	public void removeSubscriber( ISMSSubscriber subscriber );
	
	public void notifySubscriber();
	
}
