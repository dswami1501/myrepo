package org.swami.config;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.swami.entity.Customer;
import org.swami.repository.CustomerRepository;

import java.util.List;


@Component
public class CustomerWriter implements ItemWriter<Customer> {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void write(List<? extends Customer> list) throws Exception {
        System.out.println("Thread Name : -"+Thread.currentThread().getName());
        customerRepository.saveAll(list);
    }
}
