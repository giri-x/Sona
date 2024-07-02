package com.giri.sbapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giri.sbapp.model.Customer;
import com.giri.sbapp.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {
	@Autowired
	CustomerServiceImpl service;

	@PostMapping
	public String insertCustomer(@RequestBody Customer cst) {
		
		String msg="";
		try {
			service.addCustomer(cst);
			msg="Success";
			
		}catch(Exception e) {
			e.printStackTrace();
			msg="Failre";
		}
		return msg;
	}
		
		@GetMapping("{id}")
		public Customer getCustomerById (@PathVariable("id") int id) {
			return service.getCustomer(id);
		}
		@GetMapping("/all")
		public List<Customer> getCustomers () {
			return service.getAllCustomer();
		}
		
		@PutMapping
		public String updateCustomer(@RequestBody Customer cst) {
			
			String msg="";
			try {
				service.updateCustomer(cst);
				msg="Success";
				
			}catch(Exception e) {
				e.printStackTrace();
				msg="Failre";
			}
			return msg;
		}
		
		@DeleteMapping("{id}")
		public String deleteCustomerById(@PathVariable("id") int id) {
			String msg="";
			try {
				service.deleteCustomerId(id);
				msg="Success";
				
			}catch(Exception e) {
				e.printStackTrace();
				msg="Failre";
			}
			return msg;
			
			
		}

}
