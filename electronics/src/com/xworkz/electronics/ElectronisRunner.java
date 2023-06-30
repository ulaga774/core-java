package com.xworkz.electronics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.xworkz.electronics.dto.ElectronicsDto;
import com.xworkz.electronics.utill.DateComparator;
import com.xworkz.electronics.utill.PriceComparator;
import com.xworkz.electronics.utill.WarrantyComparator;

public class ElectronisRunner {

	public static void main(String[] args) {
		ElectronicsDto dto = new ElectronicsDto("TV", 1510, 12345L, 11.5f, 1);
		ElectronicsDto dto1 = new ElectronicsDto("hooper", 1509, 12345L, 2.5f, 2);
		ElectronicsDto dto2 = new ElectronicsDto("speaker", 1508, 12345L, 3.5f, 3);
		ElectronicsDto dto3 = new ElectronicsDto("lap", 1507, 12345L, 5.5f, 4);
		ElectronicsDto dto4 = new ElectronicsDto("mobile", 1506, 12345L, 4.5f, 5);
		ElectronicsDto dto5 = new ElectronicsDto("computer", 1505, 12345L, 6.5f, 6);
		ElectronicsDto dto6 = new ElectronicsDto("tab", 1504, 12345L, 8.5f, 7);
		ElectronicsDto dto7 = new ElectronicsDto("fan", 1503, 12345L, 7.5f, 8);
		ElectronicsDto dto8 = new ElectronicsDto("light", 1502, 12345L, 9.5f, 9);
		ElectronicsDto dto9 = new ElectronicsDto("Refergirator", 1501, 12345L, 10.5f, 10);
		ElectronicsDto dto10 = new ElectronicsDto("washingMachine", 1500, 12345L, 1.5f, 11);

		List<ElectronicsDto> list = Arrays.asList(dto, dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10);
//	
//		PriceComparator price = new PriceComparator();
//		Collections.sort(list,price);

//		DateComparator date = new DateComparator();
//		Collections.sort(list, date);

		WarrantyComparator warranty = new WarrantyComparator();
		Collections.sort(list, warranty);

		for (ElectronicsDto Dto : list) {
			System.out.println(Dto);

		}

	}

}
