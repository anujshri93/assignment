package com.example;

public class Program11 {

	public static void main(String[] args) {
		int n=5,num=65,i,j;
		for( i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print((char)num+" ");
				num++;
			}
			num=65;
			System.out.println();
		}
		num=65;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print((char)num+" ");
				num++;
			}
			num=65;
			System.out.println();
		}
	}

}
