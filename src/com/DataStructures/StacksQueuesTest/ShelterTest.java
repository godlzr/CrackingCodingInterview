package com.DataStructures.StacksQueuesTest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.DataStructures.StacksQueues.*;
public class ShelterTest {

	@Test
	public void test() {
		Shelter shelter = new Shelter();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();

		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		Cat c4 = new Cat();
		
		shelter.enSheleter(d1, "wowo");
		shelter.enSheleter(c1, "dodo");
		shelter.enSheleter(c2, "mimi");
		shelter.enSheleter(d2, "wuwu");
		shelter.enSheleter(c3, "aoao");
		shelter.enSheleter(c4, "kaka");
		shelter.enSheleter(d3, "dada");
		shelter.printAllAnimal();
		System.out.println();
		System.out.print("I want a pet:");
		shelter.printAnimal(shelter.dequeueAny());
		System.out.println();

		shelter.printAllAnimal();
		System.out.println();
		System.out.print("I want a dog:");
		shelter.printAnimal(shelter.dequeueDog());
		System.out.println();

		shelter.printAllAnimal();

		
	}

}
