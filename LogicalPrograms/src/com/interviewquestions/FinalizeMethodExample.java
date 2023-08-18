package com.interviewquestions;

public class FinalizeMethodExample {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        book = null;

        // Requesting JVM to run the garbage collector
        System.gc();
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Book '" + title + "' is finalized and ready for disposal.");
    }
}
