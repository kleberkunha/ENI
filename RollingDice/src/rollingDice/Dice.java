package rollingDice;

import java.util.Random;

public class Dice {
	private int nbFaces;// create the variable that will contain the number of sides of the dice
	private int drawnFace;// store the value sorted from the dice and return it

	private static Random rand = new Random(); // Call the random function

	public Dice(int nbFaces) {
		this.setNbFaces(nbFaces);
		this.play();
	}

	public int getNbFaces() {
		// Used to get the data from the variable
		return this.nbFaces;
	}

	public void setNbFaces(int nbFaces) {
		// Used to set the data into the variable
		this.nbFaces = nbFaces;
	}

	public int play() {
		// here i say that drawnFace receive the next number sorted.
		return this.drawnFace = Dice.rand.nextInt(this.nbFaces) + 1;
	}

	public int getDrawnFace() {
		// Return the value stored in the variable drawnFace
		return this.drawnFace;
	}

}
