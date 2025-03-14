import java.util.ArrayList;

public class convertingArrayAlgsToArrayListAlgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arrList = new ArrayList <Integer>();
		arrList.add(4);
		arrList.add(5);
		arrList.add(5);
		arrList.add(2);
		arrList.add(1);


	}
	public static int returnSmallest(ArrayList <Integer> returnSmall)
	{
		int min = returnSmall.get(0);
		for (int i = 1; i < returnSmall.size() ; i++)
		{
			if (min > returnSmall.get(i))
			{
			min = returnSmall.get(i);
				
			}
			
		}

		return min;
	}
	/**
	 * This method returns the index of the smallest number in the array.
	 * @param arr
	 * @return
	 */
	public static int returnSmallestIndex(ArrayList <Integer> smallestIndex)
	{
		int min = 0;
		for (int i = 1; i < smallestIndex.size() ; i++)
		{
			if (min > smallestIndex.get(i))
			{
			min = smallestIndex.get(i);
				
				
			}
			
		}

		return smallestIndex.indexOf(min);
	}
	/**
	 * This method returns the average of the array given.
	 * @param arr
	 * @return
	 */
	public static int returnAverage(ArrayList <Integer> arrayList)
	{
		int average = 0;
		for (int i : arrayList)
		{
			average += i;
		}
		return average/arrayList.size();	
	}
	/**
	 * This method returns true if all numbers in the array given are true, and false otherwise.
	 * @param arr
	 * @return
	 */
	public static boolean evenArray(ArrayList <Integer> arrayList)
	{
		for (int number : arrayList)
			if (number % 2 > 0)
			{
				return false;
			}
		return true;
	}
	/**
	 * This method returns true if there are ever two consecutive 5's within the array.
	 * @param arr
	 */
	public static void consecutiveFives(ArrayList <Integer> arrayList)
	{
		for (int i = 0; i < arrayList.size() - 1 ; i++)
		{
			if (arrayList.get(i) == 5 && arrayList.get(i+1) == 5)
			{
			arrayList.set(i, arrayList.set(i+1, 0)- 5);
			}
		}
	}
	/**
	 * This method will return true if a number ever shows up 3 times in an array, and false otherwise.
	 * @param arr
	 * @return
	 */
	public static boolean threeTimesNumber(ArrayList <Integer> arrayList)
	{
		for(int i=0; i < arrayList.size()-2; i++)
		{
			if(arrayList.get(i)== arrayList.get(i+1) && arrayList.get(i+1)== arrayList.get(i+2))
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
	public static int returnInts(ArrayList <Integer> arrayList, int search)
	
	{
		int count = 0;
		
		for(int i : arrayList)
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
	public static void arrayBackwards(ArrayList <Integer> arrayList)
	{
		for(int i = arrayList.size() - 2 ; i >= 0; i--)
		{
			arrayList.add(arrayList.remove(i));
		}
	}
	/**
	 * This method shifts all elements of the array right one.
	 * @param arr
	 */
	public static void shiftElementsRight(ArrayList <Integer> arrayList)
	{
		arrayList.add(0, arrayList.remove(arrayList.size() - 1));
	}
	/**
	 * This method utilizes selection sort in order to sort the array given.
	 * @param arr
	 */
	public static void selectionSort(ArrayList <Integer> arrayList)
	{
		{
			for( int i = 0 ; i < arrayList.size() - 1 ; i++)
			{
				int smallest = arrayList.get(i);
				int index = i;
				for (int j = i + 1; j < arrayList.size() ; j++)
				{
					if (arrayList.get(j) <= smallest)
					{
						smallest = arrayList.get(j);
						index = j;
					}
				}
				
				if (smallest != arrayList.get(i))
				{
					arrayList.set(i, arrayList.set(index, arrayList.get(i)));
				}
				
			}
		}
	}
}
