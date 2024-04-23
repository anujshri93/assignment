package com.example;

public class Program12 {

	public static void main(String[] args) {
		int n=5,num=65,i,j;
		for( i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
			System.out.print(" ");
			
			}
			for(j=1;j<=i;j++) {
				System.out.print((char)num+" ");
				num++;
			}
			num=65;
			System.out.println();
		}
	}

}
/*
 
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F

 */
 