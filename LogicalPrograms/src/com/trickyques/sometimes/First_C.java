package com.trickyques.sometimes;

public class First_C {
	public void myMethod() {
		System.out.println("confused");
	}

	{
		System.out.println(" Instance Block");
	}
	{
		System.out.println("yrr");
	}

	{
		System.out.println("Method");
	}
	{
		System.out.println("2nd position");
	}
	{
		System.out.println("center");
	}

	public void First_C() {
		System.out.println("Constructor ");
	}

	static {
		System.out.println("Pahle konsa block execute hoga");
		System.out.println("static block");
	}

	public static void main(String[] args) {
		First_C c = new First_C();
		c.First_C();
		c.myMethod();
	}

}
