package org.swami.config;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.swami.entity.Customer;
import org.swami.repository.CustomerRepository;

import java.util.List;

@Component
public class CustomerItemWriter implements ItemWriter<Customer> {
    @Autowired
    private CustomerRepository repository;

    @Override
    public void write(List<? extends Customer> list) throws Exception {
        System.out.println("Writer Thread "+Thread.currentThread().getName());
        repository.saveAll(list);
    }
}
