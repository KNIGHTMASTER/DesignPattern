package zisal.com.simuduck.top;

import zisal.com.simuduck.api.impl.FlyNoWay;
import zisal.com.simuduck.api.impl.Quack;

public class RedHeadDuck extends Duck{

	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println( "Red Head Duck" );
	}

	
}
