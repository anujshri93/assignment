package com.example;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter  Rows = ");
		int rows = sc.nextInt();//7
		rows=rows+1;//8
		int n=rows/2;//4
		int i,j;
		for( i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			if(i==1) {
				System.out.print(i+" ");
			}
			else  {
				int count=i;
				//for(int k=1;k<=2*i+1;k++) {
					while(count>=1) {
						System.out.print(count+" ");
						count--;
					}
					count=1;
					if(count==1) {
						while(count!=i) {
							count++;
							System.out.print(count+" ");
						}
					}
				//}
			}
			System.out.println();
		}
		for(i=1;i<=n-1;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
				int count=n-i;
				while(count>=1) {
					System.out.print(count+" ");
					count--;
				}
				count=1;
				if(count==1) {
					while(count<n-i) {//3
						count++;
						System.out.print(count+" ");
					}
				}
			
			System.out.println();
		}
				
	}
}
