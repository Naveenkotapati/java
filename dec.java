import java.util.*;
class dec
{
public static void main(String[]args)
{
Scanner a=new Scanner(System.in);
int n=a.nextInt();
String binary=Integer.toBinaryString(n);
String octal=Integer.toOctalString(n);
System.out.println(binary);
System.out.println(octal);
}
}
