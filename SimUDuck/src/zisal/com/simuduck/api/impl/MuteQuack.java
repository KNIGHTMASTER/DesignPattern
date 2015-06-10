package zisal.com.simuduck.api.impl;

import zisal.com.simuduck.api.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println( "The duck is mute" );
	}

}
