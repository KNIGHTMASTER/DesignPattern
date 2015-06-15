package com.zisal.weapon;

import com.zisal.weapon.top.Character;

public class MainCharacter {

	public static void main( String [] args ){
		Character character = new King();
		character.display();
		character.showWeapon();
		
		character = new Queen();
		character.display();	
		
		character = new Knight();
		character.display();
		character.showWeapon();
		
		character = new Troll();
		character.display();
		character.showWeapon();
		
	}
}
