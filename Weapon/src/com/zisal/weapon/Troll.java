package com.zisal.weapon;

import com.zisal.weapon.impl.AxeBehavior;
import com.zisal.weapon.top.Character;

public class Troll extends Character{

	public Troll() {
		setWeaponBehavior( new AxeBehavior() );
	}
	
	@Override
	public void display() {
		System.out.println( "I am a troll" );
	}
		

}
