package com.zisal.rss.top.impl;

import java.util.Date;

import com.zisal.rss.api.display.IDisplayFormatter;
import com.zisal.rss.api.observer.IRSSSubscriber;
import com.zisal.rss.top.RSSData;

public class DisplaySMS implements IRSSSubscriber, IDisplayFormatter{

	private RSSData rssData;
	private Date publishedDate;
	private String title;
	private String content;
	
	public DisplaySMS(RSSData rssData) {
		this.rssData = rssData;
		rssData.registerSubscriber(this);		
	}
	
	@Override
	public void display() {
		System.out.println( "RSS NEW SMS FORMAT => DATE:"+publishedDate+" TITLE:"+title+" CONTENT:"+content );
	}

	@Override
	public void update(Date publishedDate, String title, String content) {
		this.publishedDate = publishedDate;
		this.title = title;
		this.content = content;
		display();
	}

}
