package pokeSimulator;

import javax.swing.*;

public class Gyarados extends Pokemon{
	
	public Gyarados() {
		name = "Gyarados";
		
		attacks[0] = "Hydro Pump";
		attacks[1] = "Surf";
		attacks[2] = "Dragon Rage";
		attacks[3] = "Waterfall";
		
		damage[0] = 120;
		damage[1] = 90;
		damage[2] = 80;
		damage[3] = 80;
		
		hp = 250;
		
		//set Sprite Image
		
		speed = 200;
		frontSprite = new ImageIcon("pokeSimulator/gyaradosF.png");
		backSprite = new ImageIcon("pokeSimulator/gyaradosB.png");
	}

}
