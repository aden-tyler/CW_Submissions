public class DoNothingTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//task 1: prints my name, hairstyle, and favorite food.
	System.out.println(stateName());
	System.out.println(stateHairStyle());
	System.out.println(stateFavoriteFood());
	
		//task 2: print circle stats
		//declare variables
		double radius;
		double diameter;
		double circumference;
		double area;
		//set values
		radius = 2.0;
		diameter = calcDiameter(radius);
		circumference = calcCircumference(radius);
		area = calcArea(radius);
		//print statements
		System.out.println ("The diameter of a circle with the radius of " + radius + " is " + diameter);
		System.out.println ("The area is " + area);
		System.out.println ("The circumference is " + circumference);
			
			//task 3: print a bunch of math, adding, subtracting, dividing, multiplying, and modulating
			//declare variables
			int num1;
			int num2;
			int add;
			int subtract;
			int divide;
			int multiply;
			int modulate;
			// sets value
			num1 = 1;
			num2 = 2;
			add = doAddition(num1, num2);
			subtract = doSubtraction(num1, num2);
			divide = doDivision(num1, num2);
			multiply = doMultiplication(num1, num2);
			modulate = doModulus(num1, num2);
			//print statements
			System.out.println (num1 + " + " + num2 + " is " + add);
			System.out.println (num1 + " - " + num2 + " is " + subtract);
			System.out.println (num1 + " / " + num2 + " is " + divide);
			System.out.println (num1 + " * " + num2 + " is " + multiply);
			System.out.println (num2 + " % " + num2 + " is " + modulate);
	
	}
	
	public static String stateName () 
	{
		return ("My name is Aden Tyler"); 
	}
	public static String stateEyeColor ()
	{
		return ("My eye color is dark brown");	
	}
	public static String stateHairStyle(){
		return ("I have a middle part hairstyle");	
	}	
	
	public static String stateBestFriend() {
		return ("My best friend is Macy Ramos");
	}
	public static String stateFavoriteFood() {
		return ("My favorite food is Meat Jun");
	}
	public static double calcDiameter(double radius)
	{
		return (2*radius);
	}
	public static double calcCircumference(double radius)
	{
		final double pi=3.1415;
		return (2*pi*radius);
	}
	public static double calcArea(double radius)
	{
		final double pi=3.1415;
		return (pi*radius*radius);
	}

	public static int doAddition(int num1, int num2)
	{
		int add = num1 + num2;
		return add;
	}
	public static int doSubtraction(int num1, int num2) 
	{
		int subtract = num1 - num2;
		return subtract;
	}
	public static int doDivision(int num1, int num2)
	{
		int divide = num1 / num2;
		return divide;
	}
	public static int doMultiplication(int num1, int num2)
	{
		int multiply = num1 * num2;
		return multiply;
	}
	public static int doModulus(int num1, int num2)
	{
		int modulate = num1 % num2;
		return modulate;
	}
}
