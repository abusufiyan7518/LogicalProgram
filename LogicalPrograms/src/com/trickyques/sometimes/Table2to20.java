package com.trickyques.sometimes;

import java.util.Iterator;

public class Table2to20 {

	public static void main(String[] args) {
		for (int table = 2; table <= 20; table++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(table + "*" + (i) + "=" + (table * (i)));

			}
			System.out.println("--------------------------------");
		}

	}

}
