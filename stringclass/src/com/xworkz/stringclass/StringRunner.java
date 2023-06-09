package com.xworkz.stringclass;

public class StringRunner {

	String name = "java is a programing language";

	public void StringReverse() {
		char[] a = name.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}

	public void count() {
		char[] b = name.toCharArray();
		System.out.println("count:" + b.length);
	}

	public void vowles() {
		char[] c = name.toCharArray();
		for (int i = 0; i <= c.length - 1; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				// name++;
				System.out.print(c[i]);
			}

		}
	}

	public void countVowlesAndConsonant() {
		int vowles = 0;
		int consonant = 0;
		char[] d = name.toCharArray();
		for (int i = 0; i < d.length; i++) {
			if (d[i] == 'a' || d[i] == 'e' || d[i] == 'i' || d[i] == 'o' || d[i] == 'u') {
				vowles++;

			} else {
				if (d[i] >= 'a' && d[i] <= 'z') {
					consonant++;
				}
			}
		}
		System.out.println("vowels: " + vowles);
		System.out.println("consonants: " + consonant);
	}

	public void splitString() {
		String[] words=name.split("\\s");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		}
	}
