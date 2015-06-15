package com.zisal.weatherapplication.top.impl;


import com.zisal.weatherapplication.api.display.IDisplayElement;
import com.zisal.weatherapplication.api.observer.IWeatherObserver;
import com.zisal.weatherapplication.top.WeatherSubject;

public class CurrentConditionDisplay implements IWeatherObserver, IDisplayElement {

	private int temprature;
	private int humidity;
	private int pressure;
	private WeatherSubject weatherData;
	
	public CurrentConditionDisplay(WeatherSubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current Condition : temperature "+temprature+" humidity :"+humidity+" pressure :"+pressure);
	}

	@Override
	public void update(int temprature, int humidity, int pressure) {
		this.pressure = pressure;
		this.temprature = temprature;
		this.humidity = humidity;
		display();
	}

}
