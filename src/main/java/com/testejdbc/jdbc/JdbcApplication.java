package com.testejdbc.jdbc;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {
		MessageRepository messageRepository = new MessageRepository();
		//messageRepository.inserirMessage(new Message(3l,"Terceira Mensagem"));
		//messageRepository.update(new Message(1l,"Alterado o valor da primeira mensagem"));
		messageRepository.delete(2l);
		List<Message> messages = messageRepository.findAll();
		messages.stream().forEach(System.out::println);
	}
}
