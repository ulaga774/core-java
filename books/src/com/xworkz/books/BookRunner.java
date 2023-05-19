package com.xworkz.books;

import com.xworkz.books.dao.BookDao;
import com.xworkz.books.dao.BookDaoTwo;
import com.xworkz.books.dao.Dao;
import com.xworkz.books.dto.BookDto;

public class BookRunner {

	public static void main(String[] args) {
		BookDto dto = new BookDto("harryPotter", 1000, "thriller", "ulaga", "black");

		BookDto dto2 = new BookDto("positiveThings", 10000, "life", "apj", "white");
//		System.out.println("-----------------------55555555555555--------------------------");
//		Dao ref = new Dao();
//		ref.save_data(dto2);
//		boolean ref1 = ref.delete(null);
//		System.out.println(ref1);
//		System.out.println("------------------------------------------------------------------------------");
		
		
		BookDaoTwo dao_two = new BookDaoTwo();
		dao_two.save_data(dto2);
		System.out.println("-----------read the value in daoTwo-----------");
		BookDto[] read_result = dao_two.readAll();
		System.out.println("-----------find value in daoTwo-----------");
		boolean find_result1 = dao_two.find("apj");
		System.out.println(find_result1);
		System.out.println("--------------update in daotwo------------");
		boolean update_result1 = dao_two.update("apj", "butha");
		System.out.println(update_result1);
		dao_two.readAll();
		System.out.println("--------------delete-----------");
		boolean delete_result1 = dao_two.delete(null);
		System.out.println(delete_result1);
		dao_two.readAll();

		System.out.println("------------------------------------------------------------");
		BookDao dao = new BookDao();
		dao.save_data(dto);
		System.out.println("-----------find value in dao-----------");
		boolean find_result = dao.find("harryPotter");
		System.out.println(find_result);
		System.out.println("---------------update in dao-------------");
		boolean update_result = dao.update("harryPotter", "before1947_junkoFaruto");
		System.out.println(update_result);
		System.out.println("---------delete-------------");
		boolean delete_result = dao.delete("black");
		System.out.println(delete_result);
		System.out.println("--------------read the value in dao----------");
		BookDto[] dto_result = dao.readAll();
		for (int i = 0; i < dto_result.length; i++) {
			if (dto_result[i] != null) {
				System.out.println(dto_result[i]);

			}
		}
	}
	
	
	
	
}
