package com.xwork.tests;

public class IntersectionArray {
	public static void main(String args[]) {
	      int[] view1 = {23,34,45,56,67,78};
	      int[] view2 = {78,54,657,868,758};
	      
	      for(int u = 0; u<view1.length; u++ )  
	      for(int v = 0; v<view2.length; v++) 
	      if(view1[u]==view2[v]) {
	    	  System.out.println(view2[v]);  
	      }
	}

}
