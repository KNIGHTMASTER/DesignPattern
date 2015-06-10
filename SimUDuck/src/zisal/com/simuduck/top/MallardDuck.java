package zisal.com.simuduck.top;

import zisal.com.simuduck.api.impl.FlyWithWings;
import zisal.com.simuduck.api.impl.Quack;

public class MallardDuck extends Duck  {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println( "Mallard Duck" );
	}
	
}
