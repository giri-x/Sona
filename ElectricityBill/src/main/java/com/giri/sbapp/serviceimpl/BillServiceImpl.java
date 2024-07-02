package com.giri.sbapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giri.sbapp.model.Bill;
import com.giri.sbapp.repository.BillRepo;
import com.giri.sbapp.service.BillService;

@Service
public class BillServiceImpl implements BillService {
	
	@Autowired
	BillRepo repo;
	

	@Override
	public void addBill(Bill bill) {
		// TODO Auto-generated method stub
		repo.save(bill);

	}

	@Override
	public Bill getBill(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Bill> getAllBill() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateBill(Bill bill) {
		// TODO Auto-generated method stub
		repo.save(bill);

	}

	@Override
	public void deleteBill(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public List<Integer> getAllId() {
		// TODO Auto-generated method stub
		List<Integer> idList = repo.getIDList();
		return idList;
		
	}

}
