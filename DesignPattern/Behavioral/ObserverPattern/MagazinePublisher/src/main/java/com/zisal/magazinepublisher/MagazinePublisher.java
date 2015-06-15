package com.zisal.magazinepublisher;

import java.util.ArrayList;
import java.util.List;

import com.zisal.magazinepublisher.api.IMagazinePublisher;
import com.zisal.magazinepublisher.api.IMagazineSubscriber;

public class MagazinePublisher implements IMagazinePublisher{

	private List<IMagazineSubscriber> subscribers = new ArrayList<IMagazineSubscriber>();
	private String content;
	
	@Override
	public void registerSubscriber(IMagazineSubscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(IMagazineSubscriber subscriber) {
		int i = subscribers.indexOf(subscriber);
		if( i != 0 ){
			subscribers.remove(i);
		}
	}

	@Override
	public void notifySubscriber() {
		for( IMagazineSubscriber subscriber: subscribers ){
			subscriber.update( content );
		}
	}

	public void setContent( String content ){
		this.content = content;
		notifySubscriber();
	}
	
}
