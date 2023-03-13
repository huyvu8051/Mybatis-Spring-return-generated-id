package io.huyvu.mybatisreturnid.MybatisSpringReturnGeneratedId;

import io.huyvu.mybatisreturnid.MybatisSpringReturnGeneratedId.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
@SpringBootApplication
public class MybatisSpringReturnGeneratedIdApplication {
	private final Repository repo;

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringReturnGeneratedIdApplication.class, args);
	}

	@Bean
	ApplicationRunner startup(){
		return (args)->{
			long generatedID = repo.insertStudent("Huy", 18);
			System.out.println("generated id: " + generatedID);
		};
	}

}
