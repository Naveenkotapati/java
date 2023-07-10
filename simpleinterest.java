import java.util.*;
class simple
{
public static void main(String[]args)
{
Scanner a=new Scanner(System.in);
int amou=a.nextInt();
int time=a.nextInt();
char age=a.next().charAt(0);
if(age=='y'||age=='Y')
{
int r=12;
int i=(amou*time*r)/100;
System.out.println("intrest"+i);
}
if(age=='n'||age=='N')
{
int r=10;
int i=(amou*time*r)/100;
System.out.println("intrest"+i);
}
else 
{
System.out.println("invalid inputs");
}
}
}
