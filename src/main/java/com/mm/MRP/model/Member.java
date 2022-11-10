package com.mm.MRP.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Member {
	@Id
	@Pattern(regexp = "^\\d{10}$")
	private Integer memberId;
	
	@NotBlank
	@Size(min = 5, max = 15)
	@Pattern(regexp = "^[\\p{L} .'-]+$")
	private String name;
	
	@Email(message = "Please enter valid Email Id")
	private String emailId;
	
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9]*$")
	private String panNo;
	
	@NotBlank
	@Size(min = 10, max = 10, message = "Contact Number hould be 10 digits")
	private Integer contactNo;
	
	@DateTimeFormat(pattern = "yyyy-dd-mm")
	private Date dob;
	
	@OneToMany()
	private Address address;
	
	private Dependent dependent;
}
