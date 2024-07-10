package me.progfrog.cache_study2.repository;

import me.progfrog.cache_study2.domain.entity.RedisHashUser;
import org.springframework.data.repository.CrudRepository;

public interface RedisHashUserRepository extends CrudRepository<RedisHashUser, Long> {
}
