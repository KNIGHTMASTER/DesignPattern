package com.zisal.animal.top;

import com.zisal.animal.api.SoundBehavior;

public abstract class Animal {

	public SoundBehavior soundBehavior;
	
	public abstract void display();
	
	public void move(){
		System.out.println( "Animal can move" );
	}
	
	public void makeSound(){
		soundBehavior.makeSound();
	}
	
}
