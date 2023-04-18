package com.xworkz.AccessSpecifier;

public class Movies {
	
	public static String moviename = "LailaMajnu";
	private static String Director = "ulaga";
	protected static long budget = 100000000000000L;
	static String heroName = "kiran";
	
	public String producer = "varun";
	private int heroSalary = 10000000;
	protected String heronie = "ScarlettJohansson";
	String story = "love";
	
	public static void givePublic(){
		System.out.println("          public Access Specifier"       );
		System.out.println(moviename);
			
	}
	public static void getPrivate(){
		System.out.println("          private Access Specifier"       );
		System.out.println(Director);
			
	}
	public void getpublic(){
		System.out.println("          private Access Specifier from non static"       );
		System.out.println(producer);
		System.out.println("          private Access Specifier from non static"       );
		System.out.println(heroSalary);
		
			
	}
}

