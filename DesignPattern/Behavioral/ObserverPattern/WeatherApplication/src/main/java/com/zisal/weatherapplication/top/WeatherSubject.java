package com.zisal.weatherapplication.top;

import com.zisal.weatherapplication.api.observer.IWeatherObserver;
import com.zisal.weatherapplication.api.subject.IWeatherSubject;

import java.util.ArrayList;
import java.util.List;


public class WeatherSubject implements IWeatherSubject {

	List<IWeatherObserver> weatherObservers = new ArrayList<IWeatherObserver>();
	private int state;
	private int temprature;
	private int humidity;
	private int pressure;
	
	@Override
	public void registerObserver( IWeatherObserver weatherObserver ){
		weatherObservers.add( weatherObserver );
	}

	@Override
	public void removeObserver( IWeatherObserver weatherObserver ){
		int i = weatherObservers.indexOf( weatherObserver );
		if(i >= 0){
			weatherObservers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for( IWeatherObserver observer: weatherObservers ){
			observer.update( temprature, humidity, pressure );
		}
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(int temperature, int humidity, int pressure){
		this.temprature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public int getTemprature() {
		return temprature;
	}

	public void setTemprature(int temprature) {
		this.temprature = temprature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;		
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		if( state == 1 ) notifyObserver();
	}
}
