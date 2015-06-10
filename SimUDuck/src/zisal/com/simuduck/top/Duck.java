package zisal.com.simuduck.top;

import zisal.com.simuduck.api.FlyBehavior;
import zisal.com.simuduck.api.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public abstract void display();
	
	public void swim(){
		System.out.println( "The duck can swim" );
	}
		
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
}
