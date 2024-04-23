package com.example;

public class Program7 {

	public static void main(String[] args) {
		int n=5;
		int flag=1;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				for(int j=1;j<=n;j++) {
					if(j%2==0) {
						System.out.print("1");
						}
					else {
						System.out.print("0");
					}
				}
			}
			else {
				for(int j=1;j<=n;j++) {
					if(j%2==0) {
						System.out.print("0");
						}
					else {
						System.out.print("1");
					}
				}
			}
			System.out.println();
		}
	}
	
}
/*
10101
01010
10101
01010
10101

*/