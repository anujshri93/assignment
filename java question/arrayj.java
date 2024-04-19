import java.util.Scanner;
import java.util.Arrays;
 class arrayj
{
	public static void main(String[] args) {
	   // int a[]={ 10, 20,30,40, 50};
	    int a[]=new int[5];
	    System.out.print("enter Array no.");
	    Scanner s= new Scanner (System.in);
	    for(int i=0; i<5;i++)
	    {
	       a[i]=s.nextInt();
	    }
	    Arrays.sort(a);
	    System.out.print("\nArray element + ");
	    for (int b: a)
	     System.out.print(b+" ");
	       
	
	}

}
