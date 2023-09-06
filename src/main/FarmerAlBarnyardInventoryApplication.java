package main;

import animals.Animal;
import animals.Cow;
import animals.Pig;
import animals.Sheep;
import animals.Snorlax;

public class FarmerAlBarnyardInventoryApplication {

	public static void main(String[] args) {
		// New solution
		Animal[] animals = new Animal[5];
		Cow cow = new Cow();
		animals[0] = cow;
		Pig pig = new Pig();
		animals[1] = pig;
		Sheep sheep = new Sheep();
		animals[2] = sheep;
		Snorlax snorlax = new Snorlax();
		animals[3] = snorlax;
		Snorlax snorlax2 = new Snorlax("awake");
		animals[4] = snorlax2;
		
		for (Animal a : animals) {
			a.animalSound();
			a.sleep();
			System.out.println();
		}
		
		
//		Old solution		
//		
//		Cow cow = new Cow();
//		System.out.println("Cow:" + "\n");
//		cow.animalSound();
//		cow.sleep();
//		System.out.println();
//		
//		Pig pig = new Pig();
//		System.out.println("Pig:" + "\n");
//		pig.animalSound();
//		pig.sleep();
//		System.out.println();
//		
//		Sheep sheep = new Sheep();
//		System.out.println("Sheep:" + "\n");
//		sheep.animalSound();
//		sheep.sleep();
//		System.out.println();
//		
//		Snorlax snorlax = new Snorlax();
//		System.out.println("Snorlax:" + "\n");
//		snorlax.animalSound();
//		snorlax.sleep();
//		System.out.println();
//		
//		Snorlax snorlax2 = new Snorlax("awake");
//		System.out.println("Snorlax 2:" + "\n");
//		snorlax2.animalSound();
//		snorlax2.sleep();
//		System.out.println();
		
	}

}
