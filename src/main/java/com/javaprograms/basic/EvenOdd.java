package com.javaprograms.basic;

import java.util.Scanner;
//commit 6
public class EvenOdd {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scannerInput=new Scanner(System.in);
		
		System.out.println("Please enter number:");
		int value=scannerInput.nextInt();
		
		if(value % 2==0) {
			
			
			System.out.println("Entered number is Number even");
			
		}
		else {
			System.out.println("Entered number is Number odd");

		}
		
	}
}
