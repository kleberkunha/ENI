package rollingDice;

public class Play {

	public static void main(String[] args) {
		// Here i create the dice
		Dice myDice = new Dice();
		//here i say how many sides the dice have
		myDice.setNbFaces(6);
		//here he will print the value sorted from the dice
		do {
			System.out.println("The number sorted is"+myDice.play());
		}while(myDice.getDrawnFace() != 6); // here i say that the dice will give a value while this value will be different than 6.
	}

}
