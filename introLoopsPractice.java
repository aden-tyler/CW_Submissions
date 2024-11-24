
public class introLoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countLetters("aajandsngasnanansdgnds", 'a'));
		System.out.println(getFactorial(5));
		System.out.println(getIfRepeats("bdedd", "a"));
	}
	/**
	 * This method counts the amount of a certain character 
	 * there is in the passed string.
	 * @param str
	 * @param strChar
	 * @return
	 */
	public static int countLetters (String str, char strChar)
	{
		int count = 0;
		for (int i = 0 ; i < str.length(); i++)
		{
			if (str.charAt(i) == strChar)
			{
				count++;
			}
				
		}
		return count;
	}
	/**
	 * This method returns the factorial of the passed int.
	 * @param factor
	 * @return
	 */
	public static int getFactorial(int factor)
	{
		for (int i = factor - 1; i > 0 ; i--)
		{

			factor *= i;
		}
		return factor;
	}
	/**
	 * This method returns true if there are 
	 * repeats of a letter in the string, and false if there isn't.
	 * @param str
	 * @param letter
	 * @return
	 */
	public static boolean getIfRepeats(String str, String letter)
	{
		for (int check1 = 0; check1 < str.length(); check1++)
		{
			//Examines the given input again
			for(int check2 = check1; check2 < str.length(); check2++)
			{
		
				//Returns true if the examined characters match any of the other characters.
				if (str.charAt(check1) == str.charAt(check2))
				{
					return true;
				}
				else if (str.charAt(check1) != str.charAt(check2))
				{
					return false;
				}
			}
			
		}
		return false;
	}
	
}
