package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        NotificationService service = (WhatsAppService) context.getBean("whatsapp");
        service.notify("Your order has been placed successfully");

    }
}
