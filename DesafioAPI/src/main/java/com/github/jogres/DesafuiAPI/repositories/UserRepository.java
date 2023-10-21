package com.github.jogres.DesafioAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.jogres.DesafioAPI.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
