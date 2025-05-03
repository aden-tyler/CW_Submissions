package AdoptionMethods;
public class AdoptionMain {

	public static void main(String[] args) {
		Dog hippie = new Dog(13, "hippie", false);
		PuppyDog purpur = new PuppyDog (4, "purpur", false, true);
	
		hippie.stateAge();
		purpur.stateAge();
		
		System.out.println(hippie.getAdoptionStatus());
		System.out.println(purpur.getAdoptionStatus());
		
		System.out.println(hippie);
		System.out.println(purpur);
		
		System.out.println(hippie.toString());
		
		Dog twinkle = new Dog(2, "twinkle", false);
		PuppyDog twinkle2 = new PuppyDog(2, "twinkle", false, false);
		
		System.out.println(twinkle.equals(twinkle2));
	}

}
