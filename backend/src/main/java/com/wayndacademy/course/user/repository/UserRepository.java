package com.wayndacademy.course.user.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wayndacademy.course.user.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);



}
