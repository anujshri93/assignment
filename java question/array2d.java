import java.util.Scanner;
import java.util.Arrays;
 class array2D
{
	public static void main(String[] args) {
	   // int a[]={ 10, 20,30,40, 50};
	    int a[][]=new int[5][6];
	    System.out.print("enter Array no.");
	    Scanner s= new Scanner (System.in);
	  
	    System.out.print("\nMatrix element + ");
	  for(int i=0; i<4;i++)
	    {
	      for(int j=0; j<i;j++)
	      {
	          a[i][j]=s.nextInt();
	          
	    //   Arrays.sort(a); 
	     System.out.print(a[i][j]+" ");
	    }
	   
	    }
	     
	   //    for(int i=0; i<4;i++)
	   // {
	   //   for(int j=i; j<4;j++)
	   //   {
	   //     System.out.print(a[i][j]+" ");
	          
	   // //   Arrays.sort(a); 
	   // }
	    // System.out.print(a[i][j]+" ");
	    }
	}


