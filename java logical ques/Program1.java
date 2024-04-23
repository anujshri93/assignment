package com.example;

import java.util.Scanner;

public class Program1 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please Enter Hollow Pyramid Pattern Rows = ");
			int rows = sc.nextInt();
			
			System.out.println("---- Printing Hollow Pyramid Pattern of Stars ----");
			int i, j, k;
			

			
			
			for(i=0;i<rows;i++) {
				for(j=0;j<rows-i-1;j++) {
					System.out.print(" ");
					}
				
					if(i!=rows-1) {
					for(k=0;k<2*i+1;k++) {
					if(k==0 || k==2*i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					}
					}
					
					else {
						for(k=0;k<2*i+1;k++) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
				
			}
}
			
//			for (i = 1 ; i <= rows; i++ ) 
//			{
//				for (j = 1 ; j <= rows - i; j++ ) 
//				{
//					System.out.print(" ");
//				}
//				if(i == 1 || i == rows) {
//					for (k = 1 ; k <= (i * 2) - 1; k++ ) 
//					{
//						System.out.print("*");
//					}
//				}
//				else {
//					for (k = 1; k <= (i * 2) - 1; k++ ) 
//					{
//						if(k == 1 || k == i * 2 - 1) {
//							System.out.print("*");
//						}
//						else {
//							System.out.print(" ");
//						}
//					}
//				}		
//				System.out.println();
//			}
		


