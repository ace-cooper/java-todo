package com.acecooper.todolist.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserTraitRepository repository;

    public UserModel create(UserModel user) {
        System.out.println(user);
        return repository.save(user);
    }
}
