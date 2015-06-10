package com.zisal.animal.top.impl;

import com.zisal.animal.api.impl.Bark;
import com.zisal.animal.top.Animal;

public class Dog extends Animal{

	public Dog() {
		soundBehavior = new Bark();
	}

	@Override
	public void display() {
		System.out.println( "I am a Dog" );
	}	

}
