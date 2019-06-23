package com.zookeeper;

public class Gorilla extends Mammal {
	
	public int throwSomething() {
		energyLevel -= 5;
		System.out.println("The Gorilla has thrown something!");
		return energyLevel;
	}
	
	public int eatBananas() {
		energyLevel += 10;
		System.out.println("The Gorilla ate a banana.");
		return energyLevel;
	}
	
	public int climb() {
		energyLevel -= 10;
		System.out.println("The Gorilla climbed a tree.");
		return energyLevel;
	}
}
