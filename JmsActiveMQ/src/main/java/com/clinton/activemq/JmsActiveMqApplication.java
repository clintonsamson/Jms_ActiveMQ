package com.clinton.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import com.clinton.activemq.model.Book;

@SpringBootApplication
@EnableJms
public class JmsActiveMqApplication {

	private static final String MESSAGE_QUEUE = "message_queue";

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JmsActiveMqApplication.class, args);

		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

		for (int i = 1; i <= 10; i++) {
			Book book = new Book();
			book.setBookID(i);
			book.setBookName("The Alchemist");

			// Send a message
			System.out.println("Sending a book " + i);
			jmsTemplate.convertAndSend(MESSAGE_QUEUE, book);
		}
	}

}
