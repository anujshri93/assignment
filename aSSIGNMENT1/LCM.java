import java.util.*;

public class LCM{

static int lcm(int a, int b, int m)
{

m = m+b;
if ((m % a ==0) && (m % b==0))
return m;

return lcm(a, b, m);
}

public static void main(String[] args){
int a,b;
int m=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number");
 a = sc.nextInt();
 b= sc.nextInt();
int j= lcm (a, b, m);
System.out.println(j);

}



}