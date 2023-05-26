package com.xworkz.moblie.interfaces;

public class I_Phone implements SmartPhoneInterface {

	@Override
	public void call() {
		System.out.println("make a call  [i_phone]");

	}

	@Override
	public void message() {
		System.out.println("make a message  [i_phone]");

	}

	@Override
	public void game() {
		System.out.println("play games  [i_phone]");

	}

	@Override
	public void fingerPrint() {
		System.out.println("finger scan with quckely  [i_phone]");

	}

	@Override
	public void touch_screen() {
		float display = 6.5f;
		System.out.println("screen size for  [i_phone]" + display);

	}

}
