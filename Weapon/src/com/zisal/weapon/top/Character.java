package com.zisal.weapon.top;

import com.zisal.weapon.api.WeaponBehavior;

public abstract class Character {

	protected WeaponBehavior weaponBehavior;
	
	public abstract void display();

	public WeaponBehavior getWeaponBehavior() {
		return weaponBehavior;
	}

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
	public void showWeapon(){
		weaponBehavior.useWeapon();
	}
}
