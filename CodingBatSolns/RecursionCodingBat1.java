/**
1. factorial: Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
**/
public int factorial(int n) {
if (n < 1)
  return 1;
else
  return n * factorial(n-1);
}

/**
2. bunnyEars: We have a number of bunnies and each bunny has two big floppy ears. 
   We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
**/
public int bunnyEars(int bunnies) {
  if (bunnies < 1)
  return bunnies;
  else
  return 2 + bunnyEars(bunnies-1);
}


/**
3. fibonacci: 
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. 
The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
**/
public int fibonacci(int n) {
  if(n == 1 || n == 0)
  return n;
  else
  return fibonacci(n-1) + fibonacci(n-2);
}
