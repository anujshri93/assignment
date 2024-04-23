package com.example;

public class Program10 {
	public static void main(String args[]) {
		char ch='A';
		int charint=ch;
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)charint+" ");
			}
			charint++;

			System.out.println();
		}
	}
}

/*A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F */
