package animals;

public class Snorlax extends Animal {
	public boolean awake = false;
	
	public Snorlax () {
		// default constructor
	}
	
	public Snorlax (String in) {
		if (in.equals("awake")) {
			awake = true;
		}
	}
	
	public void animalSound() {
		// he doesn't have a whole lot to say in his sleep
		if (!awake) {
			return;
		} else {
			System.out.println("SNOOOOORLAAAAAAAX!!");
		}
	}
}
