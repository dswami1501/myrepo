package org.swami.config;

import org.springframework.batch.item.ItemProcessor;
import org.swami.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        //this below "if else" will work as a processor to filter out the persons from United States
        // and if we directly return person, all persons will be added
        /*if(customer.getCountry().equals("United States")) {
            return customer;
        }else{
            return null;
        }*/
        return customer;
    }
}
