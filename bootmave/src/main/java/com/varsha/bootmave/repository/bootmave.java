package com.varsha.bootmave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varsha.bootmave.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
