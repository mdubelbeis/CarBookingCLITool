package com.masondubelbeis.user;

import java.util.UUID;

public class UserDAO {
    private static User[] users = {};

    static {
        users = new User[]{
                new User(UUID.randomUUID(), "Mason", "Dubelbeis", "Mason.Dubelbeis@gmail.com"),
                new User(UUID.randomUUID(), "Kayla", "Dubelbeis", "Kayla.Dubelbeis@gmail.com"),
        };
    }

    public static User[] getUsers() {
        return users;
    }

    public static void setUsers(User[] users) {
        UserDAO.users = users;
    }


}
