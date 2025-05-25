package com.masondubelbeis.user;

import java.util.UUID;

public class User {
    private static UUID id;
    private String firstName;
    private String lastName;
    private String email;

    public User(UUID id, String firstName, String lastName, String email) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public static void setId() {
        id = UUID.randomUUID();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
