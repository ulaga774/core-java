package com.xworkz.game.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class GameDto {
	
	private Long noOfDownloads;
	private String game_Name;
	private String game_Type;
	private Character symoble;
	private Float game_storge;

}
