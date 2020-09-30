
public class PirateShip extends SpaceShip implements CanMove { // Subclass of Space Ship

	int booty; // Booty it has 


	public PirateShip(String name_ship, int year, int row, int column, String name2, int money) { // Constructor for Pirateship
		super(name_ship, year, row, column, name2);
		 
		booty = money;
	}

	public void moveShip(int new_row, int new_column) { //Method to move the ship on the map
		
		x = new_row;
		y = new_column;
		
		
	}
	
	public String toString() { //String representation of PirateShip
		
		return name + " is a Pirate Ship and is located at " + "(" + x + "," + y + "). It has " + booty + " booty on it.";
		
	}

}
