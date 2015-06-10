package com.zisal.magazinepublisher.api;

public interface IMagazinePublisher {

	public void registerSubscriber( IMagazineSubscriber subscriber );
	
	public void removeSubscriber( IMagazineSubscriber subscriber );
	
	public void notifySubscriber();
}
