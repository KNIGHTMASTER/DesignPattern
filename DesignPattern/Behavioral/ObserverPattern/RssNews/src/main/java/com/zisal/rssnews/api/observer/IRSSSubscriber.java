package com.zisal.rssnews.api.observer;

import java.util.Date;

public interface IRSSSubscriber {

	public void update(Date publishedDate, String title, String content);
	
}
