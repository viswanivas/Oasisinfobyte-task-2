package Intern;

import java.util.Scanner;

class ReservationSystem {
 public void makeReservation() {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter your basic details:");
     String basicDetails = scanner.nextLine();
     
     
     int trainNumber = 123; 
     String trainName = "Sample Train";
     
     System.out.println("Enter class type:");
     String classType = scanner.nextLine();
     
     System.out.println("Enter date of journey:");
     String journeyDate = scanner.nextLine();
     
     System.out.println("Enter departure place:");
     String departurePlace = scanner.nextLine();
     
     System.out.println("Enter destination:");
     String destination = scanner.nextLine();
     
 
     System.out.println("Reservation successful!");
 }
 
 // Method for canceling a reservation
 public void cancelReservation() {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter your PNR number:");
     String pnrNumber = scanner.nextLine();
     

     System.out.println("Your reservation has been cancelled.");
 }
}

//Main class representing the Online Reservation System
public class RservationSystem {
 // Main method
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     ReservationSystem reservationSystem = new ReservationSystem();
     
     // Login
     System.out.println("Welcome to the Online Reservation System!");
     System.out.println("Please enter your login credentials:");
     System.out.print("Username: ");
     String username = scanner.nextLine();
     System.out.print("Password: ");
     String password = scanner.nextLine();
     
     // Assuming simple authentication for demonstration purposes
     if (username.equals("admin") && password.equals("password")) {
         System.out.println("Login successful!");
         // Main menu
         while (true) {
             System.out.println("\nMain Menu:");
             System.out.println("1. Make Reservation");
             System.out.println("2. Cancel Reservation");
             System.out.println("3. Logout");
             System.out.print("Enter your choice: ");
             int choice = scanner.nextInt();
             scanner.nextLine(); // Consume newline
             
             switch (choice) {
                 case 1:
                     reservationSystem.makeReservation();
                     break;
                 case 2:
                     reservationSystem.cancelReservation();
                     break;
                 case 3:
                     System.out.println("Logged out successfully.");
                     return;
                 default:
                     System.out.println("Invalid choice. Please try again.");
             }
         }
     } else {
         System.out.println("Invalid username or password. Please try again.");
     }
 }
}

