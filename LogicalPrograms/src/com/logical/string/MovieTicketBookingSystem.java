package com.logical.string;

import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    String title;
    String director;
    int availableSeats;

    public Movie(String title, String director, int availableSeats) {
        this.title = title;
        this.director = director;
        this.availableSeats = availableSeats;
    }
}

class Ticket {
    String movieTitle;
    int numberOfTickets;

    public Ticket(String movieTitle, int numberOfTickets) {
        this.movieTitle = movieTitle;
        this.numberOfTickets = numberOfTickets;
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Movie> movies = createMovies();
        ArrayList<Ticket> bookedTickets = new ArrayList<>();

        while (true) {
            System.out.println("Movie Ticket Booking System");
            System.out.println("1. Browse Movies");
            System.out.println("2. Book Tickets");
            System.out.println("3. View Booked Tickets");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    browseMovies(movies);
                    break;
                case 2:
                    bookTickets(movies, bookedTickets, scanner);
                    break;
                case 3:
                    viewBookedTickets(bookedTickets);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static ArrayList<Movie> createMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Matrix", "Lana Wachowski", 100));
        movies.add(new Movie("Inception", "Christopher Nolan", 80));
        movies.add(new Movie("Avatar", "James Cameron", 120));
        return movies;
    }

    public static void browseMovies(ArrayList<Movie> movies) {
        System.out.println("Available Movies:");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i).title + " (" + movies.get(i).director + ")");
        }
    }

    public static void bookTickets(ArrayList<Movie> movies, ArrayList<Ticket> bookedTickets, Scanner scanner) {
        System.out.print("Enter the number of the movie you want to book tickets for: ");
        int movieChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (movieChoice >= 1 && movieChoice <= movies.size()) {
            Movie selectedMovie = movies.get(movieChoice - 1);

            System.out.print("Enter the number of tickets to book: ");
            int numberOfTickets = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (numberOfTickets <= selectedMovie.availableSeats) {
                selectedMovie.availableSeats -= numberOfTickets;
                bookedTickets.add(new Ticket(selectedMovie.title, numberOfTickets));
                System.out.println("Tickets booked for " + selectedMovie.title);
            } else {
                System.out.println("Insufficient available seats.");
            }
        } else {
            System.out.println("Invalid movie choice.");
        }
    }

    public static void viewBookedTickets(ArrayList<Ticket> bookedTickets) {
        if (bookedTickets.isEmpty()) {
            System.out.println("No tickets have been booked yet.");
        } else {
            System.out.println("Booked Tickets:");
            for (Ticket ticket : bookedTickets) {
                System.out.println("Movie: " + ticket.movieTitle);
                System.out.println("Number of Tickets: " + ticket.numberOfTickets);
                System.out.println();
            }
        }
    }
}
