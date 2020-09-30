# CMPSCI_2261_P3

Java project that moves ships.

PROGRAMMING ASSIGNMENT 3:
In this assignment you will be writing a program that uses polymorphism, an abstract class and
inheritance.
In this assignment you will have the following classes:
An abstract SpaceShip class with the following members:
The name of the ship (string)
Date the ship was built (int)
Attributes for its x and y coordinates (int), which represent the row/column it will be
displayed at in the world.
A constructor and appropriate accessors and mutators
toString that displays the ships name and the year it was built
An interface CanMove with the following:
A method moveShip that takes in two variables and changes the location of the ship (x,y
coordinates).
A CargoShip class that is a subclass of SpaceShip that implements CanMove. This should have
the following members:
Variable for amount of cargo(int)
A constructor and appropriate accessors and mutators
A toString that only displays the ships name, its location and the amount of current cargo
it has.
A PirateShip class that is a subclass of SpaceShip that implements CanMove. This should have
the following members:
A member variable for the amount of booty it has (int).
A constructor and appropriate accessors and mutators
A toString that displays only the ships name, its location and its booty.
A SpaceStation class that is a subclass of SpaceShip. This should have the following members:
A member variable for the number of passengers
A member variable for the cargo capacity in tons (int) and booty (int) it has
A toString that displays only the ships name, its location, cargo and booty
A class with your main method
In your main method, you will now maintain a list of these objects in an ArrayList.
Start by prompting the user for how many SpaceShips they would like to work with(1-9). Then
in a loop, start filling up your ArrayList with SpaceShips. For each SpaceShip, prompt for what
type of ship, then prompt for the data for the ship and then put it in the ArrayList.
Now your main body will go into a loop:
It should start each iteration by calling a method that takes in the ArrayList of SpaceShips and
displays it to the screen. Your “world” should be a grid of 10 rows and 10 columns, with
spaceships represented by starting with the first letter of the type of object it is (C for cargoship,
P for pirateship, S for spacestation) and the location it is in the ArrayList of ships. An example:
Our universe is the following:
|C1|**|**|**|S0|**|**|**|**|**|
|**|**|**|**|**|**|**|**|**|**|
|**|**|P2|**|**|**|**|**|**|**|
and so forth for 7 more rows.
When that is done, call a method that sequentially calls all the toStrings of each of the ships in
ArrayList, one per line.
Once the board is displayed and all the ship data is displayed, you should prompt and ask them if
they want to change the status of a ship.
They should have two options once they have selected a ship to change:
1) Change the ship type: In that case, change that ship by creating a new ship and putting it in it’s
place.
2) Moving the ship, in which case you use the moveShip method from CanMove.
Also, make sure that any inputs you take in are protected by exception handling. You do not need
to check for each entry, but instead can check for overall correctness (for example, put both the
date and name reads both in a try/catch block). If an error happens, reprompt the user for the
information until it is of the correct type.
For submission, please archive together your java files and submit them together.
If you are using windows, winzip or 7zip would work.
If you are using admiral, I suggest .tar in admiral, so for example
tar -cvf p4.tar *.java
would create a .tar file with all the java files in the current working directory called p4.tar. Also, I
will want UML class diagrams for your classes, both showing the methods and their hierarchy.
This can be a separate file if you want, does not need to be tarred.
Note: If your files are in a package (using the package keyword), please delete that line and
submit them without it
