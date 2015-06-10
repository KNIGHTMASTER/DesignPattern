package com.zisal.magazinepublisher.subscriber;

import com.zisal.magazinepublisher.MagazinePublisher;
import com.zisal.magazinepublisher.api.IMagazineSubscriber;

public class CompanySubscriber implements IMagazineSubscriber{

	private MagazinePublisher magazinePublisher;
	private String content;
	
	public CompanySubscriber(MagazinePublisher magazinePublisher) {
		this.magazinePublisher = magazinePublisher;
		magazinePublisher.registerSubscriber(this);
	}
	
	@Override
	public void update(String content) {
		this.content = content;
		System.out.println("Company Subscriber = "+ content);
	}
}
