package com.ea.cs544.springjmsdemo.sender;

import com.ea.cs544.springjmsdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value(value = "${spring.jms.cs544Queue}")
    private String queueName;

    public void send(String message) {
        jmsTemplate.convertAndSend(queueName, message);
    }

//    public void send(Student student) {
//        MessageCreator messageCreator = new MessageCreator() {
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                return session.createObjectMessage(student);
//            }
//        };
//        jmsTemplate.send(queueName, messageCreator);
//    }

    public void send(Student student) {
        MessageCreator messageCreator = session -> session.createObjectMessage(student);
        jmsTemplate.send(queueName, messageCreator);
    }
}
