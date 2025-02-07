
public class SearchingArraysIntro {

	public static void main(String[] args) {

		// Array used for the following methods
		int [] nums = {4,5,4,5};
		
		// Prints out the results of the methods.
		System.out.println((checkFor4(nums)));
		System.out.println((countFor4(nums)));
		System.out.println((countForFour4(nums)));
	}


/**
 * This method checks if the array nums has a 4 in it and returns true.
 * @param arr
 * @return
 */
public static boolean checkFor4(int [] arr)
{
	int [] checkArr = new int [arr.length];
	for (int i = 0; i < arr.length ; i++)
	{
		if(i == checkArr[i])
		{
			return true;
		}
	
	}
	return false;

}
/**
 * This method counts the amount of fours in the nums array and returns that number.
 * @param arr
 * @return
 */
public static int countFor4(int [] arr)
{
	int count = 0;
	for (int i = 0; i < arr.length ; i++)
	{
		if(arr[i] == 4)
		{
			count++;
		}
	
	}
	return count;
}
/**
 * This method returns true if the nums array has four 4's.
 * @param arr
 * @return
 */
public static boolean countForFour4(int [] arr)
{
	int count = 0;
	for (int i = 0; i < arr.length ; i++)
	{
		if(arr[i] == 4)
		{
			count++;
			if (count == 4)
			{
				return true;
			}
		}
	
	}
	return false;
}
}
