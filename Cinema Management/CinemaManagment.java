import java.util.*;


public class CinemaManagment {
    public static void main(String[] args) {
        System.out.println("--- Starting Theater Booking System --- \n");

        // Simulate concurrent customer requests using Threads
        Thread customer1 = new Thread(new BookASeat("Alice", "C3", "Interseller"));
        Thread customer2 = new Thread(new BookASeat("Bob", "E3", "Inception")); // No such movie 
        Thread customer3 = new Thread(new BookASeat("Charlie", "C3", "Interseller")); // same seat
        Thread customer4 = new Thread(new BookASeat("Diana", "A1", "1917")); 

        // Start all booking processes simultaneously
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();

        Movie new_movie = new Movie("Harry Potter", "Fa 987"); // Movie Added
        new_movie.setHash();
        Thread customer5 = new Thread(new BookASeat("Bruce", "C4", "Harry Potter")); // Watching the new Movie
        Thread customer6 = new Thread(new BookASeat("Clark", "A7", "1917")); // Invalid Seat
        
        customer5.start();
        customer6.start();

    }
}