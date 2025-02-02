/**
Task 1: rotateLeft3
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
*/

public int[] rotateLeft3(int[] nums) {
  int [] copy = new int[nums.length];
  copy [0] = nums [1];
  copy [1] = nums [2];
  copy [2] = nums [0];
  return copy;
}
/**
Task 2: reverse3
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
*/

public int[] reverse3(int[] nums) {
    int[] copy = new int[nums.length];
    
    copy[0] = nums[nums.length - 1];
    copy[1] = nums[1];
    copy[2] = nums[0];
    
    return copy;
}

/**
Task 3: maxEnd3
Given an array of ints length 3, figure out which is larger, 
the first or last element in the array, and set all the other elements to be that value. Return the changed array.
*/

public int[] maxEnd3(int[] nums) {
    int[] copy = new int[nums.length];
    if (nums[0] >= nums[nums.length-1])
    {
      copy[0] = nums[0];
      copy[1] = nums[0];
      copy[2] = nums[0];
    }
    else if (nums[0] <= nums[nums.length-1])
    {
      copy[0] = nums[nums.length-1];
      copy[1] = nums[nums.length-1];
      copy[2] = nums[nums.length-1];
    }
    return copy;
}

/**
Task 4: sum2
Given an array of ints, return the sum of the first 2 elements in the array.
If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
*/

public int sum2(int[] nums) {
 if (nums.length == 0)
  {
    return 0;
  }
  if (nums.length == 1)
  {
    return nums[0];
  }
  else
  {
  return nums [0] + nums [1];
  }
}

/**
Task 5: middleWay
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
*/

public int[] middleWay(int[] a, int[] b) {
    int newLength = 2;
    int[] copy = new int[newLength];
    
    copy[0] = a[1];
    copy[1] = b[1];    

    return copy;
}

/**
Task 6: makeEnds
Given an array of ints, 
return a new array length 2 containing the first and last elements from the original array. 
The original array will be length 1 or more.
*/

public int[] makeEnds(int[] nums) {
   int newLength = 2;
    int[] copy = new int[newLength];
    
    copy[0] = nums[0];
    copy[1] = nums[nums.length-1];

    return copy;
}
