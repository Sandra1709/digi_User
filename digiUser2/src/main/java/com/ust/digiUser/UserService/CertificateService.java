package com.ust.digiUser.UserService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.digiUser.UserRepository.CertificateRepo;
import com.ust.digiUser.model.Certificates;

import jakarta.transaction.Transactional;

@Service
public class CertificateService {
	@Autowired
	private CertificateRepo repo;
	public Certificates fetchdata(Certificates user)
	{
		return repo.save(user);
	}
	 public List<?> getByfamilyid(int id)
	   {
		   return repo.findByFamilyid(id);
	   }
   public List<Certificates> getalldata() {
	
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
