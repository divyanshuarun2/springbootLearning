package dec232025;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Order {

    @Autowired
    Invoice invoice;

    public Order() {
        System.out.println("Inside Order Constructor");
    }
}
