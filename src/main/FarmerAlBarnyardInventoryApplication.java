package main;

import animals.Animal;
import animals.Cow;
import animals.Pig;
import animals.Sheep;
import animals.Snorlax;

public class FarmerAlBarnyardInventoryApplication {

	public static void main(String[] args) {
		// New solution
		
		Animal[] animals = {new Cow(), new Pig(), new Sheep(),
				new Snorlax(), new Snorlax("awake")};
		String[] names = {"Cow", "Pig", "Sheep", "Snorlax", "Snorlax 2"};
		
		int i = 0;
		
		for (Animal a : animals) {
			System.out.println(names[i] + ":");
			a.animalSound();
			a.sleep();
			System.out.println();
			i++;
		}
	}
}