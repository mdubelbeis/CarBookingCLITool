package com.masondubelbeis.user;

public class UserDAO {
    private static String[] users = {};

    public UserDAO() {

    }

    public static String[] getUsers() {
        return users;
    }

    public static void setUsers(String[] users) {
        UserDAO.users = users;
    }
}
