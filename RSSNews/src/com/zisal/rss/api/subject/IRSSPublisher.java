package com.zisal.rss.api.subject;

import com.zisal.rss.api.observer.IRSSSubscriber;


public interface IRSSPublisher {

	public void registerSubscriber(IRSSSubscriber irssSubscriber);
	
	public void removeSubscriber(IRSSSubscriber irssSubscriber);
	
	public void broadcastMessage();
}
