package com.ust.digiUser.UserService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.digiUser.UserRepository.BankRepo;
import com.ust.digiUser.model.BankDetails;

import jakarta.transaction.Transactional;


@Service
public class BankService {
	@Autowired
	private BankRepo repo;
	public BankDetails fetchdata(BankDetails user)
	{
		return repo.save(user);
	}
	 public List<?> getByfamilyid(int id)
	   {
		   return repo.findByFamilyid(id);
	   }
   public List<BankDetails> getalldata() {
		
		return repo.findAll();
	}
   public BankDetails updatation (@RequestBody BankDetails user)
	 {
	   return repo.save(user);
	 
	 }
   @Transactional
   public void removeByfamilyid(int familyid) {
		
		repo.deleteByfamilyid(familyid);
		
	}
}
