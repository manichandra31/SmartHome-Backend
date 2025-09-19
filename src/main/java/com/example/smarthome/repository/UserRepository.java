package com.example.smarthome.repository;

import com.example.smarthome.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Extra query methods can go here if needed
}
