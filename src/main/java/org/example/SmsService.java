package org.example;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsService implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("Text: " + message);

    }
}
