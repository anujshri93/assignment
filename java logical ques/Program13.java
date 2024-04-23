package com.example;

public class Program13 {
	public static void main(String[] args) {
		int n=5,ch=65;
		/*for(i=1;i<=n;i++) {
			for(j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				if(j==1 || j==2*i-1)
				System.out.print((char)ch+" ");
				else 
				System.out.print(" ");
				
			}
			ch++;
			System.out.println();
		}
		for(i=1;i<=n-1;i++) {
			for(j=1;j<=i;j++)
				System.out.print("*");
			
			for(j=2;j<=2*i-1;j++) {
				if(j==2 || j==2*i-1)
				System.out.print((char)ch);
				else 
				System.out.print(" ");
				
			}
			ch++;
			System.out.println();
		}*/
		for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print character and spaces in between
            System.out.print((char) ('A' + i));
            if (i > 0) {
                // Print spaces between characters
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                // Print character except for the first line
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
		for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print character and spaces in between
            System.out.print((char) ('A' + i));
            if (i > 0) {
                // Print spaces between characters
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                // Print character except for the first line
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
    }
}
/*
     A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A


*/