package com.ea.cs544.springjmsdemo.receiver;

import com.ea.cs544.springjmsdemo.model.Student;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver1 {

//    @JmsListener(destination = "${spring.jms.cs544Queue}")
//    public void receive(String message) {
//        System.out.println("Receiver 1 Message > "+message);
//    }

    @JmsListener(destination = "${spring.jms.cs544Queue}")
    public void receive(Student student) {
        System.out.println("Receiver 1 Message > "+student);
    }
}
