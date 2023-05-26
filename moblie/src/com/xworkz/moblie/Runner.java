package com.xworkz.moblie;

import com.xworkz.moblie.interfaces.I_Phone;
import com.xworkz.moblie.interfaces.MobileInterface;
import com.xworkz.moblie.interfaces.SamSung;

public class Runner {

	public static void main(String[] args) {
		
		MobileInterface moblie = new SamSung();
		moblie.call();
		moblie.message();
		moblie.game();
		
		
		I_Phone smartPhone = new I_Phone();
		smartPhone.call();
		smartPhone.message();
		smartPhone.game();
		smartPhone.fingerPrint();
		smartPhone.touch_screen();
		

	}

}
