package com.ust.digiUser.UserService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ust.digiUser.UserRepository.UserRepo;
import com.ust.digiUser.model.UserDetails;

import jakarta.transaction.Transactional;


@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	public UserDetails fetchdata(UserDetails user)
	{
		return repo.save(user);
	}
   public List<?> getByfamilyid(int id)
   {
	   return repo.findByFamilyid(id);
   }
   public List<UserDetails> getalldata() {
		
		return repo.findAll();
	}
   public UserDetails updatation ( UserDetails user)
	 {
	   return repo.save(user);
	 
	 }
   @Transactional
   
   public void removeByfamilyid(int familyid) {
		
		repo.deleteByfamilyid(familyid);
		
	}
}
