package com.trickyques.sometimes;

public class Logical_1 {
	public void print(Integer i) {
		System.out.println("Integer");
	}

	public void print(int i) {
		System.out.println("int");
	}

	public void print(long i) {
		System.out.println("long");
	}

	public static void main(String[] args) {
		Logical_1 test = new Logical_1();
		test.print(10);
	}

}
