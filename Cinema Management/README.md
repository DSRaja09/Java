# Cinema Seat Management System

## Overview
A simple Java-based console application that simulates a concurrent cinema seat booking system. The project demonstrates multithreading and synchronization in Java by simulating multiple customers attempting to book seats for various movies simultaneously.

## Features
- **Concurrent Booking:** Simulates multiple customers booking seats at the same time using Java `Thread` and `Runnable`.
- **Thread Safety:** Uses a `synchronized` block to ensure that a specific seat for a specific movie cannot be double-booked.
- **Dynamic Pricing:** Calculates ticket prices based on the row and column of the seat chosen.
- **Receipt Generation:** Automatically generates a detailed receipt upon a successful booking.

## Project Structure
- `CinemaManagment.java`: The main entry point. Simulates concurrent customer requests by spinning up multiple threads.
- `BookASeat.java`: Implements `Runnable` and contains the core logic for validating seats, checking availability, booking, and generating receipts.
- `BookRegistry.java`: A simple in-memory repository (HashMap) mapping movie names to their IDs.
- `Movie.java`: Represents a movie entity with properties like name and ID.
- `Seat.java`: An abstract class defining basic seat properties (Currently unused in this implementation, kept for future extensibility).

## How to Run
1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Navigate to the project directory in your terminal.
3. Compile the Java files:
   ```bash
   javac *.java
   ```
4. Run the main application class:
   ```bash
   java CinemaManagment
   ```

## Future Improvements (Evaluation Notes)
While this project effectively demonstrates Java concurrency basics, there is room for improvement:
- **Object-Oriented Refactoring:** Integrate the currently unused `Seat.java` class to handle seat states instead of relying on string parsing and hash codes.
- **Bug Fix in Movie Registration:** Fix the mapping logic in `Movie.java`. Currently, `setHash()` maps `movieId` to `movieName`, which is backwards compared to `BookRegistry`'s `movieName` to `movieId` structure.
- **Error Handling:** Add better validation to gracefully handle requests for movies that do not exist in the registry (e.g., "Inception").
- **Decoupled Pricing:** Move the price calculation logic out of the `BookASeat` class to follow the Single Responsibility Principle.
