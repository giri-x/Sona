package com.giri.sbapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giri.sbapp.model.Customer;
import com.giri.sbapp.repository.CustomerRepo;
import com.giri.sbapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo repo;

	@Override
	public void addCustomer(Customer cst) {
		// TODO Auto-generated method stub
		repo.save(cst);

	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateCustomer(Customer cst) {
		// TODO Auto-generated method stub
		repo.save(cst);

	}

	@Override
	public void deleteCustomerId(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

}
