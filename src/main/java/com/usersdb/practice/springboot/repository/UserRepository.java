package com.usersdb.practice.springboot.repository;

import com.usersdb.practice.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
