import java.util.Arrays;

public class AlteringArraysProblem {
	//main method
	public static void main(String[] args) {
		int[ ] nums = {5, 0, 8, 20};
		
		System.out.println(Arrays.toString(subtract5ToAll(nums)));
	}
	/**
	 * This method subtracts 5 to all of the numbers within the array.
	 * @param arr
	 * @return
	 */
	public static int[ ] subtract5ToAll (int [ ] arr )
	{
		int [ ] copyArr = new int [arr.length];
		for( int i = 0; i< arr.length; i++ )
		{
			copyArr[i] = arr[i] - 5;
		}
		return copyArr;
	}
}
