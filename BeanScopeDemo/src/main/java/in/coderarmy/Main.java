package in.coderarmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order1 = context.getBean(OrderService.class);
//        OrderService order2 = context.getBean(OrderService.class);
//
//        System.out.println(order1==order2);
    }
}

/*
 * Singleton --- Eager initialization same object for all (one time)  ---> one object for one BeanDefination
 * Prototype --- Lazy initialization  new object created for every dependent object
 */

/*
 * Lazy init = bean created when demanded
 * Eager init = bean created eagerly
 */


// Singleton --- by default Eager but may be changed to Lazy
// Prototype --- Lazy and cant be Eager



/*
The problem of circular Dependency can be solved by using @Lazy Annotation
 */