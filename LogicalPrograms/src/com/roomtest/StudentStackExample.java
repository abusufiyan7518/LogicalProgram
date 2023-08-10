package com.roomtest;

import java.util.Enumeration;   
import java.util.Stack;

public class StudentStackExample {
	public static void main(String[] args) {
		
		Stack<Student> studentStack = new Stack<>();
		studentStack.push(new Student(101, "Anzar"));
		studentStack.push(new Student(102, "Sufiyan"));
		studentStack.push(new Student(103, "Abuzar"));
		studentStack.push(new Student(104, "Anzar"));
		studentStack.push(new Student(101, null));
		
		System.err.println("Popped student: " + studentStack.pop());
		System.out.println("Peeked student: " + studentStack.peek());
		
		for (Student student : studentStack) {
			System.out.println(student);
		}
	}

	static class Student {
		private int id;
		private String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public String toString() {
			return "Student{" + "id=" + id + ",name=" + name + "}";
		}
	}
}
