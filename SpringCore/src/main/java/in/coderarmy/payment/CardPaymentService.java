package in.coderarmy.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class CardPaymentService implements PaymentService {
    @Override
    public void payment(){
        System.out.println("Paid via Card");
    }
}
