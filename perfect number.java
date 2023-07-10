class per
{
public static void main(String[]arg)
{
int n=6;
int i,sum=0;
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
{
System.out.println("its a perfect Number");
}
else
{
System.out.println("its not perfect Number");
}
}
}
