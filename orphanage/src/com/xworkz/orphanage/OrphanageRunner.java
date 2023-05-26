package com.xworkz.orphanage;

import com.xworkz.orphanage.constant.ArrayHaveNoSpaceException;
import com.xworkz.orphanage.constant.DtoIsNullException;
import com.xworkz.orphanage.constant.getOrphanageNameIsNotEqualToOldNameException;
import com.xworkz.orphanage.constant.getOrphanageTypeIsNull;
import com.xworkz.orphanage.constant.nameNotFoundException;
import com.xworkz.orphanage.dao.OrphanageDao;
import com.xworkz.orphanage.dto.OrphanageDto;

public class OrphanageRunner {

	public static void main(String[] args) {
		OrphanageDto dto = new OrphanageDto("HappyHome", 50, "ulaga", "child", 9360389212L);
		OrphanageDao dao = new OrphanageDao();
		try {
			dao.save_data(dto);
		} catch (DtoIsNullException e) {

			e.printStackTrace();
		} catch (ArrayHaveNoSpaceException e) {
			e.printStackTrace();

		}
		OrphanageDto[] read_result = dao.read_all();
		for (int i = 0; i < read_result.length; i++) {
			if (read_result[i] != null) {
				System.out.println(read_result[i]);
			}

		}
		System.out.println("-------------find by name---------------");
		try {
			dao.findByName("HappyHome");
		} catch (nameNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("---------uppdate-------");
			dao.updateByName("HappyHome", "wellcome");
			OrphanageDto[] update_result = dao.read_all();
			for (int i = 0; i < update_result.length; i++) {
				if (update_result[i] != null) {
					System.out.println(update_result[i]);
				}

			}

		} catch (getOrphanageNameIsNotEqualToOldNameException e) {

			e.printStackTrace();
		}
		try {
			System.out.println("-----------delete-----------");
			dao.delete("Happy Home");
			OrphanageDto[] delete_result = dao.read_all();
			for (int i = 0; i < delete_result.length; i++) {
				if (delete_result[i] != null) {
					System.out.println(delete_result[i]);
				}

			}
		} catch (getOrphanageTypeIsNull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
