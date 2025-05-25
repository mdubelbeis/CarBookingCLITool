package com.masondubelbeis.user;

public class UserService {

    public static String[] getUsers() {
        return UserDAO.getUsers();

    }
}
