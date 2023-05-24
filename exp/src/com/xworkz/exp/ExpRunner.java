package com.xworkz.exp;

import com.xworkz.exp.constand.InvadidExp;

public class ExpRunner {

	public static void main(String[] args) {
		Exception exp_1 = new Exception();
		
		try {
			exp_1.ownMethod("ulaga");
		} catch (InvadidExp e) {
			
			e.printStackTrace();
		}
		

	}

}
