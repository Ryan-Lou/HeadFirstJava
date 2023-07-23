import java.util.ArrayList;

public class DotComTestDrive {
	
	public static void main(String[] args) {

		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();


		DotCom theDotCom = new DotCom();
		int randNum = (int) (Math.random() *5);

		ArrayList<String> locations = new ArrayList<String>();
		locations.add("2"); // 
		locations.add("3");
		locations.add("4");
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			numOfGuesses++;
			if (result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses" );
			}

		}
		
	}
}