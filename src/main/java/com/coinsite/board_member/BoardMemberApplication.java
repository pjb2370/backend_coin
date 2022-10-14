package com.coinsite.board_member;

import com.coinsite.board_member.config.RestTemplateClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(RestTemplateClient.class)
@SpringBootApplication
public class BoardMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardMemberApplication.class, args);
	}

}
