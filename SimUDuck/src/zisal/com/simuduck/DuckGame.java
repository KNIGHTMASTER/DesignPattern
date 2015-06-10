package zisal.com.simuduck;

import zisal.com.simuduck.top.DecoyDuck;
import zisal.com.simuduck.top.Duck;
import zisal.com.simuduck.top.MallardDuck;
import zisal.com.simuduck.top.RubberDuck;

public class DuckGame {

	public static void main( String [] args ){
		
		Duck duck = new MallardDuck();
		
		duck.display();
		duck.performFly();
		duck.performQuack();
		duck.swim();
		
		duck = new RubberDuck();
		duck.display();
		duck.performQuack();
		duck.swim();
		
		duck = new DecoyDuck();
		duck.display();
		duck.swim();
		
	}
	
}
