package me.progfrog.cache_study2.domain.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@RedisHash(value = "redishash-user", timeToLive = 30L)
public class RedisHashUser {
    @Id
    private Long id;
    private String name;
    @Indexed
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}