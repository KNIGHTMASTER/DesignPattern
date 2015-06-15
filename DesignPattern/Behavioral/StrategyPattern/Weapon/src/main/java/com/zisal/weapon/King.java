package com.zisal.weapon;

import com.zisal.weapon.impl.SwordBehavior;
import com.zisal.weapon.top.Character;

public class King extends Character{

	public King() {
		setWeaponBehavior( new SwordBehavior() );
	}
	
	@Override
	public void display() {
		System.out.println( "I am a KING" );
	}

}
