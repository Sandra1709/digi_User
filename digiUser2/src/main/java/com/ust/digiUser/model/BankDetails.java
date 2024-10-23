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
public class BankDetails {
	
	@Id
	@GeneratedValue
	private long bankid;
	private String bankname;
	private long accno;
	private String ifscode;
	private int familyid;


}
