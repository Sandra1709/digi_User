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

public class Certificates {
	@Id
	@GeneratedValue
	private long certid;
	private String certiname;
	private long certino;
	private int familyid;

}