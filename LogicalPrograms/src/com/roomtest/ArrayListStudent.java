package com.roomtest;

public class ArrayListStudent {
	private int id;
	private String name;

	public ArrayListStudent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Student{" + "id=" + id + ",name=" + name + "}";
	}
}
