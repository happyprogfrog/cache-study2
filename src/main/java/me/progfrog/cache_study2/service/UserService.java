package me.progfrog.cache_study2.service;

import lombok.RequiredArgsConstructor;
import me.progfrog.cache_study2.domain.entity.User;
import me.progfrog.cache_study2.repository.UserRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public User getUser(final Long id) {
        return userRepository.findById(id).orElseThrow();
    }
}
