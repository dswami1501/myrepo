package org.swami.config;

import org.springframework.batch.item.ItemProcessor;
import org.swami.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
            return customer;
    }
}
