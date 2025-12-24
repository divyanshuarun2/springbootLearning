package dec232025;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Invoice {

    @Lazy
    @Autowired
    Order order;// it will proxy for some time until it is not used

    public Invoice() {
        System.out.println("inside Invoice constructor");
    }
}
