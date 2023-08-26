package org.example;

import org.springframework.stereotype.Component;

@Component("whatsapp")
public class WhatsAppService implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("Message: " + message);

    }
}
