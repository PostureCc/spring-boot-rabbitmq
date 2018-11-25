package com.chan.springbootdemo.listener;

import com.chan.springbootdemo.po.Mail;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class TopicListener2 {
	
	@RabbitListener(queues = "topicqueue2")
	public void displayTopic(Mail mail) throws IOException {
		System.out.println("从topicqueue2取出消息"+mail.toString());
		}
}
