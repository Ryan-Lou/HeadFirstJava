import java.util.*;
public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame(){
		DotCom one = new DotCom();
		one.setName("Baidu.com");
		DotCom two = new DotCom();
		two.setName("CSDN.com");
		DotCom three = new DotCom();
		three.setName("Tencent.com");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);

		System.out.println("Your goal is to sink three evil company's dot com. ");
		System.out.println("Baidu.com, CSDN.com, Tencent.com, ");
		System.out.println("Try to sink them all in the fewest number of guesses! ");

		for (DotCom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}// close for loop
	}// close setUpgame method

	private void startPlaying(){

		while (!dotComList.isEmpty()) {
			
			String userGuess = helper.getUserInput("Enter a guess:");

			checkUserGuess(userGuess); //call checkUserGuess
		} // close while

		finishGame(); // call finishGame

	} //close startPlaying method

	private void checkUserGuess(String userGuess) {

		numOfGuesses++;
		String result = "miss";
		for (int x = 0;x < dotComList.size() ; x++ ) {

			result = dotComList.get(x).checkYourself(userGuess);
		
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComList.remove(x);
				break;
			}

		} // close for

		System.out.println(result);
	} // close checkUserGuess method

	private void finishGame() {

		System.out.println("All company's Dot Coms are dead! Your stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println(" You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dacing with your options.");
		}

	} // close finishGame method

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	} // close main method

}