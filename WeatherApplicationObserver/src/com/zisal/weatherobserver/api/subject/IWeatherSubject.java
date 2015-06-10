package com.zisal.weatherobserver.api.subject;

import com.zisal.weatherobserver.api.observer.IWeatherObserver;

public interface IWeatherSubject {

	public void registerObserver( IWeatherObserver weatherObserver );
	
	public void removeObserver( IWeatherObserver weatherObserver );
	
	public void notifyObserver();
	
}
