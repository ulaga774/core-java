package com.xworkz.aggregation;

public class Runner {
	public static void main(String[] args) {
		Hospital hos = new Hospital();
		hos.name="mr varun Kumar BE mecanical";
		hos.contactNumber=9360389212l;
		hos.place="houru";
		
		System.out.println(hos.contactNumber);
		
		Doctors doc = new Doctors();
		System.out.println(doc.docName);
		System.out.println(doc.phNumber);
		System.out.println(doc.specialist);
		System.out.println(doc.shitftHours);
		System.out.println(doc.salary);
		
		Paitient pai = new Paitient();
		pai.paName="varun";
		pai.problem="kindy failue";
		pai.fee=2;
		pai.gender="male";
		pai.age=24;
		
		Employee worker = new Employee();
		worker.emName="ulaga";
		worker.punchInTime=8.30f;
		worker.punchOutTime=5.30d;
		worker.uniformColour="blue";
		worker.salary=15000;
		
		Treatment treat =new Treatment();
		treat.treatmentHours=6;
		treat.fees=12000;
		treat.operationName="heartSerqery";
		treat.place="nearByHeart";
		
		
		
		
	}

}
