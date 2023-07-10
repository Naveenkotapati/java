class arms
{
public static void main(String[]arg)
{
int n=15;
int t=n;
int sum=0;
int rem;
while(n>0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==t)
{
System.out.println("Its a Armstrong Number");
}
else
{
System.out.println("Its a not Armstrong Number");
}
}
}

