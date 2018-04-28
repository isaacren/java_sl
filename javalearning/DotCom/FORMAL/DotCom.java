import java.util.*;

public class DotCom {
	private ArrayList<String> locationCells;
	private String name; //DotCom's instance variables: an arraylist of cell locations & the DotCom's name
	
	public void setLocationCells(ArrayList<String> loc){
		locationCells = loc ; 
		//A setter method that updates the DotCom's location(Random location provided by the GameHelper placeDotCom() method)
	}
	
	public void setName(String n){ //basic setter method
		name = n ;  
	}
	
	public String checkYourself(String userInput){
		String result = "miss";
		int index = locationCells.indexOf(userInput); //The ArrayList indexOf() method in action!
		//If the user guess is one of the entries in the ArrayList, indexOf() will return its ArrayList location. 
		//If not, indexOf() will return -1
		if(index>=0){
			locationCells.remove(index); //Using ArrayList's remove() method to delete an entry
			if(locationCells.isEmpty()){ //using the isEmpty() method to see if all of the locations have been
																	//guessed
				result="kill";
				System.out.println("Ouch! You sunk "+name+" :(");
				//Tell user when a DotCom has been sunk
			} else {
				result = "hit";
			}
		}
		return result; //Return: 'miss' or 'hit' or 'kill'
	}
}