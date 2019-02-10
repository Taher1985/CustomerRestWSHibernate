package com.demo.cust.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Customer {
	@JsonProperty("ID")
	private int id;

	@JsonProperty("First Name")
	private String firstName;

	@JsonProperty("Last Name")
	private String lastName;

	@JsonProperty("Email")
	private String email;

	@JsonProperty("Customer List")
	private List<com.demo.cust.entity.Customer> customerList;

	@JsonProperty("Customer")
	private com.demo.cust.entity.Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<com.demo.cust.entity.Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<com.demo.cust.entity.Customer> customerList) {
		this.customerList = customerList;
	}

	public com.demo.cust.entity.Customer getCustomer() {
		return customer;
	}

	public void setCustomer(com.demo.cust.entity.Customer customer) {
		this.customer = customer;
	}

}
