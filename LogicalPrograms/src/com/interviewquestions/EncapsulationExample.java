package com.interviewquestions;

public class EncapsulationExample {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}

	public static void main(String[] args) {
		EncapsulationExample person = new EncapsulationExample();
		person.setName("Sufiyan");
		person.setAge(10);

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}
}
