import java.util.Arrays;
public class TwoDArrayIntroAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		int [][] gridNums = new int [4][6];
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNums));
		System.out.println("");
		// 2. Instantiate a 2-D array with the following values:
		// 4   5   7

		// 2  -1   8

		// 0   1   3
		int [][]gridNumsTwo = new int [3][3];
		gridNumsTwo[0][0] = 4;
		gridNumsTwo[0][1] = 5;
		gridNumsTwo[0][2] = 7;
		gridNumsTwo[1][0] = 2;
		gridNumsTwo[1][1] = -1;
		gridNumsTwo[1][2] = 8;
		gridNumsTwo[2][0] = 0;
		gridNumsTwo[2][1] = 1;
		gridNumsTwo[2][2] = 3;
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNumsTwo));
		System.out.println("");
		//For the following problems, print out those elements before and after to verify it worked. 

		//3. For both of those arrays, change the element in the first row, first column to a 17.
		gridNums [0][0] = 17;
		gridNumsTwo[0][0] = 17;
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNums));
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNumsTwo));
		//4. For both of those arrays, change the element in the second row, third column into a 20. 
		gridNums [1][2] = 20;
		gridNumsTwo[1][2] = 20;
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNums));
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNumsTwo));
		//5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 
		gridNums [0][gridNums.length-1] = -5;
		gridNumsTwo[0][gridNumsTwo.length-1] = -5;
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNums));
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNumsTwo));
		//6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 
		gridNums [gridNums.length-1][0] = -7;
		gridNumsTwo[gridNumsTwo.length-1][0] = -7;
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNums));
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNumsTwo));
		//7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		gridNums [gridNums.length-1][gridNums[0].length-1] = -30;
		gridNumsTwo[gridNumsTwo.length-1][gridNumsTwo[0].length-1] = -30;
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNums));
		System.out.println("");
		System.out.println(Arrays.deepToString(gridNumsTwo));
		
		printFirstRow(gridNumsTwo);
		System.out.println("");
		printFirstColumn(gridNumsTwo);
		System.out.println("");
		printRowMajorOrder(gridNumsTwo);
		System.out.println("");
		printColumnMajorOrder(gridNumsTwo);
	}
	//8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
	public static void printFirstRow(int[][] arr)
	{
		for ( int j = 0 ; j <= arr[0].length-1 ; j++)
			System.out.println(arr[0][j]);

	}
	//9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
	public static void printFirstColumn(int[][] arr)
	{
		for ( int j = 0 ; j <= arr.length-1 ; j++)
			System.out.println(arr[j][0]);
	}
	//10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 
	public static void printRowMajorOrder(int[][] arr)
	{
		for ( int i = 0 ; i <= arr.length-1 ; i++)
		{
			for ( int j = 0 ; j <= arr[0].length-1 ; j++)
			{
				System.out.println (arr [ i ][ j ]);
			}
		}

	}
	//11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 
	public static void printColumnMajorOrder(int[][] arr)
	{
		for ( int i = 0 ; i <= arr[0].length-1 ; i++)
		{
			for ( int j = 0 ; j <= arr.length-1 ; j++)
			{
				System.out.println (arr [ j ][ i ]);
			}
		}
	}
}
