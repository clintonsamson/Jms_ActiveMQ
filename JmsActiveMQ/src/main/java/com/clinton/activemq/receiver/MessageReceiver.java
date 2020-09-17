package com.clinton.activemq.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.clinton.activemq.model.Book;

@Component
public class MessageReceiver {

	private static final String MESSAGE_QUEUE = "message_queue";

	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(Book book) {
		System.out.println("Received " + book);
	}
}
