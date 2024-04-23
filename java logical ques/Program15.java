package com.example;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,i,j;
		for( i=1;i<=n;i++) {
			if(i==1) {
				for(j=1;j<=n;j++) {
					System.out.print(j+" ");
				}
			}
			else {
			for(j=1;j<=i-1;j++)
				System.out.print(" ");
			for(j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			}
			
			System.out.println();
		}
	}

}
/*
1 2 3 4 5 6 
2 3 4 5 6 
 3 4 5 6 
  4 5 6 
   5 6 
    6 
*/