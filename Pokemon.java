package pokeSimulator;

import java.awt.*;

import javax.swing.*;

public abstract class Pokemon {

	int hp, speed;
	String name;
	String[] attacks = new String[4];
	int[] damage = new int[4];
	ImageIcon frontSprite, backSprite;
	
	public void attack(Pokemon mon, int damage) { 
		mon.hp -= damage;
	}

}
