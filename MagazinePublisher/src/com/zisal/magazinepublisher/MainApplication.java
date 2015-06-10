package com.zisal.magazinepublisher;

import com.zisal.magazinepublisher.subscriber.CompanySubscriber;
import com.zisal.magazinepublisher.subscriber.PersonSubscriber;

public class MainApplication {

	public static void main( String [] args ){
		MagazinePublisher magazinePublisher = new MagazinePublisher();
		PersonSubscriber personSubscriber = new PersonSubscriber(magazinePublisher);
		CompanySubscriber companySubscriber = new CompanySubscriber(magazinePublisher);
		
		magazinePublisher.setContent("Oke");
	}
}
