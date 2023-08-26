package org.example;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailService implements NotificationService{
    @Override
    public void notify(String message) {
        System.out.println("Email: " + message);

    }
}
