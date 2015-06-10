package com.zisal.animal.api.impl;

import com.zisal.animal.api.SoundBehavior;

public class Bark implements SoundBehavior{

	@Override
	public void makeSound() {
		System.out.println( "Ough- Ough" );
	}

}
