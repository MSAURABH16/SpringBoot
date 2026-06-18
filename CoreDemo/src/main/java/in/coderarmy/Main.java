package in.coderarmy;

import in.coderarmy.notification.EmailService;
import in.coderarmy.notification.NotificationService;
import in.coderarmy.notification.PopUpNotificationService;

public class Main {
    public static void main(String[] args) {
        //This order service is dependent on OrderService class-- it is a dependency
//        OrderService order = new OrderService();
//        order.placeOrder();

        NotificationService notification = new PopUpNotificationService();// Here notification object is created in main and provided  to orderService
        OrderService order = new OrderService(notification); // Dependencies injected
        order.placeOrder();


        //Tightly coupled -- dependency of any class or resource is need to be pre defined
        //we need to give all info
    }
}

// A class should ask what it needs and not create it by itself
//- ------- Dependency Injection-------

// IOC ----> Inversion Of Control
// It is a priciple achieved by DI