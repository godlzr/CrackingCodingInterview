/*
 * 
 * The implementation of the Questions in "Cracking the Coding Interview"
 * Author: Zhongrui Li
 * 
 * Data Structures
 * Chapter 3
 * 3.7 An animal shelter holds only dogs and cats, and operates on a strictly 
 * "first in, first out" basis. People must adopt either the "oldest" 
 * (based on arrival time) of all animals at the shelter, or they can select 
 * whether they would prefer a dog or a cat (and will receive the oldest animal of that type). 
 * They cannot select which specific animal they would like, Create the data structures 
 * to maintain this system and implement operations such as enqueue, 
 * dequeueAny, dequeueDog and dequeueCat. 
 * You may use the built-in LinkedList data structure.  
 */ 
package com.DataStructures.StacksQueues;
import com.DataStructures.StacksQueues.Queue;
import com.DataStructures.StacksQueues.Animal;

public class Shelter {
	Queue<Dog> dogStack;
	Queue<Cat> catStack;
	int index;
	
	public Shelter() {
		dogStack = new Queue<Dog>();
		catStack = new Queue<Cat>();
	    index = 0;
	}
	public Animal dequeueDog(){
		Dog d = dogStack.dequeue().data;
		index --;
		return d;
	}
	public Animal dequeueCat(){
		Cat c = catStack.dequeue().data;
		index--;
		return c;
	}
	public void enSheleter(Animal a, String name) {
		a.index = index++;
		a.name = name;
		if(a instanceof Dog) {
			dogStack.enqueue((Dog)a);
		}
		if(a instanceof Cat) {
			catStack.enqueue((Cat)a);
		}	
	}
	public Animal dequeueAny() {
		index--;
		if(dogStack == null&&catStack != null)
			return catStack.dequeue().data;
		else if(dogStack != null&&catStack == null)
			return dogStack.dequeue().data;
		else if(dogStack.first.data.index < catStack.first.data.index)
			return dogStack.dequeue().data;
		else
			return catStack.dequeue().data;
	}
	public void printAnimal(Animal a) {
		if(a instanceof Dog) {
			System.out.print("(Dog)" + a.name + " ");
		}
		if(a instanceof Cat) {
			System.out.print("(Cat)" + a.name + " ");
		}	
		
	}
	public void printAllAnimal() {
		
		Node<Dog> dogNode = dogStack.first;
		
		Node<Cat> catNode = catStack.first;
		
		int i = this.index;
		while(i > 0) {
			if(dogNode == null) {
				this.printAnimal(catNode.data);
				catNode = catNode.next;
			}
			else if(catNode == null){
				this.printAnimal(dogNode.data);
				dogNode = dogNode.next;
			}
			else if(dogNode.data.index < catNode.data.index) {
				this.printAnimal(dogNode.data);
				dogNode = dogNode.next;
			}
			else {
				this.printAnimal(catNode.data);
				catNode = catNode.next;
			}
			--i;	
		}

	}
	

}
