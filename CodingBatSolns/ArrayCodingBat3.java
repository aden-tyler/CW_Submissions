/**
Task 1: Given an int array length 2, return true if it contains a 2 or a 3.
*/
public boolean has23(int[] nums) {
  if (nums [0] == 2 || nums [0] == 3 ||nums [1] == 3)
  {
    return true;
  }
  return false;
}

/**
Task 2: Given an int array length 2, return true if it does not contain a 2 or 3.
*/
public boolean no23(int[] nums) {
    if (nums [0] == 2 || nums [0] == 3 || nums [1] == 2 || nums [1] == 3 )
  {
    return false;
  }
  return true;
}

/**
Task 3: Given an int array, return a new array with double the length where its last element is the same as the original array, 
and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
*/
public int[] makeLast(int[] nums) {
  int[] arr = new int[2 * nums.length];
    arr[arr.length - 1] = nums[nums.length - 1];
    return arr;
}

/**
Task 4: Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
*/
public boolean double23(int[] nums) {
  if (nums.length < 2)
  {
    return false;
  }
  if (nums [0] == 2 && nums [1] == 2 || nums [0] == 3 && nums [1] == 3)
  {
  return true;
  }
  return false;
}

/**
Task 5: Given an int array length 3, 
if there is a 2 in the array immediately followed by a 3, 
set the 3 element to 0. Return the changed array.
*/
public int[] fix23(int[] nums) {
  		for (int i = 0 ; i < nums.length -1 ; i++)
			{
				if (nums [i] == 2 && nums [i + 1] == 3)
				{
         int temp = 0;
         nums [i+1] = temp;
          return nums;
				}
				
			}
  return nums;  
}

/**
Task 6: Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
*/
public int start1(int[] a, int[] b) {
    int count = 0;
    
    if(a.length > 0 && a[0] == 1)
        count++;
              
    if(b.length > 0 && b[0] == 1)
        count++;
                        
    return count;
}

/**
Task 7: Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
Return the array which has the largest sum. In event of a tie, return a.
*/
public int[] biggerTwo(int[] a, int[] b) {
  if (a[0] + a[1] < b[0] + b[1])
  {
    return b;
  }
  return a;
  
}

/**
Task 8: Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. 
The original array will be length 2 or more.
*/
public int[] makeMiddle(int[] nums) {
   return new int[] {nums[nums.length / 2 - 1], nums[nums.length / 2]};
}

/**
Task 9: Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
*/
public int[] plusTwo(int[] a, int[] b) {
  return new int[] {a[0], a[1], b[0], b[1]};
}

/**
Task 10: Given an array of ints, swap the first and last elements in the array. 
Return the modified array. The array length will be at least 1.
*/
public int[] swapEnds(int[] nums) {
int temp = nums [0];
		nums [0] = nums [nums.length-1];
		nums [nums.length-1] = temp;
		return nums;
}

/**
Task 11: Given an array of ints of odd length, return a new array length 3 
containing the elements from the middle of the array. The array length will be at least 3.
*/
public int[] midThree(int[] nums) {
     return new int[] {nums[nums.length / 2 - 1], nums[nums.length / 2], nums [nums.length / 2 +1]};
}

/**
Task 12: Given an array of ints of odd length, look at the 
first, last, and middle values in the array and return the largest. The array length will be a least 1.
*/
public int maxTriple(int[] nums) {
    int max = nums[0];
    
    if(max < nums[nums.length / 2])
       {
        max = nums[nums.length / 2];
       }      
    if(max < nums[nums.length - 1])
       {
        max = nums[nums.length - 1];
       }                
    return max;
}

/**
Task 13: Given an int array of any length, 
return a new array of its first 2 elements. 
If the array is smaller than length 2, use whatever elements are present.
*/
public int[] frontPiece(int[] nums) {
      int[] arr;
    if(nums.length < 2)
       {
        return nums;
       }
    else
       {
        arr = new int[2];
       }
    if(nums.length > 0)
       {
        arr[0] = nums[0];
       }                    
    if(nums.length > 1)
       {
        arr[1] = nums[1];
        }  
    return arr;
}

/**
Task 14: We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
*/
public boolean unlucky1(int[] nums) {
   if (nums.length < 2) {
    return false;
  } else if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)) {
      return true;
    } else if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
        return true;
    } else
      return false;
    
}

/**
Task 15: Given 2 int arrays, a and b, return a new array length 2 containing, 
as much as will fit, the elements from a followed by the elements from b. 
The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
*/
public int[] make2(int[] a, int[] b) {
   int[] myArray = new int[2];
  int aLen = a.length;
  int bLen = b.length;
  
  if (aLen == 0) {
    myArray[0] = b[0];
    myArray[1] = b[1];
    return myArray;
  } else if (aLen == 1 && bLen == 1) {
    myArray[0] = a[0];
    myArray[1] = b[0];
    return myArray;
  } else if (aLen == 1) {
      myArray[0] = a[0];
      myArray[1] = b[0];
      return myArray;  
  } else {
      myArray[0] = a[0];
      myArray[1] = a[1];
      return myArray;
  }
}

/**
Task 16: Given 2 int arrays, a and b, of any length, 
return a new array with the first element of each array. 
If either array is length 0, ignore that array.
*/
public int[] front11(int[] a, int[] b) {
    if (a.length == 0 && b.length == 0) {
    return a;
  }
  if (a.length == 0) {
    int[] myArray = new int[] {b[0]};
    return myArray;
  }
  
  if (b.length == 0) {
    int[] myArray = new int[] {a[0]};
    return myArray;
  }
  
  int[] myArray = new int[] {a[0], b[0]};
  return myArray;    
}
