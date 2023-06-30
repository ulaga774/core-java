package com.xworkz.avatarmovie.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class AvatarDto {
	
	private int id;
	private String cast;
	private int age;
	private String roleName;

}