package Dec232025part2;

import dec232025.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
    @Autowired
    Invoice invoice;

    public Order() {
        System.out.println("Order constructor");
    }
}
