import java.util.ArrayList; // So I can use ArrayList
import java.util.Scanner; // So I can use Scanner

public class Runner { // Main class to run the program
	
	
	public static void main(String[] args){
		
		ArrayList<SpaceShip> Ships = new ArrayList<SpaceShip>(); // Making an dynamic array of the object SpaceShip
		
		Scanner input = new Scanner(System.in); // Making the scanner
		int num_ships; // number of ships
		
		
		System.out.println("How many Space ships do you want to work with (1 - 9)? "); // Getting input for how many ships to play with
		num_ships = input.nextInt();
		
		while(num_ships < 1 || num_ships > 9){ // Making sure input is correct
			System.out.println("Incorrect number of space ships. Please pick number 1 - 9.");
			num_ships = input.nextInt();
		}
		
		
		int count = 0; // Counter used for while loop
		
		while(count != num_ships) { // Loop to fill ArrayList Ships with Space Ships
			System.out.println(""); // To look nice
			System.out.println("What type of ship should ship number " + (count + 1) + " be? "); //Determing what each type of ship should be
			System.out.println("Press 1 for a Cargo Ship.");
			System.out.println("Press 2 for a Pirate Ship.");
			System.out.println("Press 3 for a Space Station.");
			
			int type = input.nextInt();
			input.nextLine();
			
			while (type < 1 || type > 3) { // Making sure input is correct
				System.out.println("Invalid Choice! Please Try Again!");
				type = input.nextInt();
			}
			
			String ship_name = ""; //Initializing values for the ships
			int date = 0;
			int row = -1;
			int column = -1;
			int supply = -1;
			int booty = -1;
			int people = -1;
			String world_name = "";
			
			if(type == 1) { // If user chose Cargo SHip
				
				System.out.println("You chose a Cargo Ship!");
				int x = 0; // used for do while loop
				
				do { // Getting input for data for a cargo ship
					try {
						System.out.println("What is the ship's name?");
						ship_name = input.nextLine();
						System.out.println("What year was it built?");
						date = input.nextInt();
						
						System.out.println("What is the X coordinate that the ship is located at? (0-9)");
						row = input.nextInt();
						while (row < 0 || row > 9) { // Making sure input is correct
							System.out.println("Invalid Number! Please pick numbers 0 - 9!");
							row = input.nextInt();
						}
						
						System.out.println("What is the Y coordinate that the ship is located at? (0-9)");
						column = input.nextInt();
						while (column < 0 || column > 9) { // Making sure input is correct
							System.out.println("Invalid Number! Please pick numbers 0 - 9!");
							column = input.nextInt();
						}
						
						System.out.println("How much cargo does the ship have?");
						supply = input.nextInt();
						x = 1; // so when all correct information is collected the loop ends
					}
					catch(Exception e){ // If there is any invalid input enter information all over again
						System.out.println("Invalid input! Please enter the information again!");
						input.nextLine();
					}
				} while(x == 0);
				
				world_name = "|C" + count + "|"; // The display that it would be in the world
			
				CargoShip New_Ship = new CargoShip(ship_name, date, row, column, world_name, supply); // making a new ship
				
				Ships.add(count, New_Ship); // adding the new ship to the ArrayList
				
				System.out.println(ship_name + " has successfully been added to your fleet!");
			}
			
			if(type == 2) { // If user chose Pirate SHip
				
				System.out.println("You chose a Pirate Ship!");
				int y = 0; // used for do while loop
				
				do{
					try { // getting input and making sure it's all correct
				
						System.out.println("What is the ship's name?");
						ship_name = input.nextLine();
						System.out.println("What year was it built?");
						date = input.nextInt();
						
						System.out.println("What is the X coordinate that the ship is located at? (0-9)");
						row = input.nextInt();
						while (row < 0 || row > 9) {
							System.out.println("Invalid Number! Please pick numbers 0 - 9!");
							row = input.nextInt();
						}
						
						System.out.println("What is the Y coordinate that the ship is located at? (0-9)");
						column = input.nextInt();
						while (column < 0 || column > 9) {
							System.out.println("Invalid Number! Please pick numbers 0 - 9!");
							column = input.nextInt();
						}
						
						System.out.println("How much booty does the ship have?");
						booty = input.nextInt();
						y = 1;
					}
					catch(Exception e){
						System.out.println("Invalid input! Please enter the information again!");
						input.nextLine();
					}
					
				}while ( y == 0);
				
				world_name = "|P" + count + "|"; // The display that it would be in the world
			
				PirateShip New_Ship = new PirateShip(ship_name, date, row, column, world_name, booty); // Making a new ship
				
				Ships.add(count, New_Ship); // adding new ship to ArrayList
				
				System.out.println(ship_name + " has successfully been added to your fleet!");
				
			}
			
			if(type == 3) { // If user chose Space Statioin
				
				System.out.println("You chose a Space Station!");
				int z = 0;
				
				do {
					try { // getting input and making sure it's all correct
						System.out.println("What is the ship's name?");
						ship_name = input.nextLine();
						System.out.println("What year was it built?");
						date = input.nextInt();

						System.out.println("What is the X coordinate that the ship is located at? (0-9)");
						row = input.nextInt();
						while (row < 0 || row > 9) {
							System.out.println("Invalid Number! Please pick numbers 0 - 9!");
							row = input.nextInt();
						}
						
						System.out.println("What is the Y coordinate that the ship is located at? (0-9)");
						column = input.nextInt();
						while (column < 0 || column > 9) {
							System.out.println("Invalid Number! Please pick numbers 0 - 9!");
							column = input.nextInt();
						}
						
						System.out.println("How many people are on the Space Station?");
						people = input.nextInt();
						System.out.println("How much booty does the ship have?");
						booty = input.nextInt();
						System.out.println("How much cargo does the ship have?");
						supply = input.nextInt();
						z = 1;
					}
					catch(Exception e){
						System.out.println("Invalid input! Please enter the information again!");
						input.nextLine();
					}
				
				}while(z == 0);
				
				world_name = "|S" + count + "|"; // The display that it would be in the world
				
				SpaceStation New_Ship = new SpaceStation(ship_name, date, row, column, world_name, people, booty, supply); // making new ship 
				
				Ships.add(count, New_Ship); // adding new ship to ArrayList
				
				System.out.println(ship_name + " has successfully been added to your fleet!");
				System.out.println("");
			}

			
			count++; // COunt is used so I know when I reach the amount of ships user wanted and then I can add each ship
		}
		
		System.out.println("\n\n"); // Cometic reasons
		
		int quit = 1; // USed to see if user wants to end the program
		while(quit == 1){
			
			display_galaxy(Ships); // Displays the world 
			
			System.out.println("\n");
			
			for(int i = 0; i < Ships.size(); i++)
				System.out.println(Ships.get(i)); // Printing out information of each ship
			
			System.out.println("\nDo you want to change the status of a ship?"); // If they want to change a ship status
			System.out.println("Press 1 for Yes. Press 0 for No.");
			int yes_or_no = input.nextInt();
			
			if(yes_or_no == 1) { // If the user changed the status of the ship
				
				System.out.println("What would you like to do?");
				System.out.println("Press 1 if you would like to change the type of a ship.");
				System.out.println("Press 2 if you would like to move a ship.");
				int status = input.nextInt(); //Getting input so I know what the user wants to do
				String word = "";
				input.nextLine();
				
				if(status == 1){ // Changing the type of ship!
					System.out.println("Which ship do you want to change?");
				
					int index_of_ship = -1; // initializing the index of ship and also used to know what ship the user wants
					
					while(index_of_ship == -1){ // while used to loop until user gives correct name of t he ship they want to change
						
						System.out.println("Please enter the name of the ship as it appears on the screen.");
						word = input.nextLine(); // Scanning word
						
						for(int i = 0; i < Ships.size(); i++) { //Scanning through arrayList to see if name is in there
							
							if( Ships.get(i).name.equals(word)) { //if the word is located in the ArrayList get the index number 
								index_of_ship = i;
							}
							
						}
						
						if(index_of_ship == -1) { // If i can't find the ship tell the user and get input again
							System.out.println(word + " was not found in the fleet.");
							System.out.println("Please enter the right information!\n\n");
						}
						
					}
					System.out.println("What type of ship do you want " + word + " to be?"); // Asking user what type of ship they want
					System.out.println("Press 1 for a Cargo Ship.");
					System.out.println("Press 2 for a Pirate Ship.");
					System.out.println("Press 3 for a Space Station.");
					
					int type = input.nextInt();
					input.nextLine();
					
					while (type < 1 || type > 3) { // Makign sure choice is valid
						System.out.println("Invalid Choice! Please Try Again!");
						type = input.nextInt();
					}
					// GETING INPUT FOR NEW TYPE OF SHIP *************************************************************************************
					
					String ship_name = ""; // Initializin values
					int date = 0;
					int row = -1;
					int column = -1;
					int supply = -1;
					int booty = -1;
					int people = -1;
					String world_name = "";
					
					if(type == 1) { // If user chose Cargo SHip
						
						System.out.println("You chose a Cargo Ship to be the new ship!");
						int x = 0;
						
						do {
							
							try { //getting new information i need and keeping old I don't need
								
								ship_name = word;
								date = Ships.get(index_of_ship).date;
								row = Ships.get(index_of_ship).x;
								column = Ships.get(index_of_ship).y;
								System.out.println("How much cargo does the ship have?");
								supply = input.nextInt();
								x = 1;
							}
							catch(Exception e){
								System.out.println("Invalid input! Please enter the information again!");
								input.nextLine();
							}
						} while(x == 0);
						
						world_name = "|C" + index_of_ship + "|"; // The display that it would be in the world
					
						CargoShip New_Ship = new CargoShip(ship_name, date, row, column, world_name, supply); // making a new ship
						
						Ships.set(index_of_ship, New_Ship); // setting old ship as the new one 
						
						System.out.println(word + " has successfully been changed to a new Cargo Ship!");
					}
					
					if(type == 2) { // If user chose Pirate SHip
						
						System.out.println("You chose a Pirate Ship to be the new ship!");
						int y = 0;
						
						do{
							try { //getting new information i need and keeping old I don't need
						
								ship_name = word;
								date = Ships.get(index_of_ship).date;
								row = Ships.get(index_of_ship).x;
								column = Ships.get(index_of_ship).y;
								System.out.println("How much booty does the ship have?");
								booty = input.nextInt();
								y = 1;
							}
							catch(Exception e){
								System.out.println("Invalid input! Please enter the information again!");
								input.nextLine();
							}
							
						}while ( y == 0);
						
						world_name = "|P" + index_of_ship + "|"; // The display that it would be in the world
					
						PirateShip New_Ship = new PirateShip(ship_name, date, row, column, world_name, booty); // Making new ship
						
						Ships.set(index_of_ship, New_Ship); // setting old ship as the new one 
						
						System.out.println(word + " has successfully been changed to a new Pirate SHip!");
						
					}
					
					if(type == 3) { // If user chose Space Statioin
						
						System.out.println("You chose a Space Station to be the new ship!");
						int z = 0;
						
						do {
							try { //getting new information i need and keeping old I don't need
								ship_name = word;
								date = Ships.get(index_of_ship).date;
								row = Ships.get(index_of_ship).x;
								column = Ships.get(index_of_ship).y;
								System.out.println("How many people are on the Space Station?");
								people = input.nextInt();
								System.out.println("How much booty does the ship have?");
								booty = input.nextInt();
								System.out.println("How much cargo does the ship have?");
								supply = input.nextInt();
								z = 1;
							}
							catch(Exception e){
								System.out.println("Invalid input! Please enter the information again!");
								input.nextLine();
							}
						
						}while(z == 0);
						
						world_name = "|S" + index_of_ship + "|"; // The display that it would be in the world
						
						SpaceStation New_Ship = new SpaceStation(ship_name, date, row, column, world_name, people, booty, supply); // making new ship
						Ships.set(index_of_ship, New_Ship); // setting old ship as the new one 
						
						
						System.out.println(ship_name + " has successfully been changed to a new Space Station!");
						System.out.println("");
					}
		
					
					// FINISHED INPUT FOR NEW TYPE OF SHIP ***************************************************************************************
					
				
				}
				
				if (status == 2) { // Moving the ship position
					
					System.out.println("So you want to move a ship?");
					System.out.println("Which ship did you want to move?");
					System.out.println("Please enter the ship's name as it appears on screen.");
					String move_name = input.nextLine(); // getting ship name so i can  move
					int index = -1; // used to find index of ship user wants
					
					while(index == -1){ // while used to loop until user gives correct name of the ship they want to change
						for(int i = 0; i < Ships.size(); i++) { //Scanning through arrayList to see if name is in there
							
							if( Ships.get(i).name.equals(move_name)) { //if the word is located in the ArrayList get the index number 
								index = i;
							}
					
						}
						
						if(index == -1) { // If i can't find the ship tell the user and get input again
							System.out.println(move_name + " was not found in the fleet.");
							System.out.println("Please enter the right information!\n\n");
							move_name = input.nextLine();
						}
					} // ends while
					
					
					if(Ships.get(index).world_name.indexOf('S') > 0){ // Seeing if ship was a space station because space stations can't be moved!
						System.out.println("You can't change the position of a Space Station!!!");
						
					}
					
					else { // if it's not a space station then it must be a cargo ship or pirate ship
					
						
						
						System.out.println("Where would you like " + move_name + " to move to?");
						int new_row = -1;
						int new_column = -1;
						
						//Getting input for new positions
						System.out.println("What is the X coordinate that " + move_name + " should be at? (0-9)");
						new_row = input.nextInt();
						while (new_row < 0 || new_row > 9) {
							System.out.println("Invalid Number! Please pick numbers 0 - 9!");
							new_row = input.nextInt();
						}
						
						System.out.println("What is the Y coordinate that " + move_name + " should be at? (0-9)");
						new_column = input.nextInt();
						while (new_column < 0 || new_column > 9) {
							System.out.println("Invalid Number! Please pick numbers 0 - 9!");
							new_column = input.nextInt();
						}
						
						
					
						
						if(Ships.get(index).world_name.indexOf('C') > 0){ //Seeing if it's a cargo ship
							CargoShip editShip = (CargoShip)Ships.get(index); // Using typecasting so I can call method moveShip
	                        editShip.moveShip(new_row, new_column);
						}
						if(Ships.get(index).world_name.indexOf('P') > 0){ // Seeing if it's a pirate ship
							PirateShip editShip = (PirateShip)Ships.get(index); // Using typecasting so I can call method moveShip
	                        editShip.moveShip(new_row, new_column);
						}
						
						System.out.println(move_name + " has succesfully moved!"); // Telling user that ship has been moved
				
	
					} // ends inner else
				
					
					
				} // ends if
				
				System.out.println("\n\n~~~~~~Updated Statuses of SHips present!~~~~~~~"); // Showing user what they updated
				display_galaxy(Ships); // displaying world
				
				System.out.println("\n");
				for(int i = 0; i < Ships.size(); i++)
					System.out.println(Ships.get(i)); // Printing out information of each ship
				
				
			}
			if(yes_or_no == 0) {
				System.out.println("Really you do not want to chage the status?!"); // If they don't want to change the status
			}
			
			System.out.println("\nDo you want to keep playing?"); // asking user if he or she wants to keep playing
			System.out.println("Enter 1 for Yes. Enter 0 for No.");
			quit = input.nextInt(); // If user  enters zero while loop ends 
			
		}
				
		

		
		System.out.println("Program is Done! Thanks for Playing!"); // letting user know program has ended
		input.close();
		
		
		
	}
	
	public static void display_galaxy(ArrayList<SpaceShip> Ships) { // method to display the world
		
		String[][] world = new String[10][10]; // making a 2D array 
		
		for(int i = 0; i< 10; i++) {
			
			for( int j = 0; j < 10; j++){
				world[i][j] = "|**|"; // setting each value to the |**| (empty space
				
			}
		}
		
		int row;
		int column;
		
		for(int i = 0; i < Ships.size(); i++) { // Looping though the arrayList to get the coordinates of each ship
			SpaceShip current_ship = Ships.get(i);
			row = current_ship.x;
			column = current_ship.y;
			world[row][column] = current_ship.world_name; // Setting those coordinates to the world name of each ship
		}
		
		
		for(int i = 0; i< 10; i++) {
			
			for( int j = 0; j < 10; j++){
				System.out.print(world[i][j] + " "); // Printing out the world
				
			}
			System.out.println("");
		}
		
		
		
	}
	
	

}
