package com.zisal.weapon;

import com.zisal.weapon.impl.BowAndArrowBehavior;
import com.zisal.weapon.top.Character;

public class Knight extends Character{

	public Knight() {
		setWeaponBehavior( new BowAndArrowBehavior() );
	}
	
	@Override
	public void display() {
		System.out.println( "I am a Knight" );
	}

}
