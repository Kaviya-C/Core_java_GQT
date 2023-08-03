package com.gqt.advance.java;

/*
 * 	Interface--> collection of public abstract methods
   	from java 8 spider version of java
   	interface contains--> public abstract methods,static methods,default methods, 
   	public static final variables
 
  
 	method without implementaion is called abstract methods
 	collection of abstract methods is interface
 	static methods,default methods,
 	any variable by default public static final
 	we can create object indirectly for interface using anonymous inner types

 	in java we can have functional interface in java
 	if we want to make an interface as functional interface 
 	we must use the annotations is @FuncitonalInterface
 	functional interface contains only one method that method is must be  abstract
 	also functional interface can have any no of default static methods
*/

interface Calcy {
	int num = 10;
	// variables are public static final

	void add();
	// by default it is public abstract

	default void sub() {
		// if we give implementation mean make method as default
		System.out.println("Hi from interface of default methods");
	}

}

@FunctionalInterface
interface Functional {
	void divide();

	static void multiply() {
		System.out.println("multiplication of static inside the functional interface");
	}

	// void multiply();
	default void mul() {
		System.out.println("default method of functional interface");

	}
}

class Test {
	// void add();
	// compiler telling to make method as abstract bcoz
	// inside class contains methods is not by default public or abstract so we have
	// to mention explicitly

}

public class Java8 {
	public static void main(String... args) {
		// Calcy c1=new Calcy();
		// we cannot directly create an object for interface

		Calcy c2 = new Calcy() {
			@Override
			public void add() {
				System.out.println("inside anonymous type of calcy");
			}

		};
		c2.sub();
		c2.add();
		System.out.println();
		Functional fun = new Functional() {
			public void divide() {
				System.out.println("division of functional interface");
			}
		};
		Functional.multiply();
		fun.divide();
		fun.mul();
		// we can create an object of an interface indirectly how?
		// using anonymous inner types
	}

}
