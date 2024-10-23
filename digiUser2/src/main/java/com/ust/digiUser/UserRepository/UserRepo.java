package com.ust.digiUser.UserRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.digiUser.model.UserDetails;



@Repository
public interface UserRepo  extends JpaRepository<UserDetails, Long>{
	
	List<?>findByFamilyid(Integer id);
    void deleteByfamilyid(int familyid);
}
