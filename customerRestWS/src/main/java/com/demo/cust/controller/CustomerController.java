package com.demo.cust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cust.entity.Customer;
import com.demo.cust.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<com.demo.cust.model.Customer> getEmployeeList() throws Exception {
		List<Customer> customersList = customerService.getCustomers();
		com.demo.cust.model.Customer customer = new com.demo.cust.model.Customer();
		customer.setCustomerList(customersList);
		return new ResponseEntity<com.demo.cust.model.Customer>(customer, HttpStatus.OK);
	}

	@RequestMapping(value = "/customers/{customerID}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<com.demo.cust.model.Customer> getEmployee(@PathVariable int customerID) throws Exception {
		Customer customer = customerService.getCustomer(customerID);
		com.demo.cust.model.Customer customerObj = new com.demo.cust.model.Customer();
		customerObj.setCustomer(customer);
		return new ResponseEntity<com.demo.cust.model.Customer>(customerObj, HttpStatus.OK);
	}
}
