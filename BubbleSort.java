
public class BubbleSortPractice {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Nums array that gets bubble sorted.
		int [] nums = {8,6,3,5,1,8,9,2};
		//boolean isNotSorted checks if the nums array is sorted
		boolean isNotSorted = true;
		/**
		 * This while loops is meant to check if the nums array isn't sorted.
		 */
		while (isNotSorted == true)
		{
			//Setting it to false allows us to imagine that the nums array is already sorted, and now we're just checking it.
			isNotSorted = false;
			/**
			 * This for loop goes through each number in the nums array and checks if the first number given is bigger than the second number.
			 * If it is, then they are swapped. This continues until all numbers in the array are sorted.
			 */
			for (int i = 0 ; i < nums.length -1 ; i++)
			{
				/**
				 * If the 1st number is greater than the 2nd number, then they swap positions.
				 */
				if (nums [i] > nums [i + 1])
				{
					int temp = nums [i];
					nums [i] = nums [i+1];
					nums [i+1] = temp;
					isNotSorted = true;
				
				}
				
			}

		}
		// This prints out the numbers as they are swapped and the array nums is sorted.
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}

}
