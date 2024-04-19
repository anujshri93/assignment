import java.util.Scanner;
import java.util.Arrays;
class array2D
{
	public static void main(String[] args) {
	   // int a[]={ 10, 20,30,40, 50};
	    int a[][]=new int[5][6];
	    System.out.print("enter Array no.");
	    Scanner s= new Scanner (System.in);
	  
	   
	  for(int i=0; i<2;i++)
	    {
	      for(int j=0; j<2;j++)
	      {
	          a[i][j]=s.nextInt();
	          
	    //   Arrays.sort(a); 
	   //  System.out.print(a[i][j]+" ");
	   
	    }
	   
	    }
	     System.out.print("\nMatrix element \n");
	     
	       for(int i=0; i<2;i++)
	    {
	      for(int j=0; j<2;j++)
	      {
	        System.out.print(a[i][j]+" ");;
	          
	      Arrays.sort(a); 
	    }
	     System.out.println();
	    }
	}
}