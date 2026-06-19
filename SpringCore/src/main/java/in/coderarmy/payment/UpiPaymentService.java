package in.coderarmy.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class UpiPaymentService implements PaymentService{
    @Override
    public void payment(){
        System.out.println("Paid via UPI");
    }
}
