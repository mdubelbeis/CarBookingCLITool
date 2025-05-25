package com.masondubelbeis.booking;


public class BookingDAO {
    private static Booking[] bookings = new Booking[3];


    public static Booking[] getBookings() {
        return bookings;
    }

    public static void setBookings(Booking booking) {
        bookings[0] = booking;
    }
}
