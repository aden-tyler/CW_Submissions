package AdoptionMethods;
//This class is a subclass of the Dog class, as highlighted by the extends keyword.
public class PuppyDog extends Dog {
	//This is the only new variable for the PuppyDog class, signifying whether or not the puppy has been fed.
	boolean isFed;
	/**
	 * Translates the variables from the Dog class using super, and the new variable isFed into ones that can be used in the main method.
	 * @param a
	 * @param n
	 * @param ad
	 * @param f
	 */
	public PuppyDog(int a, String n, boolean ad, boolean f)
	{
		super (a,n,ad);
		isFed = f;
	}
	/**
	 * This method returns the age of the dog. 
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + age + " months old. ");
	}
	/**
	 * This increases the age by drawing from the method made in the Dog class.
	 */
	public void increaseAge()
	{
		super.increaseAge();
		isFed = false;
	}
	/**
	 * This class tells 
	 */
	public String toString()
	{
	if (isFed)
	{
	return super.toString() + "I'm fed!";
	}   
	return super.toString() + "I must be fed.";
	}
	/**
	 * This method checks if both the Dog and the Puppy are the same Dog.
	 * @param lilDoggy
	 * @return
	 */
	public boolean equals(PuppyDog lilDoggy)
	{
		if (super.equals(lilDoggy) && this.isFed == lilDoggy.isFed)
		{
			return true;
		}
		return false;
	}
}
