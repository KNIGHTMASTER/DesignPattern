package com.zisal.rssnews;

import com.zisal.rssnews.top.RSSData;
import com.zisal.rssnews.top.impl.DisplaySMS;
import com.zisal.rssnews.top.impl.DisplayWebBlog;
import java.util.Date;


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
