package com.xworkz.modifier;

import com.xworkz.modifier.dto.ModifierDto;

public class ModifierRunner extends ModifierDto {

	public static void main(String[] args) {
		ModifierDto dto1 = new ModifierDto();
		System.out.println(dto1.name);
		
		ModifierRunner inher = new ModifierRunner();
		System.out.println(inher.number);

	}

}
