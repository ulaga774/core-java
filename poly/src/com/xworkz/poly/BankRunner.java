package com.xworkz.poly;

import com.xworkz.poly.dao.Bank;
import com.xworkz.poly.dao.Canara;
import com.xworkz.poly.dao.HDFC;
import com.xworkz.poly.dao.SBI;

public class BankRunner {

	public static void main(String[] args) {
		Bank bank = new Bank();
		SBI sbi = new SBI();
		
		System.out.println(sbi.rateOfInterset(34.46d));
		
		
		
		Canara canara = new Canara();
		System.out.println(canara.rateOfInterset(34.46d)+"canara");
		
		
		HDFC hdfc = new HDFC();
		System.out.println(hdfc.rateOfInterset(34.46d)+"hdfc");
		
		
		
		
	
		

	}

}
