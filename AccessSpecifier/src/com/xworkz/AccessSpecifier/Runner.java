package com.xworkz.AccessSpecifier;

import com.xworkz.AccessSpecifier.Package2.Laila;

public class Runner {

	public static void main(String[] args) {
		
		Movies.givePublic();
		Movies.getPrivate();
		LailaMajnu.getDefault();
		System.out.println("          protected Access Specifier"       );
		System.out.println(Movies.budget);
		
		Movies mov = new Movies();
		
		
		System.out.println("          protected Access Specifier from non static"       );
		System.out.println(mov.heronie);
		mov.getpublic();
		System.out.println("          Default Access Specifier from non static"       );
		System.out.println(mov.story);
		
		Laila laila = new Laila();
		
		laila.getLove();
		laila.getHero();
		laila.getHeroine();
		laila.alwaysProblem();

	}

}
