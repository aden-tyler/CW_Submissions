import java.util.Scanner;
public class Strings_Intro {

	
	/**
	 * 1. In the main method, instantiate a Scanner object and then instantiate a String object equal to a scanned input. 
	 * Be sure to close the scanner at the bottom of your main method before testing any code. 
	 * 2. Make and test a void method printSecondAndLastLetter that will print the second character and last character in the passed String.  
	 * 3. Make and test a method findTheE that returns the index of the first 'e' character in a passed String. 
	 * 4. Make and test a method getLength that returns the amount of characters (the length) of a passed String. 
	 * 5. Make and test a void method printFirstAndLastThree that is passed a string and prints the first three and last three characters in a passed String. 
**/
	
	
	public static void main(String[] args) {
		//Instantiates a Scanner and a String object that's equal to the scanned input
		Scanner myScanner = new Scanner (System.in);
		String myInput = new String (myScanner.next());

		//Prints the Second and Last Letter of the scanned input
		printSecondAndLastLetter(myInput);
		//Returns the index of the first 'e' character presented
		System.out.println("The first 'e' is at Index 2: " + findTheE(myInput));
		//Prints the length of the scanned input
		System.out.println("The Length of this String is " + getLength(myInput));
		//Prints the First and Last Three characters of the scanned input.
		printFirstAndLastThree(myInput);
		//Closes the scanner
		myScanner.close();
	}
	
	
	//This method passes a string that allows it to return the second and last letter of the scanned input.
	public static void printSecondAndLastLetter(String letter)
	{
		System.out.println(letter);
		char letterTwo = letter.charAt(1);
		char lastLetter = letter.charAt(letter.length()-1);
		System.out.println("The second letter is " + letterTwo);
		System.out.println("The last letter is " + lastLetter);
	}
	//This method finds the index of the first 'e' in the scanned input.
	public static int findTheE(String indexE)
	{
		return indexE.indexOf('e');
	}
	//This method finds the length of the scanned input.
	public static int getLength(String theLength) 
	{
		return theLength.length();
	}
	//This method passes a string that allows it to return the first three characters and last three characters of the scanned input.
	public static void printFirstAndLastThree(String characters)
	{
		String firstThree = characters.substring(0,3);
		String lastThree = characters.substring(characters.length()-3, characters.length());
		System.out.println("The first three characters of your input is " + firstThree);
		System.out.println("The last three characters of your input is " + lastThree);
	}




}
