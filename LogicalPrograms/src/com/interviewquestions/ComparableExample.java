package com.interviewquestions;

class StudentNew implements Comparable<StudentNew> {
    private int id;
    private String name;

    public StudentNew(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(StudentNew other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        StudentNew[] students = {
                new StudentNew(101, "Alice"),
                new StudentNew(103, "Bob"),
                new StudentNew(102, "Charlie")
        };

        java.util.Arrays.sort(students);

        for (StudentNew student : students) {
            System.out.println(student);
        }
    }
}
