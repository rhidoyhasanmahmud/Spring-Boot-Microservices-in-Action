package com.codemechanix.user.repo;

import com.codemechanix.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserId(Long userId);
}
