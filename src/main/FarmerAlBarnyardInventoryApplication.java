package main;

import animals.Cow;
import animals.Pig;
import animals.Sheep;

public class FarmerAlBarnyardInventoryApplication {

	public static void main(String[] args) {
		
		Cow cow = new Cow();
		System.out.println("Cow:" + "\n");
		cow.animalSound();
		cow.sleep();
		
		Pig pig = new Pig();
		System.out.println("Pig:" + "\n");
		pig.animalSound();
		pig.sleep();
		
		Sheep sheep = new Sheep();
		System.out.println("Sheep:" + "\n");
		sheep.animalSound();
		sheep.sleep();
	}

}
