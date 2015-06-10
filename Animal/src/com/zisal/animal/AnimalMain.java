package com.zisal.animal;

import com.zisal.animal.api.impl.Cat;
import com.zisal.animal.top.Animal;
import com.zisal.animal.top.impl.Dog;

public class AnimalMain {

	public static void main( String [] args ){
		Animal animal = new Dog();
		animal.display();
		animal.makeSound();
		
		animal = new Cat();
		animal.display();
		animal.makeSound();
	}
	
}
