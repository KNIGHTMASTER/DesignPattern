package com.zisal.rssnews.top;

import com.zisal.rssnews.api.observer.IRSSSubscriber;
import com.zisal.rssnews.api.subject.IRSSPublisher;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class RSSData implements IRSSPublisher{
	
	List<IRSSSubscriber> rssSubscribers = new ArrayList<IRSSSubscriber>();
	
	private Date publishedDate;
	private String title;
	private String content;
	
	@Override
	public void registerSubscriber(IRSSSubscriber irssSubscriber) {
		rssSubscribers.add(irssSubscriber);
	}

	@Override
	public void removeSubscriber(IRSSSubscriber irssSubscriber) {
		int index = rssSubscribers.indexOf(irssSubscriber);
		if(index >= 0){
			rssSubscribers.remove(index);
		}
	}

	@Override
	public void broadcastMessage() {
		for(IRSSSubscriber subscriber: rssSubscribers){
			subscriber.update(publishedDate, title, content);
		}
	}
	
	public void publishNewMessage(Date publishedDate, String title, String content){
		this.publishedDate = publishedDate;
		this.title = title;
		this.content = content;
		broadcastMessage();
	}

}
