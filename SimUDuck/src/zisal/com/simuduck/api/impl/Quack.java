package zisal.com.simuduck.api.impl;

import zisal.com.simuduck.api.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println( "Duck quacking" );
	}

}
