import java.util.*;
class atm
{
public static void main(String[]args)
{
Scanner a=new Scanner(System.in);
System.out.println("enter 1st denomination");
int d1=a.nextInt();
System.out.println("enter 1st denomination no. of nots");
int n1=a.nextInt();
System.out.println("enter 2nd denomination");
int d2=a.nextInt();
System.out.println("enter 2nd denomination no. of nots");
int n2=a.nextInt();
System.out.println("enter 3rd denomination");
int d3=a.nextInt();
System.out.println("enter 3rd denomination no. of nots");
int n3=a.nextInt();
System.out.println("enter 4th denomination");
int d4=a.nextInt();
System.out.println("enter 4th denomination no. of nots");
int n4=a.nextInt();
int total=(d1*n1)+(d2*n2)+(d3*n3)+(d4*n4);
System.out.println("the total amount in ATM:"+total);
}
}
