package com.zisal.dogfactory;

public class MainApplication {

	public static void main( String [] args ){
		Dog dog = getCriteria("siberian");
		dog.bark();
	}
	
	public static Dog getCriteria( String criteria ){
		if( criteria.equals("poodle") ){
			return new Poodle();
		}else if( criteria.equals("rotweiller") ){
			return new Rotweiller();
		}else if( criteria.equals("siberian") ){
			return new SiberianHusky();
		}else{
			return null;
		}
	}
}
