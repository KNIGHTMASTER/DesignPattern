package com.zisal.weatherapplication.top.impl;

import com.zisal.weatherapplication.api.display.IDisplayElement;
import com.zisal.weatherapplication.api.observer.IWeatherObserver;
import com.zisal.weatherapplication.top.WeatherSubject;

public class ForecastDisplay implements IWeatherObserver, IDisplayElement {

	private int temprature;
	private int humidity;
	private int pressure;
	private WeatherSubject weatherData;
	
	public ForecastDisplay(WeatherSubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(int temprature, int humidity, int pressure) {
		this.temprature = temprature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Forecast Display : temprature"+temprature+" humidity:"+humidity+" pressure :"+pressure);	
	}

}
