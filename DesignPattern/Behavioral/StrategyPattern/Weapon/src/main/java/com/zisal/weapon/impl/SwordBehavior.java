package com.zisal.weapon.impl;

import com.zisal.weapon.api.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println( "Swing with a sword" );
	}

}
