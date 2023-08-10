package com.roomtest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
	public static void main(String[] args) {
		
		List<ArrayListStudent> studentlist = new ArrayList<>();
		studentlist.add(new ArrayListStudent(1, "Sufiyan"));
		studentlist.add(new ArrayListStudent(2, "Abuzar"));
		studentlist.add(new ArrayListStudent(3, "Ansarul"));
		studentlist.add(new ArrayListStudent(2, "Abuzar"));
		studentlist.add(new ArrayListStudent(4, null));
		
		for (ArrayListStudent student : studentlist) {
			System.out.println(student);
		}
	}
}
