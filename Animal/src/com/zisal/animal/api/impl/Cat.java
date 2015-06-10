package com.zisal.animal.api.impl;

import com.zisal.animal.top.Animal;
import com.zisal.animal.top.impl.Meow;

public class Cat extends Animal{

	public Cat() {
		soundBehavior = new Meow();	
	}

	@Override
	public void display() {
		System.out.println( "I am a Cat ");		
	}
}
