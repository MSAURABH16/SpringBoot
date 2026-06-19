package in.coderarmy;
import in.coderarmy.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService service;
    public void placeOrder(){
        service.payment();
        System.out.println("Order placed");
    }
    @Autowired
    OrderService(@Qualifier("cardPaymentService") PaymentService service){
        this.service = service;
    }
}

// Three types of dependency injections
/**
 * Constructor based
 * Setter based
 * Field injection
 */
