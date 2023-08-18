package com.interviewquestions;

import java.io.*;

@SuppressWarnings("serial")
class Stdnt implements Serializable {
    String name;
    transient int age; // Marked as transient, won't be serialized

    public Stdnt(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class TransientExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Stdnt student = new Stdnt("Alice", 25);

        // Serialize object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
        out.writeObject(student);
        out.close();

        // Deserialize object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
        Stdnt deserializedStudent = (Stdnt) in.readObject();
        in.close();

        System.out.println("Name: " + deserializedStudent.name);
        System.out.println("Age: " + deserializedStudent.age);
    }
}
