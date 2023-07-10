import java.util.*;
class fib
{
public static void main(String[]arg)
{
Scanner ab=new Scanner(System.in);
int n=ab.nextInt();
System.out.println("the fib series:");
int a=0,b=1,c,i;
for(i=0;i<=n;i++)
{

System.out.println(a);
c=a+b;
a=b;
b=c;
}
}
}
