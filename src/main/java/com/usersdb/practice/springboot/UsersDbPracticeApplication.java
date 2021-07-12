package com.usersdb.practice.springboot;

import com.usersdb.practice.springboot.model.User;
import com.usersdb.practice.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersDbPracticeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UsersDbPracticeApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Carter", "Walsh", "Email.here"));
		this.userRepository.save(new User("Andrea", "Espinosa", "Another.email.here"));
		this.userRepository.save(new User("Rocket", "Wayne", "Email@jerk.com"));
	}
}
