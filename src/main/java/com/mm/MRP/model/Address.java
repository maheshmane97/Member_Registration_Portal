package com.mm.MRP.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

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
public class Address {

	@NotBlank
	private String village;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	@NotBlank
	private String country;
}
