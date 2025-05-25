package com.masondubelbeis;

import com.masondubelbeis.booking.Booking;
import com.masondubelbeis.booking.BookingService;
import com.masondubelbeis.car.Car;
import com.masondubelbeis.user.User;
import com.masondubelbeis.user.UserService;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    private static int input;

    public static void main(String[] args) {

        do {
            consolePrompt();
            input = userInput();

            if (input == 7) {
                System.exit(0);
                return;
            }
            System.out.println();
        } while (input > 7);


        switch(input) {
            case 1:
                bookingAppointment();
                break;
            case 2:
                System.out.println("Viewing All User Booked Cars");
                break;
            case 3:
                viewBookings();
                break;
            case 4:
                System.out.println("Viewing Available Cars");
                break;
            case 5:
                System.out.println("Viewing Available Electric Cars");
                break;
            case 6:
                viewAllUsers();
                break;
            case 7:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Not Valid Option");
        }

    }

    private static void viewAllUsers() {
        System.out.println("Viewing All Users");
        System.out.println("=================");
        User[] users = UserService.getUsers();

        if (users.length == 0) {
            System.out.println("No Stored Users...");
        } else {
            for (User usr: users) {
                System.out.println(usr);
            }
        }
    }

    private static void viewBookings() {
        System.out.println("Viewing All Bookings");
        Booking[] bookings = BookingService.getBookings();

        if (bookings.length == 0) {
            System.out.println("No Bookings...");
        } else {
            for (Object booking: bookings) {
                System.out.println(booking);
            }
        }
    }

    private static void bookingAppointment() {
        System.out.println("Booking car");
        System.out.println("===========");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your first name?: ");
        String firstName = scanner.nextLine();

        System.out.print("What is your last name?: ");
        String lastName = scanner.nextLine();

        System.out.print("What is your email?: ");
        String email = scanner.nextLine();

        User user = new User(UUID.randomUUID(), firstName, lastName, email);

        System.out.println("Car Details");
        System.out.println("===========");

        System.out.print("What is your car's registration number?: ");
        String regNumber = scanner.nextLine();

        BigDecimal rentalPricePerDay = BigDecimal.valueOf(29.99);
        System.out.println("Rental Price: $" + rentalPricePerDay + "/day");

        System.out.print("Car brand?: ");
        String brand = scanner.nextLine();

        System.out.print("Electric?: ");
        boolean isElectric = scanner.nextBoolean();

        Car car = new Car(regNumber, rentalPricePerDay, brand, isElectric);

        Booking book = new Booking(user, car, false);
        BookingService.saveBooking(book);

        for (Booking booking: BookingService.getBookings()) {
            System.out.println(booking);
        }

        scanner.close();
    }

    public static void consolePrompt() {
        System.out.println();
        System.out.println("1 - Book Car");
        System.out.println("2 - View All User Booked Cars");
        System.out.println("3 - View All Bookings");
        System.out.println("4 - View Available Cars");
        System.out.println("5 - View Available Electric Cars");
        System.out.println("6 - View All Users");
        System.out.println("7 - Exit");
        System.out.print("Please Enter a Valid Input (1-7): ");
    }

    public static int userInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}