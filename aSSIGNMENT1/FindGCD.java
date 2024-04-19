import java.util.Scanner;
public class FindGCD
{

private static int findGCD (int a, int b)
{

if( a  % b ==0)
return b;
else 
return findGCD(b,a%b);
}


public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two value");
int a = sc.nextInt();
int b = sc.nextInt();
int g = findGCD(a,b);
System.out.println("GCD	:"  +g);

}
}
