package com.zisal.animal.top.impl;

import com.zisal.animal.api.SoundBehavior;


public class Meow implements SoundBehavior{

	@Override
	public void makeSound() {
		System.out.println( "Meow" );
	}

}
