package com.ust.digiUser.UserRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.digiUser.model.GovDocs;

@Repository
public interface GovDocRepo extends JpaRepository<GovDocs, Long>{
	List<?>findByFamilyid(Integer id);
	void deleteByfamilyid(int familyid);

}
