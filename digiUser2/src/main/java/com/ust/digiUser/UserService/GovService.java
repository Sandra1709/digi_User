package com.ust.digiUser.UserService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ust.digiUser.UserRepository.GovDocRepo;
import com.ust.digiUser.model.GovDocs;

import jakarta.transaction.Transactional;


@Service
public class GovService {
	@Autowired
	private GovDocRepo repo;
	public GovDocs fetchdata(GovDocs user)
	{
		return repo.save(user);
	}
	 public List<?> getByfamilyid(int id)
	   {
		   return repo.findByFamilyid(id);
	   }
   public List<GovDocs> getalldata() {
	
		return repo.findAll();
	}
//   public GovDocs
//	   return repo.save(user);
//	 
//	 }
   @Transactional
   public void remByfamilyid(int familyid) {
		
		repo.deleteByfamilyid(familyid);
		
	}
	

}
