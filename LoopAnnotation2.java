/**
	 * This method is not static. What does this mean about how the method works? After code tracing, also answer
   	 * the following question: what does this method do?
	 * When a method isn't static, that means it belongs to objects within the class. This method will give you an answer based on the result its given.
   * The method checks if the inputted character c is equal to a character within the String.
	 */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
		 * 
		 * We can draw the conclusion that str has been declared as a variable outside of this method.
		 * 
		 * */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * 
		 * Executing the loop below might result in a syntax error because l cannot be used in the for loop.
		 * 
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * 
       * The line is checking if the character that int i is at is currently the same character as the inputted character c.
			 * If it's true, it returns i.
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * 
		 * The purpose of the line below is to return -1 if c never equals a character within the String.
		 */
		return -1;
		
	}
