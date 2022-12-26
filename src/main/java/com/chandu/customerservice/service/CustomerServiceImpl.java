package com.chandu.customerservice.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.customerservice.dto.CustomerDto;
import com.chandu.customerservice.entity.CustomerEntity;
import com.chandu.customerservice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

@Autowired
public CustomerRepository customerRepository;
	
	@Override
	public CustomerDto createCustomer(CustomerDto customerDto) {
		logger.info("In the begining of createCustomer->name={}, age={}, active={}", customerDto.getName(), customerDto.getAge(), customerDto.isActive() );
		/**
		 * create -> save
	 	 * read -> find
		 * delete -> delete
		 */
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setName(customerDto.getName());
		customerEntity.setAge(customerDto.getAge());
		customerEntity.setActive(customerDto.isActive());
		customerRepository.save(customerEntity);
		customerDto.setId(customerEntity.getId());
	        logger.info("customer is created, end of createCustomer method  id={}", customerEntity.getId());
	        return customerDto;
	}
	@Override
	public List<CustomerDto> getAllCustomerDetail(){
		List<CustomerEntity> allCustomers = customerRepository.findAll();
		List<CustomerDto> customerDtos = new ArrayList<>();
		for(CustomerEntity customerEntity: allCustomers) {
			CustomerDto customerDto = new CustomerDto();
			customerDto.setAge(customerEntity.getAge());
			customerDto.setId(customerEntity.getId());
			customerDto.setName(customerDto.getName());
			customerDto.setActive(customerEntity.isActive());
			customerDtos.add(customerDto);	

		}
		return customerDtos;

	}

} 
