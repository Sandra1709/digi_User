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
public class UserDetails {

	@Id
	@GeneratedValue
	private long id;
	private String username;
	private int age;
	private long  phone_no;
	private int familyid;
}
