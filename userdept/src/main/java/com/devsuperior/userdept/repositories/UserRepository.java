package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
