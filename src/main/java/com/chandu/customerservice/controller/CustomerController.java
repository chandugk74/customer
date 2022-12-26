package com.chandu.customerservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.customerservice.dto.CustomerDto;
import com.chandu.customerservice.entity.CustomerEntity;
import com.chandu.customerservice.service.CustomerService;



@RestController
@RequestMapping("/customers")
public class CustomerController {

	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customerService;
	
//	creating a customer
	@PostMapping
	public ResponseEntity<CustomerDto> create(@RequestBody CustomerDto customerDto) {
		logger.info("we are creating a customer: begining of method ->name={}, age={}, active={}", customerDto.getName(), customerDto.getAge(), customerDto.isActive());
		CustomerDto customer =customerService.createCustomer(customerDto);
		logger.info("customer created-end of create method");
		return ResponseEntity.ok(customer);
	}
	//retrieve customer
	@GetMapping
	public ResponseEntity<List<CustomerDto>> getAllCustomerDetail(){
		logger.info("in the begining of get all customer method");
		List<CustomerDto> allCustomerDetail = customerService.getAllCustomerDetail();
		return ResponseEntity.ok(allCustomerDetail);
	}
}
