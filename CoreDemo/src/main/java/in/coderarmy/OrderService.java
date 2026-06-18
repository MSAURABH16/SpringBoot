package in.coderarmy;

import in.coderarmy.notification.EmailService;
import in.coderarmy.notification.NotificationService;
import in.coderarmy.notification.SmsService;

public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notification){
        this.notification = notification;
    }
    // OrderService holds buisness logic
    // Dependencies are provided by external Sources
    // IOC achieved...
    public void placeOrder(){
        System.out.println("Order placed !");
        notification.sendNotification();
    }
}
