package com.masondubelbeis.booking;

import java.util.List;

public class BookingService {
    public static Booking[] getBookings() {
        return BookingDAO.getBookings();
    }

    public static void saveBooking(Booking booking) {
        BookingDAO.setBookings(booking);
    }
}
