package com.ust.digiUser.UserRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.digiUser.model.Certificates;

@Repository
public interface CertificateRepo extends JpaRepository<Certificates,Long> {
	List<?>findByFamilyid(Integer id);
	void deleteByfamilyid(int familyid);
}
