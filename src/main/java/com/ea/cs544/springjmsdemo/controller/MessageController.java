package com.ea.cs544.springjmsdemo.controller;

import com.ea.cs544.springjmsdemo.Student;
import com.ea.cs544.springjmsdemo.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private Sender sender;

    @GetMapping("/message/{message}")
    public void sendMessage(@PathVariable String message) {
        sender.send(message);
    }

    @GetMapping("/message")
    public void sendMessage() {
        sender.send(new Student("Sanjaya", 35));
    }
}
