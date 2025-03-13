import java.util.Arrays;

public class AlgorithmsProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,5,2,1};
		System.out.println(returnSmallest(nums));
		System.out.println(returnSmallestIndex(nums));
		System.out.println(returnAverage(nums));
		System.out.println(evenArray(nums));
		consecutiveFives(nums);
		System.out.println(threeTimesNumber(nums));
		System.out.println(returnInts(nums, 1));
		arrayBackwards(nums);
		shiftElementsRight(nums);
		selectionSort(nums);
	}
	/**
	 * This method returns the smallest number within the array.
	 * @param arr
	 * @return
	 */
	public static int returnSmallest(int [] arr)
	{
		int min = arr[0];
		for (int i = 1; i < arr.length ; i++)
		{
			if (min > arr[i])
			{
			min = arr[i];
				
				
			}
			
		}

		return min;
	}
	/**
	 * This method returns the index of the smallest number in the array.
	 * @param arr
	 * @return
	 */
	public static int returnSmallestIndex(int [] arr)
	{
		int min = arr[0];
		for (int i = 1; i < arr.length ; i++)
		{
			if (min > arr[i])
			{
			min = arr[i];
				
				
			}
			
		}

		return arr.length;
	}
	/**
	 * This method returns the average of the array given.
	 * @param arr
	 * @return
	 */
	public static int returnAverage(int [] arr)
	{
		int average = 0;
		for (int i : arr)
		{
			average += i;
		}
		return average/arr.length;	
	}
	/**
	 * This method returns true if all numbers in the array given are true, and false otherwise.
	 * @param arr
	 * @return
	 */
	public static boolean evenArray(int [] arr)
	{
		for (int i : arr)
		{
			if (i % 3 == 0)
			{
				return false;
			}
			
		}
		return true;
	}
	/**
	 * This method returns true if there are ever two consecutive 5's within the array.
	 * @param arr
	 */
	public static void consecutiveFives(int [] arr)
	{
		for (int i = 0; i < arr.length - 1 ; i++)
		{
			if (arr[i] == 5 && arr[i+1] == 5)
			{
			arr[i] = 0;
			arr[i+1] = 0;
			}
		}
	}
	/**
	 * This method will return true if a number ever shows up 3 times in an array, and false otherwise.
	 * @param arr
	 * @return
	 */
	public static boolean threeTimesNumber(int [] arr)
	{
		for(int i=0; i < arr.length-2; i++)
		{
			if(arr[i]== arr[i+1] && arr[i+1]== arr[i+2])
			{
				return true;
			}
		}
		return false;
	}
	/**
	 * This method returns the amount of times a certain number given shows up in the array.
	 * @param arr
	 * @param search
	 * @return
	 */
	public static int returnInts(int [] arr, int search)
	
	{
		int count = 0;
		
		for(int i : arr)
		{
			if(i == search)
			{
				count++;
			}
		}
		return count;		
	}
	/**
	 * This method reverses the array, making everything backwards.
	 * @param arr
	 */
	public static void arrayBackwards(int [] arr)
	{
		for(int i=0; i < arr.length / 2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]= temp;
		}
	}
	/**
	 * This method shifts all elements of the array right one.
	 * @param arr
	 */
	public static void shiftElementsRight(int [] arr)
	{
		for (int i = arr.length-1; i > 0; i--)
		{
			int temp = arr[i];
			arr[i] = arr [i-1];
			arr[i-1]= temp;
			
		}
	}
	/**
	 * This method utilizes selection sort in order to sort the array given.
	 * @param arr
	 */
	public static void selectionSort( int [] arr)
	{
		{
			int smallest = arr[0];
			int index = 0;
			for( int i = 0 ; i < arr.length ; i++)
			{
				for (int j = i ; j < arr.length ; j++)
				{
					if (arr[i] <= smallest)
					{
						smallest = arr[i];
						index = i;
					}
				}
				
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index]= temp;
				
			}
		}

	}





}
