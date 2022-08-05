package com.ea.cs544.springjmsdemo.receiver;

import com.ea.cs544.springjmsdemo.Student;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver2 {

//    @JmsListener(destination = "${spring.jms.cs544Queue}")
//    public void receive(String message) {
//        System.out.println("Receiver 2 Message > "+message);
//    }

    @JmsListener(destination = "${spring.jms.cs544Queue}")
    public void receive(Student student) {
        System.out.println("Receiver 2 Message > "+student);
    }
}
