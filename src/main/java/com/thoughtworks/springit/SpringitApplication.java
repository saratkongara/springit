package com.thoughtworks.springit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.thoughtworks.springit.domain.Comment;
import com.thoughtworks.springit.domain.Link;
import com.thoughtworks.springit.repository.CommentRepository;
import com.thoughtworks.springit.repository.LinkRepository;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link = new Link("Getting Started with Spring Boot 2", "https://spring.io");
			linkRepository.save(link);
			
			Comment comment = new Comment("This framework is awesome", link);
			commentRepository.save(comment);
			link.addComment(comment);
			
			System.out.println("We just inserted a link and a comment");
		};
	}
}
