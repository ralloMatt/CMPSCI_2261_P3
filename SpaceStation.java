
public class SpaceStation extends SpaceShip { //Subclass of SPaceSHip

	int passengers; // Amount of people on the ship
	int booty; // Amount of booty it has
	int cargo; // Amount of Cargo it has 
	
	public SpaceStation(String name_ship, int year, int row, int column, String name2, int people, int money, int supply) { // Constructor for Space Station
		super(name_ship, year, row, column, name2);
		
		passengers = people;
		booty = money;
		cargo = supply;
		
	} 
	

	public String toString() { //String representation of Space Station
		
		return name + " is a Space Station and is located at " + "(" + x + "," + y + "). It has " + booty + " booty on it and " + cargo + " current cargo on it.";
	}

	
}
