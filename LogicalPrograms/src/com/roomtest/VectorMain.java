package com.roomtest;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class VectorMain {
	public static void main(String[] args) {
		
		Vector<Employee> employee = new Stack<>();
		
		employee.add(new Employee(101, "Sufiyan"));
		employee.add(new Employee(102, "Abuzar"));
		employee.add(new Employee(103, "Ansarul"));
		employee.add(new Employee(102, "Abuzar"));
		employee.add(new Employee(102, null));
		employee.add(new Employee(102, "Abuzar"));
		/*
		 * for (Employee employeeNew : employee) { System.out.println(employeeNew); }
		 */

		Enumeration<Employee> enumerationnew = employee.elements();
		System.out.println("printing each enumeration constant by enumerating through the Vector:");
		while (enumerationnew.hasMoreElements()) {
			System.out.println(enumerationnew.nextElement());
		}
	}
}
