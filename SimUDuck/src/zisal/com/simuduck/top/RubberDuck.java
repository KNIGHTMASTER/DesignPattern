package zisal.com.simuduck.top;

import zisal.com.simuduck.api.impl.Quack;

public class RubberDuck extends Duck{

	public RubberDuck() {
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println( "Rubber Duck" );
	}
		

}
