// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class HelloWorld {
// Task 1: Print out your name using the letter O in ASCII art.
    public static void main(String[] args) {
        System.out.println("  O     O O    O O O   O   O");
        System.out.println(" O O    O  O   O       OO  O");
        System.out.println("O O O   O  O   O O O   O O O");
        System.out.println("O   O   O  O   O       O  OO");
        System.out.println("O   O   O O    O O O   O   O");
       
 // Task 2: Write code to compute the following math problem
        System.out.println(((6.0*3.5)-(1.5*5))/(55.6-30.2));
 // Task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0. (Hint: the value of pi is 3.1519 and it never changes)
        double radius=4.0;
        double pi=3.1519;
        int x=2;
        double circumference=x*radius*pi;
        double area=pi*radius*radius;
        System.out.println("The circumference of the circle is" + circumference + "and the area of the circle is" + area);
        
  
    }
}
