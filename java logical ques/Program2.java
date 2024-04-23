package com.example;

import java.util.Scanner;


public class Program2 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Inverted Pyramid Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Hollow Inverted Pyramid Star Pattern");
		
		for (int i = rows ; i > 0; i-- ) 
		{
			for (int j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (int k = 1 ; k <= (2 * i) - 1; k++ ) 
			{
				if(i == 1 || i == rows || k == 1 || k == (2 * i) - 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}