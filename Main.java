import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== HOTEL RESERVATION SYSTEM =====");


        System.out.print("Enter Hotel Name: ");
        String hotelName = sc.nextLine();

        System.out.print("Enter Guest Name: ");
        String guestName = sc.nextLine();

        System.out.print("Enter Guest Address: ");
        String guestAddress = sc.nextLine();

        System.out.print("Enter Reservation Date: ");
        String reservationDate = sc.nextLine();

        System.out.print("Enter Start Date: ");
        String startDate = sc.nextLine();

        System.out.print("Enter End Date: ");
        String endDate = sc.nextLine();

        System.out.print("Enter Room Number: ");
        int roomNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Room Type: ");
        String roomType = sc.nextLine();

        System.out.print("Enter Room Price Per Night: ");
        double roomPrice = sc.nextDouble();

        System.out.print("Enter Number of Nights: ");
        int nights = sc.nextInt();

        System.out.print("Enter Credit Card Number: ");
        long cardNumber = sc.nextLong();

        double totalBill = roomPrice * nights;

        System.out.println("\n===== BOOKING CONFIRMATION =====");

        System.out.println("Hotel Name      : " + hotelName);
        System.out.println("Guest Name      : " + guestName);
        System.out.println("Guest Address   : " + guestAddress);
        System.out.println("Reservation Date: " + reservationDate);
        System.out.println("Start Date      : " + startDate);
        System.out.println("End Date        : " + endDate);
        System.out.println("Room Number     : " + roomNumber);
        System.out.println("Room Type       : " + roomType);
        System.out.println("Price Per Night : PKR " + roomPrice);
        System.out.println("Total Nights    : " + nights);
        System.out.println("Card Number     : " + cardNumber);
        System.out.println("Total Bill      : PKR " + totalBill);

        System.out.println("\nRoom Available!");
        System.out.println("Guest Checked In!");
        System.out.println("Booking Successful!");

        sc.close();
    }
}