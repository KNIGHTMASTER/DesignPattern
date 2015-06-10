package com.zisal.magazinepublisher.subscriber;

import com.zisal.magazinepublisher.MagazinePublisher;
import com.zisal.magazinepublisher.api.IMagazineSubscriber;

public class PersonSubscriber implements IMagazineSubscriber{

	private MagazinePublisher magazinePublisher;
	private String content;
	
	public PersonSubscriber(MagazinePublisher magazinePublisher) {
		this.magazinePublisher = magazinePublisher;
		magazinePublisher.registerSubscriber( this );
	}
	
	@Override
	public void update(String content) {
		this.content = content;
		System.out.println("Content Person = "+content);
	}

}
