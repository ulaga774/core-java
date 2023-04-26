package com.xworkz.VikramMovie;

import com.xworkz.VikramMovie.Doa.VikramMovieDoa;

public class MovieRunner {
	public static void main(String[] args) {
		VikramMovieDoa ref = new VikramMovieDoa();
		ref.saveString("action");
		ref.saveString("triller");
		ref.saveString("crime");
		ref.saveString("jg");
		ref.saveString("love");
		ref.saveString("hg");
		
		
		ref.read();
		
		
		
		
	}

}
