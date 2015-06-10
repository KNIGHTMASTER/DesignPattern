package com.zisal.rss;

import java.util.Date;

import com.zisal.rss.top.RSSData;
import com.zisal.rss.top.impl.DisplaySMS;
import com.zisal.rss.top.impl.DisplayWebBlog;

public class RSSPublisher {

	public static void main( String [] args){
		RSSData rssData = new RSSData();
		DisplaySMS displaySMS = new DisplaySMS(rssData);
		DisplayWebBlog displayWebBlog = new DisplayWebBlog(rssData);
		rssData.publishNewMessage( new Date(), "Message1", "Welcome");
		rssData.publishNewMessage( new Date(), "Message2", "To");
		rssData.publishNewMessage( new Date(), "Message3", "RSS News Feed");
	}
}
