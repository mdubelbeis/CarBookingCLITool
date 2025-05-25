package com.masondubelbeis.booking;

import com.masondubelbeis.car.Car;
import com.masondubelbeis.user.User;

import java.util.UUID;

public class Booking {
    private static UUID bookID;
    private User user;
    private Car car;
    private boolean isCancelled;

    public Booking(User user, Car car, boolean isCancelled) {
        this.bookID = UUID.randomUUID();
        this.user = user;
        this.car = car;
        this.isCancelled = isCancelled;
    }

    public static UUID getBookID() {
        return bookID;
    }

    public static void setBookID(UUID bookID) {
        Booking.bookID = bookID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "user=" + user +
                ", car=" + car +
                ", isCancelled=" + isCancelled +
                '}';
    }
}
