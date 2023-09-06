package main;

import animals.Animal;
import animals.Cow;
import animals.Pig;
import animals.Sheep;
import animals.Snorlax;

public class FarmerAlBarnyardInventoryApplication {

	public static void main(String[] args) {
		// New solution
		Cow cow = new Cow();
		Pig pig = new Pig();
		Sheep sheep = new Sheep();
		Snorlax snorlax = new Snorlax();
		Snorlax snorlax2 = new Snorlax("awake");
		
		Animal[] animals = {cow, pig, sheep, snorlax, snorlax2};
		String[] names = {"Cow", "Pig", "Sheep", "Snorlax", "Snorlax 2"};
		
		int i = 0;
		
		for (Animal a : animals) {
			System.out.println(names[i] + ":");
			a.animalSound();
			a.sleep();
			System.out.println();
			i++;
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
