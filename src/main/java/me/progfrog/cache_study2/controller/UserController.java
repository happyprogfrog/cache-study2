package me.progfrog.cache_study2.controller;

import lombok.RequiredArgsConstructor;
import me.progfrog.cache_study2.domain.entity.RedisHashUser;
import me.progfrog.cache_study2.domain.entity.User;
import me.progfrog.cache_study2.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable(name = "id") Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/redishash-users/{id}")
    public RedisHashUser getUser2(@PathVariable(name = "id") Long id) {
        return userService.getUser2(id);
    }

    @GetMapping("/new-users/{id}")
    public User getUser3(@PathVariable(name = "id") Long id) {
        return userService.getUser3(id);
    }
}
