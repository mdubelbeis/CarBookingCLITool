package com.masondubelbeis.user;

import java.util.Scanner;
import java.util.UUID;

public class UserArrayDataAccessService implements UserDAO {
    private static User[] users = {};

    static {
        Scanner scanner = new Scanner("");
        users =
    }

    @Override
    public User[] getUsers() {
        return users;
    }

    public static void setUsers(User[] users) {
        UserArrayDataAccessService.users = users;
    }


}
