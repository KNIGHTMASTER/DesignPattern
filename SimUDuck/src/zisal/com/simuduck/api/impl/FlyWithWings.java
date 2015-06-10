package zisal.com.simuduck.api.impl;

import zisal.com.simuduck.api.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println( "The duck can fly" );
	}

}
