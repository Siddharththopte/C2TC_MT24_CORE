package com.cg.core;

import java.util.Scanner;

public class FactorialOfaNumber {

	public static void main(String[] args) {
		 int i,fact=1;  
		 System.out.println("Enter any number");
			Scanner sc=new Scanner(System.in);

			int number=sc.nextInt();   
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);   

	}
	}

