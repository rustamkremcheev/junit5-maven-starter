package com.is.junit.service;


import com.is.junit.dto.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserService {

    private final List<User> users = new ArrayList<>();

    public List<User> getAll() {
        return users;
        //return Collections.emptyList();
    }

    public boolean add(User user) {
        return users.add(user);
    }
}
