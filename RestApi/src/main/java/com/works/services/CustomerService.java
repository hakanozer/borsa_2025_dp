package com.works.services;

import com.works.entities.Customer;
import com.works.entities.dto.CustomerAddDto;
import com.works.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    final CustomerRepository customerRepository;

    public Customer save(CustomerAddDto customerAddDto) {
        ModelMapper modelMapper = new ModelMapper();
        Customer customer = modelMapper.map(customerAddDto, Customer.class);
        customerRepository.save(customer);
        return customer;
    }

}
