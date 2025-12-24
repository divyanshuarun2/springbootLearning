package Dec232025part2.invoice;

import org.springframework.stereotype.Component;

@Component
public class OnlineInvoice implements Invoice {
    public OnlineInvoice() {
        System.out.println("OnlineInvoice Constructor");
    }
}
