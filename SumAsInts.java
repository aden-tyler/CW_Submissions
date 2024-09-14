
public class SumAsInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(3.0);
		printMathStuffs(4, 3);
	}

	public static void printSumAsInts (int x, double y) {
	int z = (int) y;
	System.out.print(x+z);
	}
	public static void stateName() {
	System.out.println ("My name is Aden Keali'i");
	}
	public static void stateEyeColor() {
	System.out.println("My eye color is dark brown");
	}
	public static void stateHairStyle() {
	System.out.println("I have a middle part hairstyle");
	}
	public static void stateBestFriend() {
	System.out.println("My best friend is Macy Ramos");
	}
	public static void stateFavoriteFood() {
	System.out.println("My favorite food is Meat Jun");
	}
	public static void printCircleStats(double radius) {
		final double pi = 3.1415;
		double circumference = 2*pi*radius;
		double diameter = 2*radius;
		double area = pi*radius*radius;
		
		System.out.println("Radius:" + radius);
		System.out.println("Circumference:" + circumference);
		System.out.println("Diameter:" + diameter);
		System.out.println("Area:" + area);
		
		
	}
	public static void printMathStuffs (int x, int y) {
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x/y);
	System.out.println(x%y);
	}
}
