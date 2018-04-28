import java.util.*;

public class DotComBust{
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuess = 0;
	//declare and initialize the variables we'll need 
	private void setUpGame(){
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		//make three DotCom objects, give 'em names & stick 'em in the ArrayList
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		//print brief instrunctions for user
		for (DotCom dotComToSet:dotComsList){ //repeat with each DotCom in the list
			ArrayList<String> newLocation = helper.placeDotCom(3); // ask the helper for a DotCom location
			dotComToSet.setLocationCells(newLocation); /** call the setter method on this DotCom to 
			give it the location you just got from the helper */
		}
	}
	
	private void startPlaying(){
		while(!dotComsList.isEmpty()){ //as long as the DotCom list is not empty
			String userGuess = helper.getUserInput("Enter a guess"); //get user input
			checkUserGuess(userGuess); //call our own checkUserGuyess method
		}	
	 finishGame(); //end our own finishGame method
	}
	
	private void checkUserGuess(String userGuess){
		numOfGuess++; //increment the number of guesses the user has made
		String result = "miss"; //assume it's a 'miss', unless told otherwise
		
		for(DotCom dotComToTest:dotComsList){ //repeat with all DoComs in the list
			result = dotComToTest.checkYourself(userGuess); //ask the DotCom to check the user guess, looking for a hit(or kill)
			if(result.equals("hit")){
				break; //get out of the loop early, no point in testing the others
			}
			if(result.equals("kill")){
				dotComsList.remove(dotComToTest); //this guy's dead, so take him out of the DotComs list then get out of the loop
				break;
			}
			
		}
		System.out.println(result); //print the result for the user
	}
	
	private void finishGame(){
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if(numOfGuess <=18){
			System.out.println("It only took you "+numOfGuess+" guesses.");
			System.out.println(" You got out before your options sank.");
			}
		else{
			System.out.println("Took you long enough. "+numOfGuess+" guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	} //print a message telling the user how he did in the game
	 public static void main(String[] args){
	 	DotComBust game = new DotComBust(); //create the game object
	 	game.setUpGame(); //tell the game object to set up the game
	 	game.startPlaying(); //tell the game object to start the main game play loop(keeps asking for user imput and checking the guess)
	 	}
}