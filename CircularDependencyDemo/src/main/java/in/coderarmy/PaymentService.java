package in.coderarmy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    // CircularDependency fixed by autowiring field injection
    @Autowired
    OrderService orderService;

//    PaymentService(OrderService orderService){
//        this.orderService=orderService;
//    }
    public void pay(){
        System.out.println("Payment Done" +
                "!");

        //Not its responsibility
        //orderService.getOrderDetails();
    }


}
