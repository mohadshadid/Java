import java.util.ArrayList;
// import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
        System.out.println(generator.getRandomLetter());
        System.out.println(generator.getRandomLetterWithArray());
        System.out.println(generator.generatePassword());
        System.out.println(generator.getNewPasswordSet(7));
	}
}
// getTenRolls

// Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.

// getRandomLetter

// Write a method that will:

// Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values).
// Generate a random index between 0-25 and use it to pull a random letter out of the array.
// Return the random letter.
// generatePassword

// Write a method that uses the previous method to create a random string of eight characters and return that string.

// getNewPasswordSet

// Write a method that takes an int length as an argument and creates an array of random eight-character words. The array should be the length passed in as an int. Return the array of passwords.