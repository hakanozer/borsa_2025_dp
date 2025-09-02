package com.works.restcontrollers;

import com.works.entities.Customer;
import com.works.entities.dto.CustomerAddDto;
import com.works.services.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerRestController {

    final private CustomerService customerService;

    @PostMapping("add")
    public Customer addCustomer(@Valid @RequestBody CustomerAddDto customerAddDto) {
        return customerService.save(customerAddDto);
    }

}

