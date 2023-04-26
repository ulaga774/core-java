package com.xworkz.VikramMovie.Doa;

public class VikramMovieDoa {
	
	String[] movieType = new String[10];
	
	public String[] saveString (String str) {
		if(str!=null && str.length()>3) {
		
			for (int i=0;i<movieType.length;i++) {
		if(movieType[i]==null) {
		movieType[i]=str;
		return movieType;
		}
	}
		
		}System.out.println("not exe");
			return movieType;
		}
	
	
		
	public void read() {
		for(int u=0;u<movieType.length;u++) {
			System.out.println(movieType[u]);
		}
	}

}
