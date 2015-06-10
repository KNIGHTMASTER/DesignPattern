package zisal.com.simuduck.api.impl;

import zisal.com.simuduck.api.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println( "The duck can't fly" );
	}

}
