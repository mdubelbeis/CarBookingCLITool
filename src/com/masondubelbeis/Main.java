package com.masondubelbeis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        consolePrompt();
        int input = userInput();

        switch(input) {
            case 1:
                System.out.println("Booking car");
                break;
            case 2:
                System.out.println("Viewing All User Booked Cars");
                break;
            case 3:
                System.out.println("Viewing All Bookings");
                break;
            case 4:
                System.out.println("Viewing Available Cars");
                break;
            case 5:
                System.out.println("Viewing Available Electric Cars");
                break;
            case 6:
                System.out.println("Viewing All Users");
                break;
            case 7:
                System.out.println("Exiting Program");
                break;
            default:
                System.out.println("Not Valid Option");
        }

    }

    public static void consolePrompt() {
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