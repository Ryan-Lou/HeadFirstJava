public class SimpleDotComTestDrive {
	
	public static void main(String[] args) {

		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();


		SimpleDotCom theDotCom = new SimpleDotCom();
		int randNum = (int) (Math.random() *5);


		int[] locations = {randNum,randNum+1,randNum+2};
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