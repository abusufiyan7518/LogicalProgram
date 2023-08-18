package com.interviewquestions;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class EqualsHashCodeExample {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(101, "Bob");

        System.out.println("Are students equal: " + student1.equals(student2));
        System.out.println("HashCode of student1: " + student1.hashCode());
        System.out.println("HashCode of student2: " + student2.hashCode());
    }
}
