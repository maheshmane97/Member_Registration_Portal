package com.mm.MRP.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
public class Claim {
	@Id
	@Pattern(regexp = "^([0]\\d{9}|[0-9]\\d*)$")
	private Integer claimId;
	
	//Date of Admission
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date doa;
	
	//Date of Discharge
		@DateTimeFormat(pattern = "yyyy-mm-dd")
		private Date dod;
	
	@NotBlank
	@Size(min = 5, max = 15)
	private String providerName;
	
	@NotNull
	private String billamount;
}
