package com.xworkz.exp;

import com.xworkz.exp.constand.InvadidExp;

public class Exception {
	String[] names = new String[1];

	public boolean ownMethod(String name) throws InvadidExp {
		if (name == null) {
			for (int i = 0; i < names.length; i++) {
				if (names[i] == null) {
					names[i] = name;
				}
			}

		}
		throw new InvadidExp("check the name");

	}

}
