package com.cg.core;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfMethod {

	public static void main(String[] args) {
		
		int sid[]=new int[10];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Data in Array ");
		
		for (int i=0;i<sid.length;i++)
		{
			sid[i]=sc.nextInt();
		}
    int sid2[]=Arrays.copyOf(sid,10);
    
    System.out.println("Data in Array2 ");
    
    		for(int i=0;i<sid2.length;i++)
    		{
    			System.out.println(sid2[i]+"");
    		}
	}

}
