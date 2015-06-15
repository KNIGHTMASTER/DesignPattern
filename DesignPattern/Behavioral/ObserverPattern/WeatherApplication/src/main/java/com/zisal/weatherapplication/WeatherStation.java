package com.zisal.weatherapplication;


import com.zisal.weatherapplication.top.WeatherSubject;
import com.zisal.weatherapplication.top.impl.CurrentConditionDisplay;
import com.zisal.weatherapplication.top.impl.ForecastDisplay;
import com.zisal.weatherapplication.top.impl.StatisticDisplay;

public class WeatherStation {

	public static void main( String [] args ){
		WeatherSubject weatherData = new WeatherSubject();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
		
		weatherData.setMeasurements( 0, 40, 50);
		System.out.println("===============================");
		weatherData.setMeasurements( 60, 70, 80);
		System.out.println("===============================");
		weatherData.setMeasurements( 90, 100, 200);
		
	}
}
