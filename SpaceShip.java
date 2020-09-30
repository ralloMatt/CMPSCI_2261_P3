
abstract public class SpaceShip { //Super class Space Ship
	
	String name; // Name of Ship
	int date; // Year Ship was built
	int x; // row that the ship is located at
	int y; // column that the ship is located at
	String world_name; // Name as it appears on the world map
	
	public SpaceShip(String name_ship, int year, int row, int column, String name2){ // COnstructor for Space ship
		name = name_ship;
		date = year;
		x = row;
		y = column;
		world_name = name2;
		
	}
	
	public String toString() { // String representation of Space Ship
		
		return "The ship is named " + name + ". The year was " + date + " when built.";
		
	}

}
