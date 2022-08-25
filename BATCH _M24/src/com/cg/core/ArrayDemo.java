package com.cg.core;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] sid1= {10,55,44,88,13,28,68,74};
		
		System.out.println("sid1 Array is");
		

		for (int num:sid1)
		{
			System.out.println(num+ "");
			
			
		}
		int [] sid2= {14,27,38,42,58,83,63} ;
		
		System.out.println("sid2 array is");
		
		for (int num:sid2)
		{
			System.out.println(num+ "");
			
			
		}
			
 boolean d= Arrays.equals(sid1, sid2);


System.out.println(" when two arrays is Equal" +d);

	}

}
