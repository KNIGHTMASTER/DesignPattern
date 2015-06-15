package com.zisal.weatherapplication.api.subject;

import com.zisal.weatherapplication.api.observer.IWeatherObserver;

public interface IWeatherSubject {

	public void registerObserver(IWeatherObserver weatherObserver);
	
	public void removeObserver(IWeatherObserver weatherObserver);
	
	public void notifyObserver();
	
}
