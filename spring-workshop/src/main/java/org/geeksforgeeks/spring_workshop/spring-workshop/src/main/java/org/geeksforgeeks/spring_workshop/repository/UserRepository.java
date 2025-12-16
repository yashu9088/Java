package org.geeksforgeeks.spring_workshop.repository;

import org.geeksforgeeks.spring_workshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
