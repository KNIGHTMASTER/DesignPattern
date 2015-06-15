package com.zisal.weapon.impl;

import com.zisal.weapon.api.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println( "Implements Shoot Arrow with BOW" );
	}

}
