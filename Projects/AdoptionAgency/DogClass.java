package AdoptionMethods;
// This class serves as the primary class where all the methods and variables are created for use in the main.
public class Dog {
	//These variables are the main info that we'll collect for the dogs. They're also protected so no other class (but subclasses) can access it.
	protected String name;
	protected int age;
	protected boolean isAdopted;
	/** Translates the protected variables into something that can be called in the main.
	 * @param a
	 * @param n
	 * @param ad
	 */
	public Dog(int a, String n, boolean ad)
	{
		age = a;
		name = n;
		isAdopted = ad;
	}
	/*
	 * This gets the adoption status of the dog.
	 */
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	/**
	 * This returns the age of the dog.
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old. ");
	}
	/**
	 * Ages the dog.
	 */
	public void increaseAge()
	{
		age++;
	}
	/**
	 * This method lets you know if the dog has been adopted yet or not.
	 */
	public String toString()
	{
		stateAge();
		if (isAdopted)
		{
			return ("I have been chosen!");
		}
		return ("I haven't found a home yet :(");
		}
	/**
	 * This method checks if a dog is the same as another dog.
	 * @param doggy
	 * @return
	 */
	public boolean equals(Dog doggy)
	{
		if (this.age == doggy.age && this.name.equals(doggy.name) && this.isAdopted == doggy.isAdopted)
		{
			return true;
		}
		return false;
	}
}
