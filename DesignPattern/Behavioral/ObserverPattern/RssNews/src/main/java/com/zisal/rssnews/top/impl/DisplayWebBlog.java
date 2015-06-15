package com.zisal.rssnews.top.impl;

import com.zisal.rssnews.api.display.IDisplayFormatter;
import com.zisal.rssnews.api.observer.IRSSSubscriber;
import com.zisal.rssnews.top.RSSData;
import java.util.Date;


public class DisplayWebBlog implements IRSSSubscriber, IDisplayFormatter{

	private RSSData rssData;
	private Date publishedDate;
	private String title;
	private String content;
	
	public DisplayWebBlog(RSSData rssData) {
		this.rssData = rssData;
		rssData.registerSubscriber(this);		
	}
	
	@Override
	public void display() {
		System.out.println( "RSS NEW WEBBLOG FORMAT => DATE:"+publishedDate+" TITLE:"+title+" CONTENT:"+content );
	}

	@Override
	public void update(Date publishedDate, String title, String content) {
		this.publishedDate = publishedDate;
		this.title = title;
		this.content = content;
		display();
	}

}
