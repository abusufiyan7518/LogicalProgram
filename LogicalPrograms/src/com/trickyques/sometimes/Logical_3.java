package com.trickyques.sometimes;

class Base {
	public String base() {
		return "Base";
	}
}

class Derived extends Base {
	public String derived() {
		return "Derived";
	}
}

class DeriDerived extends Derived {
	public String deriDerived() {
		return "DeriDerived";
	}

}

public class Logical_3 {
	public static void main(String[] args) {
		DeriDerived dd = new DeriDerived();
		System.out.println(dd.deriDerived() + "\n" + dd.derived() + "\n" + dd.base());
	}

}
