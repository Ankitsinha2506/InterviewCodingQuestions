package com.interview.codingquestions;
class Parent
{
	void print() {
		System.out.println("Parent Class Called..");
	}
	void display() {
		print();
	}
}

class Child extends Parent
{
	void print() {
		System.out.println("Child Class Called...");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}

}
