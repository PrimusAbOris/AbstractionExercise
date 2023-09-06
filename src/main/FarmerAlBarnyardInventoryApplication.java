package main;

import animals.Cow;
import animals.Pig;
import animals.Sheep;
import animals.Snorlax;

public class FarmerAlBarnyardInventoryApplication {

	public static void main(String[] args) {
		
		Cow cow = new Cow();
		System.out.println("Cow:" + "\n");
		cow.animalSound();
		cow.sleep();
		System.out.println();
		
		Pig pig = new Pig();
		System.out.println("Pig:" + "\n");
		pig.animalSound();
		pig.sleep();
		System.out.println();
		
		Sheep sheep = new Sheep();
		System.out.println("Sheep:" + "\n");
		sheep.animalSound();
		sheep.sleep();
		System.out.println();
		
		Snorlax snorlax = new Snorlax();
		System.out.println("Snorlax:" + "\n");
		snorlax.animalSound();
		snorlax.sleep();
		System.out.println();
		
		Snorlax snorlax2 = new Snorlax("awake");
		System.out.println("Snorlax 2:" + "\n");
		snorlax2.animalSound();
		snorlax2.sleep();
		System.out.println();
	}

}
