package com.techelevator.crm;
import com.techelevator.crm.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class CustomerTest {
    @Test
    public void BalanceDue() {
        Customer customer1 = new Customer("Nigus", "Solomon", "6140000000");
        Map<String, Double> service = new HashMap<String, Double>();
        service.put("Waking Fee", 9.99);
        service.put("Card", 6.99);

        double totalBalance = customer1.getBalanceDue(service);
        Assertions.assertEquals(16.98, totalBalance);
    }
}
