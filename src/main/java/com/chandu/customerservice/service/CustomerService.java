package com.chandu.customerservice.service;

import java.util.List;

import com.chandu.customerservice.dto.CustomerDto;

public interface CustomerService {
	CustomerDto createCustomer(CustomerDto customerDto);	
	List<CustomerDto> getAllCustomerDetail();
	}


