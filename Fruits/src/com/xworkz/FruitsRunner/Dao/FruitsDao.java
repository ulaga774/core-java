package com.xworkz.FruitsRunner.Dao;

public class FruitsDao {

	String[] Fruit = new String[5];

	public String[] SaveString(String ref) {

		for (int i = 0; i < Fruit.length; i++) {
			if (Fruit[i] == null) {
				Fruit[i] = ref;
				return Fruit;

			}

		}

		return Fruit;

	}

	public void read() {

		for(int i=0;i<Fruit.length;i++) {
			System.out.println(Fruit[i]);	
		}

	}

 public boolean UpdateByIndex(String name,int index) {
	 if(Fruit!=null) {
		 Fruit[index] = name;
		 
		 return true; 
	 }
	 return false;
	 
 }
	
public boolean UpdateByName(String name,String newName) {	
    for(int i=0;i<Fruit.length;i++) {
    	
	if(Fruit[i].equals(name)) {
    
		Fruit[i] = newName;
		return true;
    }
    }
	return false;
} 

public boolean DeleteByIndex(int index) {
 if(Fruit!=null) {
	 
	 Fruit[index] = null; 
	 return true;
 }
return false;
}
public boolean DeleteByName(String RefName) {
	for(int i=0;i<Fruit.length;i++) {
		if(Fruit[i].equals(RefName)) {
			Fruit[i] = null;
			return true;
		}
		
	}
	return false;
}
public boolean SearchName(String srch) {
	
	for(int i=0;i<Fruit.length;i++) {
		if(Fruit[i].equals(srch)) {
			Fruit[i] = srch;
			System.out.println("value found");
			return true;
			
		}
	}
	System.out.println("value not found");
	return false;
	
}


}