
public class CargoShip extends SpaceShip implements CanMove{ // Subclass of Spaceship
	
	int cargo; // Amount of Cargo Ship has
	
	
	public CargoShip(String name_ship, int year, int row, int column, String name2, int supply) { // Constructor of Cargo Ship
		super(name_ship, year, row, column, name2);
		cargo = supply;
	}



	public void moveShip(int new_row, int new_column) { // Method to move the ship
		x = new_row;
		y = new_column;
		
	}
	
	public String toString() { // String representation of CargoShip
		
		return name + " is a Cargo Ship and is located at " + "(" + x + "," + y + "). It has " + cargo + " current cargo on it.";
		
	}

}
