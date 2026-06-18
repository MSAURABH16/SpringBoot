package in.coderarmy;

import in.coderarmy.notification.NotificationService;

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
