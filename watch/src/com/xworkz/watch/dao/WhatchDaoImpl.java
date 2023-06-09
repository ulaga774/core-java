package com.xworkz.watch.dao;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.watch.dto.WatchDto;

public class WhatchDaoImpl implements WatchDao {

	LinkedList<WatchDto> list = new LinkedList<WatchDto>();

	public boolean save(WatchDto dto) {
		if (dto != null) {
			list.add(dto);
			System.out.println("saved");
			return true;
		}
		System.out.println("dto is null");
		return false;
	}

	public LinkedList<WatchDto> read() {
		return list;
	}

	public WatchDto find(String findBrand) {
		if (findBrand != null) {
			for (WatchDto dto : list) {
				if (dto.getBrand().equals(findBrand)) {
					return dto;
				}
			

			}
		}
		System.out.println("find brand is null");
		return null;
	}

	public WatchDto update(String brand, String colour, String updateType) {
		if (brand != null) {
			Iterator<WatchDto> itr = list.iterator();
			while (itr.hasNext()) {
				WatchDto dto = (WatchDto) itr.next();
				if (dto.getBrand() != null) {
					if (dto.getColour() != null) {
						if (dto.getBrand().equals(brand)) {
							if (dto.getColour().equals(colour)) {
								dto.setType(updateType);
								System.out.println("updated");
								return dto;
							}
						}
					}
				}
			}

		}

		return null;
	}

	public LinkedList<WatchDto> delete(String delete) {
		if (delete != null) {
			Iterator<WatchDto> itr = list.iterator();
			while (itr.hasNext()) {
				WatchDto dto = (WatchDto) itr.next();
				if (dto.getBrand().equals(delete)) {
					itr.remove();
					return list;
				}

			}
		}
		return null;

	}

}
