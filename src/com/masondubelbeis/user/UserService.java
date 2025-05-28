package com.masondubelbeis.user;

public class UserService {

    public static User[] getUsers() {
        return UserArrayDataAccessService.getUsers();
    }


}
