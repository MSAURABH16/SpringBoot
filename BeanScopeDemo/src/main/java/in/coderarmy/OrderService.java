package in.coderarmy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class OrderService {

    OrderService(){
        System.out.println("orderservice created");
    }
    public void placeOrder(){
        System.out.println("Order Paced");
    }
}
