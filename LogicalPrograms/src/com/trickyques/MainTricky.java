package com.trickyques;

class Tricky {
	int t = 20;

	Tricky() {
		t = 40;
	}
}

public class MainTricky {
	public static void main(String args[]) {
		Tricky t1 = new Tricky();
		System.out.println(t1.t);
	}
}
