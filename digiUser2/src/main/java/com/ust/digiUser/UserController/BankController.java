package com.ust.digiUser.UserController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.digiUser.UserService.BankService;
import com.ust.digiUser.model.BankDetails;


@RestController
@RequestMapping("/bank")
public class BankController {
	@Autowired 
	private BankService serv;
	
	 @PostMapping("/addData")
	 public BankDetails getdata(@RequestBody BankDetails user)
	 {
		 return serv.fetchdata(user);
	 }
	 
	 
	 @GetMapping("/allinfo")//all datas will be accessed
		public List<BankDetails> getData()
		{
			return serv.getalldata();
		}
	 @GetMapping("/getid/{familyid}")
	 public List<?> getId(@PathVariable int familyid)
	 {
		 return serv.getByfamilyid(familyid);
	
	 }
	 @PutMapping("/update")
	 public  ResponseEntity<BankDetails> updateData(@RequestBody BankDetails user)
	 
	 { 
		 
		 
				return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(user);
			
		 
		 
	 }
	 
	 
	 @DeleteMapping(value="/delete/{familyid}")
		public void  deletePerson(@PathVariable int familyid)
		{
			serv.removeByfamilyid(familyid);
		    
				
		}

}
