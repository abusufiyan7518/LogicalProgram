package com.trickyques.sometimes;
//Not Clear
public class Logical_5 {
	private void foo() {
		System.out.println("In BaseClass.foo()");
	}

	void bar() {
		System.out.println("In BaseClass.bar()");
	}

	public static void main(String[] args) {
		Logical_5 po = new DerivedClass();
		po.foo();
		po.bar();
	}
}

class DerivedClass extends Logical_5 {
	void foo() {
		System.out.println("In Derived.foo()");
	}

	void bar() {
		System.out.println("In Derived.bar()");
	}
}
