package me.progfrog.cache_study2.repository;

import me.progfrog.cache_study2.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
