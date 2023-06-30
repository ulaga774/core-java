package com.xworkz.facebook.dto;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString

public class FaceBookDto {
	private Integer id;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=50)
	private String fristName;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=50)
	private String lastName;

	private Date DOB;
	@NotBlank
	@NotEmpty
	@Email
	private String email;
//	@NotBlank
//	@NotEmpty
//	@Size(min=3,max=50)
	private Long phoneNumber;
	@NotBlank
	@NotEmpty
	private String gender;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=16)
	private String password;

}
