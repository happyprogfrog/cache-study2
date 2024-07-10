package me.progfrog.cache_study2;

import lombok.RequiredArgsConstructor;
import me.progfrog.cache_study2.repository.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@RequiredArgsConstructor
@SpringBootApplication
public class CacheStudy2Application implements ApplicationRunner {

	private final UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CacheStudy2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// userRepository.save(User.builder().name("aaa").email("a@email.com").build());
		// userRepository.save(User.builder().name("bbb").email("b@email.com").build());
		// userRepository.save(User.builder().name("ccc").email("c@email.com").build());
	}
}
