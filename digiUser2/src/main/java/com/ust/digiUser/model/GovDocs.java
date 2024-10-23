package com.ust.digiUser.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GovDocs {
	@Id
	@GeneratedValue
	private long govid;
	private  long aadhar;
	private String pan;
	private String license;
	private int familyid;

}
