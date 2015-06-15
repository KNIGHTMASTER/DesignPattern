package com.zisal.rssnews.api.subject;

import com.zisal.rssnews.api.observer.IRSSSubscriber;


public interface IRSSPublisher {

	public void registerSubscriber(IRSSSubscriber irssSubscriber);
	
	public void removeSubscriber(IRSSSubscriber irssSubscriber);
	
	public void broadcastMessage();
}
