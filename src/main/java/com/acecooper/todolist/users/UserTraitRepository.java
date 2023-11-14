package com.acecooper.todolist.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTraitRepository extends JpaRepository<UserModel, String> {
    
}
